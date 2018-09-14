package com.example.fuckspring.service;

import com.example.fuckspring.dto.OrderDTO;

/**
 * 买家
 * @ClassName BuyerService
 * @Author Fixed
 * @Date 2018/9/11
 **/

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
