package com.kaishengit.controller;

import com.kaishengit.pojo.Admin;
import com.kaishengit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author NativeBoy
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public User getUser(){
        return restTemplate.getForObject("http://root:rootroot@127.0.0.1:8080/user/1",User.class);
    }

    @GetMapping("/admin")
    public Admin getAdmin(){
        return restTemplate.getForObject("http://root:rootroot@127.0.0.1:8080/admin/1",Admin.class);
    }
}
