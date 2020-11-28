package com.gqb.mybatissoucecode.controller;

import com.gqb.mybatissoucecode.entity.User;
import com.gqb.mybatissoucecode.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String  test(){
        return "success";
    }

/*    @RequestMapping("/select")
    public User select(String id){
        return userService.selectUser(id);
    }*/
}
