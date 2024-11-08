package com.zero.sentinel.controller;

import com.zero.sentinel.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SentinelController {

    @Autowired
    SentinelService sentinelService;

    @RequestMapping("/hello")
    public Map<String, Object> showHelloWorld()  {

        Map<String, Object> map = new HashMap<>();
        try {
            map.put("msg", sentinelService.sayHello("harries"));
        }catch (Exception e){
            System.out.println("sayHello blocked!");
        }
        return map;
    }
}