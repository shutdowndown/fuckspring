package com.example.fuckspring.service.imp;

import com.example.fuckspring.dto.OrderDTO;
import com.example.fuckspring.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName PushMessageServiceImpTest
 * @Author Fixed
 * @Date 2018/9/27
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImpTest {

    @Autowired
    private PushMessageServiceImp pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() throws Exception {

        OrderDTO orderDTO = orderService.findOne("1499097346204378750");
        pushMessageService.orderStatus(orderDTO);
    }

}