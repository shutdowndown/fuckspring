package com.example.fuckspring.converter;

import com.example.fuckspring.dataobject.OrderDetail;
import com.example.fuckspring.dto.OrderDTO;
import com.example.fuckspring.enums.ResultEnum;
import com.example.fuckspring.exception.SellException;
import com.example.fuckspring.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *form转成DTO
 * @ClassName OrderForm2OrderDTOConverter
 * @Author Fixed
 * @Date 2018/9/11
 **/

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        //BeanUtils.copyProperties();属性名要一样
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e){
            log.error("[对象转换] 错误, String={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
