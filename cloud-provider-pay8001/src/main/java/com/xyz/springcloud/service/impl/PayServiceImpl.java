package com.xyz.springcloud.service.impl;

import com.xyz.springcloud.entity.Pay;
import com.xyz.springcloud.mapper.PayMapper;
import com.xyz.springcloud.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;

    @Override
    public Pay getById(Long id) {
        return payMapper.selectById(id);
    }
}
