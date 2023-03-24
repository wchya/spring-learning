package com.wch.springlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wch
 * @CreateTime: 2023-03-24  15:44
 * @Description: TODO
 * @Version: 1.0
 */

@RestController
@RequestMapping("/demo")
public class DemoController {


    @GetMapping("/hello")
    public String hello(){
        return "hello! demo";
    }
}
