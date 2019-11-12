package com.prafull.poc.springcloud.service.netflix.client;

import com.prafull.poc.springcloud.service.message.MessageServiceApplication;
import org.springframework.boot.SpringApplication;

public class NetflixClientApplication extends MessageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixClientApplication.class, args);
    }
}
