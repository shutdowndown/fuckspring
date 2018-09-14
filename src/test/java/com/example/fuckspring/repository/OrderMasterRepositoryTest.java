package com.example.fuckspring.repository;

import com.example.fuckspring.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "753963";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234");
        orderMaster.setBuyerName("Fixed");
        orderMaster.setBuyerPhone("11111111111");
        orderMaster.setBuyerAddress("shutdown");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(3.5));

        OrderMaster res = repository.save(orderMaster);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByBuyerOpenid() {

        PageRequest request = new PageRequest(1,3);

        Page<OrderMaster> res = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0,res.getTotalElements());
     //   System.out.println(res.getTotalElements());

    }
}