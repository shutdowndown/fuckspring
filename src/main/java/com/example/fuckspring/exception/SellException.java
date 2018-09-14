package com.example.fuckspring.exception;

import com.example.fuckspring.enums.ResultEnum;

/**
 * @ClassName SellException
 * @Author Fixed
 * @Date 2018/9/8
 **/

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
