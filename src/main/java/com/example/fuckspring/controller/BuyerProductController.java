package com.example.fuckspring.controller;

import com.example.fuckspring.VO.ProductInfoVO;
import com.example.fuckspring.VO.ProductVO;
import com.example.fuckspring.VO.ResultVO;
import com.example.fuckspring.dataobject.ProductCategory;
import com.example.fuckspring.dataobject.ProductInfo;
import com.example.fuckspring.service.CategoryService;
import com.example.fuckspring.service.ProductService;
import com.example.fuckspring.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *买家商品
 * */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){

        //1.查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2.查询类目(一次性查询所需)
        //List<Integer> categoryTypeList = new ArrayList<>();
        //传统取值法
//        for (ProductInfo productInfo : productInfoList){
//            categoryTypeList.add(productInfo.getCategoryType());
//        }
        //精简法(lambda)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e->e.getCategoryType())
                .collect(Collectors.toList());
       List<ProductCategory> productCategoryList =  categoryService.findByCategoryTypeIn(categoryTypeList);


        //3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();

        //遍历类目
        for (ProductCategory productCategory : productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();

            //遍历商品详情
            for (ProductInfo productInfo : productInfoList){
                //根据类目的type判断是否相等
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    //把一个对象属性里的值copy到另一个对象中去
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

}
