package com.example.fuckspring.repository;

import com.example.fuckspring.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderDetailRepositoryTest
 * @Author Fixed
 * @Date 2018/9/8
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("1111111");
        orderDetail.setDetailId("12313654");
        orderDetail.setProductIcon("XXXXXX.jpg");
        orderDetail.setProductId("456879");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.5));
        orderDetail.setProductQuantity(2);

        OrderDetail res = repository.save(orderDetail);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("1111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}