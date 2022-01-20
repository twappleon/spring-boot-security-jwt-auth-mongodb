package com.bezkoder.spring.jwt.mongodb.models.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoomAddDTO implements Serializable {
    private String memer1Id;

    private String member2Id;

    private Date createTime;
}
