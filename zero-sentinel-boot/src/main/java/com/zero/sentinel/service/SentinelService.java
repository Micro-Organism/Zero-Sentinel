package com.zero.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class SentinelService {

    @SentinelResource(value = "HelloWorld",blockHandler = "sayHello block")
    public String sayHello(String name) {

        return "Hello, " + name;
    }
}