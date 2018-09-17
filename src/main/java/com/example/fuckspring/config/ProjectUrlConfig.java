package com.example.fuckspring.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName ProjectUrlConfig
 * @Author Fixed
 * @Date 2018/9/17
 **/

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /***
     *微信公众平台授权url
     */
    public String wechatMpAuthorize;

    /**
     * 微信开放平台授权url
     */

    public String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    public String sell;

}
