package com.example.fuckspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName WeixinController
 * @Author Fixed
 * @Date 2018/9/13
 **/

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth...");
        log.info("code={}",code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx4491e2753b46394a&secret=af3ae7184d59433f564ee405bc2f79a3&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(url,String.class);
        log.info("response={}",response);
    }
}
