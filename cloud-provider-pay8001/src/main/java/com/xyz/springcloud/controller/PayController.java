package com.xyz.springcloud.controller;

import com.xyz.springcloud.entity.Pay;
import com.xyz.springcloud.entity.Result;
import com.xyz.springcloud.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getById/{id}")
    public Result<Pay> getById(@PathVariable Long id) {
        Pay pay = payService.getById(id);
        return Result.ok("查询成功, serverPort = "+ serverPort, pay);
    }
}
