package com.xyz.springboot.controller;

import com.xyz.springboot.service.OrderService;
import com.xyz.springcloud.entity.Pay;
import com.xyz.springcloud.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("getPayById/{id}")
    public Result<Pay> getPayById(@PathVariable("id") Long id) {
        Result r = orderService.getPayById(id);
        return r;
    }
}
