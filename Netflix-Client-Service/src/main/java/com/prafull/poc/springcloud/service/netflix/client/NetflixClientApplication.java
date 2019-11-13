package com.prafull.poc.springcloud.service.netflix.client;

import com.prafull.poc.springcloud.service.message.MessageServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetflixClientApplication extends MessageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixClientApplication.class, args);
    }
}
