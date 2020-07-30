package com.saic20200725.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony liu
 * @description：TODO
 * @date 2020/7/25 20:30
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @RequestMapping("/show")
    public  String show(@RequestParam("username") String username,@RequestParam("age") String age){
        String res=username+age;
        System.out.println(res);
        return res;
    }
}
