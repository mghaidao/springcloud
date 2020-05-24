package com.xyz.springboot.service.impl;

import com.xyz.springboot.service.OrderService;
import com.xyz.springcloud.entity.Pay;
import com.xyz.springcloud.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private RestTemplate restTemplate;
    //private static final String PAY_URL_PREFIX = "http://localhost:8001";
    private static final String PAY_URL_PREFIX = "http://CLOUD-PAY-SERVICE";

    @Override
    public Result getPayById(Long id) {
        ResponseEntity<Result> r = restTemplate.getForEntity(PAY_URL_PREFIX + "/pay/getById/" + id, Result.class);
        return r.getBody();
    }
}
