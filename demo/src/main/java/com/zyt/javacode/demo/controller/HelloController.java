package com.zyt.javacode.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController注解相当于@Controller+@ResponseBody组合在一起使用
@RestController
@RequestMapping("/springmvc")
public class HelloController {
    @RequestMapping("hello")
    public String sayHello() {
        return "hello springboot";
    }

}
