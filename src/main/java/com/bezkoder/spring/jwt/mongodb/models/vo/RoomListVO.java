package com.bezkoder.spring.jwt.mongodb.models.vo;

import lombok.Data;

import java.util.Date;

@Data
public class RoomListVO {
    private String memer1Id;

    private String member2Id;

    private Date createTime;
}
