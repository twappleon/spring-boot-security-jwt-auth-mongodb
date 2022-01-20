package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.models.RespData;
import com.bezkoder.spring.jwt.mongodb.models.dto.RoomAddDTO;
import com.bezkoder.spring.jwt.mongodb.models.dto.RoomSearchDTO;
import com.bezkoder.spring.jwt.mongodb.models.vo.RoomListVO;
import com.bezkoder.spring.jwt.mongodb.payload.request.UserAddRequest;
import com.bezkoder.spring.jwt.mongodb.payload.response.UserResponse;
import com.bezkoder.spring.jwt.mongodb.service.RoomService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
@Slf4j
@RestController
@RequestMapping("/api/room")
@Api(" API")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public RespData<RoomListVO> add(@RequestBody RoomAddDTO roomAddDTO){
        return new RespData<RoomListVO>(StatusEnum.SUCCESS.getValue(),StatusEnum.SUCCESS.getInfo(),roomService.add(roomAddDTO));
    }

    @PostMapping("list")
    public RespData<List<RoomListVO>> list(@RequestBody RoomSearchDTO roomSearchDTO){
        return new RespData<List<RoomListVO>>(StatusEnum.SUCCESS.getValue(),StatusEnum.SUCCESS.getInfo(),roomService.list(roomSearchDTO));
    }
}

