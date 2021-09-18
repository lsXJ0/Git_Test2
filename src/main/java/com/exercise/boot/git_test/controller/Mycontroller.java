package com.exercise.boot.git_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Luo_xiuxin
 * @create 2021-09-18 15:46
 */
@Controller
public class Mycontroller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
