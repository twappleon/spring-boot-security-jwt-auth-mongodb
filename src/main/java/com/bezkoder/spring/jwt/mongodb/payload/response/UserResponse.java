package com.bezkoder.spring.jwt.mongodb.payload.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserResponse implements Serializable {
    private String id;
}
