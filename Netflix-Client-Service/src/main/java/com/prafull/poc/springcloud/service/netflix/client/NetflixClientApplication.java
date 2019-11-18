package com.prafull.poc.springcloud.service.netflix.client;

import com.prafull.poc.springcloud.service.message.MessageServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetflixClientApplication extends MessageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixClientApplication.class, args);
    }
}
