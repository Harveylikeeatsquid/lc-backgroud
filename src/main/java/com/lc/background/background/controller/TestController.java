package com.lc.background.background.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hengwei.liu
 * @Date: 2023/1/23 12:33 下午
 * @Desc:
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        return "SUCCESS";
    }

}
