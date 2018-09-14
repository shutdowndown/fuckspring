package com.example.fuckspring.repository;


import com.example.fuckspring.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("2353",7);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    //    Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3);
        List<ProductCategory> res = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,res.size());
    }
}