package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.models.RespData;
import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.payload.request.UserAddRequest;
import com.bezkoder.spring.jwt.mongodb.payload.response.UserResponse;
import com.bezkoder.spring.jwt.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public RespData<UserResponse> getUser(@PathVariable String id){
        return new RespData<UserResponse>(StatusEnum.SUCCESS.getValue(),StatusEnum.SUCCESS.getInfo(),userService.getById(id));
    }

    @PostMapping
    public RespData<UserResponse> add(@RequestBody UserAddRequest userAddRequest){
        return new RespData<UserResponse>(StatusEnum.SUCCESS.getValue(),StatusEnum.SUCCESS.getInfo(),userService.add(userAddRequest));
    }
}
