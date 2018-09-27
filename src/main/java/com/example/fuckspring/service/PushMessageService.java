package com.example.fuckspring.service;

import com.example.fuckspring.dto.OrderDTO;

/**
 * 推送消息
 * @ClassName PushMessageService
 * @Author Fixed
 * @Date 2018/9/25
 **/

public interface PushMessageService {


    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);

}
