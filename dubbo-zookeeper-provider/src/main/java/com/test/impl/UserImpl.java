package com.test.impl;

import com.test.api.UserAPI;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class UserImpl implements UserAPI {
    @Value("${dubbo.application.name}")
    private String serviceName;
    public String queryUserName(String userId){
        return "hello dubbo-zookeeper:"+userId;
    }
}
