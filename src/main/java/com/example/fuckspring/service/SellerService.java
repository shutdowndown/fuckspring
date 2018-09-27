package com.example.fuckspring.service;

import com.example.fuckspring.dataobject.SellerInfo;

/**
 * 卖家端
 * @ClassName SellerService
 * @Author Fixed
 * @Date 2018/9/25
 **/

public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);

}
