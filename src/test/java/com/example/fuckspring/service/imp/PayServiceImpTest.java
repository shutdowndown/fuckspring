package com.example.fuckspring.service.imp;

import com.example.fuckspring.dto.OrderDTO;
import com.example.fuckspring.service.OrderService;
import com.example.fuckspring.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName PayServiceImpTest
 * @Author Fixed
 * @Date 2018/9/18
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImpTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1536821148219759636");
        payService.create(orderDTO);
    }

    @Test
    public void refund(){
        OrderDTO orderDTO = orderService.findOne("1536821148219759636");
        payService.refund(orderDTO);
    }
}