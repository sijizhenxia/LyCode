package com.xlq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/10 0010.
 */
@RestController
public class HelloworldCotroller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello World quick!!!";
    }
}
