package com.example.fuckspring.dto;

import com.example.fuckspring.dataobject.OrderDetail;
import com.example.fuckspring.enums.OrderStatusEnum;
import com.example.fuckspring.enums.PayStatusEnum;
import com.example.fuckspring.utils.EnumUtil;
import com.example.fuckspring.utils.serializer.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderDTO
 * @Author Fixed
 * @Date 2018/9/8
 **/

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//不返回为空的对象
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    //订单id
    private String orderId;

    //买家姓名
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信Openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态,默认为0新下单
    private Integer orderStatus;

    //支付状态,默认为0未支付
    private Integer payStatus;

    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    //更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }

}
