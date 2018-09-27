package com.example.fuckspring.service.imp;

import com.example.fuckspring.dataobject.SellerInfo;
import com.example.fuckspring.repository.SellerInfoRepository;
import com.example.fuckspring.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SellerServiceImp
 * @Author Fixed
 * @Date 2018/9/25
 **/

@Service
public class SellerServiceImp implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
