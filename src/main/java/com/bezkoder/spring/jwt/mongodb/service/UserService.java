package com.bezkoder.spring.jwt.mongodb.service;

import com.bezkoder.spring.jwt.mongodb.payload.response.UserResponse;

public interface UserService {
    UserResponse getById(String id);
}
