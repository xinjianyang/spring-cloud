package com.kaishengit.controller;

import com.kaishengit.pojo.Admin;
import com.kaishengit.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NativeBoy
 */
@RestController
public class UserController {


    @GetMapping("/user/{id:\\d+}")
    public User getUser(@PathVariable Integer id){
        return new User(1,"jack","123456");
    }

    @GetMapping("/admin/{id:\\d+}")
    public Admin getAdmin(){
        return new Admin(100,"yangxinjian","123456789");
    }
}
