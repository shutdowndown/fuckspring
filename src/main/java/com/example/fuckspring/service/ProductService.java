package com.example.fuckspring.service;

import com.example.fuckspring.dataobject.ProductInfo;
import com.example.fuckspring.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/***
 * 商品
 * **/


public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    //后台查询，分页
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDtoList);

    //减库存
    void decreaseStock(List<CartDTO> cartDtoList);
}
