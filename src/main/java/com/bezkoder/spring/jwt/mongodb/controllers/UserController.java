package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.models.RespData;
import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.payload.response.UserResponse;
import com.bezkoder.spring.jwt.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public RespData<UserResponse> getUser(@PathVariable String id){
        return new RespData<UserResponse>(StatusEnum.SUCCESS.getValue(),StatusEnum.SUCCESS.getInfo(),userService.getById(id));
    }
}
