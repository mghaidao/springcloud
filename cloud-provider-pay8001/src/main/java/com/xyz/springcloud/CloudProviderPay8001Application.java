package com.xyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPay8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPay8001Application.class);
    }
}
