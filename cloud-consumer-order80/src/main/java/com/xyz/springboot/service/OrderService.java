package com.xyz.springboot.service;

import com.xyz.springcloud.entity.Pay;
import com.xyz.springcloud.entity.Result;

public interface OrderService {
    Result getPayById(Long id);
}
