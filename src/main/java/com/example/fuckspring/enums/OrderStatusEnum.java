package com.example.fuckspring.enums;

import lombok.Getter;

/**
 * @ClassName OrderStatusEnum
 * @Author Fixed
 * @Date 2018/9/8
 **/

@Getter
public enum  OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
