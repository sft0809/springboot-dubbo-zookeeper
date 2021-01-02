package com.test;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class DubboZookeeperProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboZookeeperProviderApplication.class, args);
    }

}
