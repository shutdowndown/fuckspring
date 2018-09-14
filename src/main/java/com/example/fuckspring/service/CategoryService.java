package com.example.fuckspring.service;

import com.example.fuckspring.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    //查询一个
    ProductCategory findOne(Integer categoryId);

    //查询所有(后台)
    List<ProductCategory> findAll();

    //查询(买家)
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增和更新
    ProductCategory save(ProductCategory productCategory);

}
