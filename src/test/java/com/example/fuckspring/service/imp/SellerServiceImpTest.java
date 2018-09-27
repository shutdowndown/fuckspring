package com.example.fuckspring.service.imp;

import com.example.fuckspring.dataobject.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName SellerServiceImpTest
 * @Author Fixed
 * @Date 2018/9/27
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerServiceImpTest {

    private static final String openid = "abc";

    @Autowired
    private SellerServiceImp sellerService;

    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        Assert.assertEquals(openid, result.getOpenid());
    }

}