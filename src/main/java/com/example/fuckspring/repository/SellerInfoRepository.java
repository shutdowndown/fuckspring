package com.example.fuckspring.repository;

import com.example.fuckspring.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName SellerInfoRepository
 * @Author Fixed
 * @Date 2018/9/25
 **/

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {

    SellerInfo findByOpenid(String openid);
}
