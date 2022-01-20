package com.bezkoder.spring.jwt.mongodb.service;


import com.bezkoder.spring.jwt.mongodb.models.dto.RoomAddDTO;
import com.bezkoder.spring.jwt.mongodb.models.dto.RoomSearchDTO;
import com.bezkoder.spring.jwt.mongodb.models.vo.RoomListVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
public interface RoomService {

    List<RoomListVO> list(RoomSearchDTO roomSearchDTO);

    RoomListVO add(RoomAddDTO roomAddDTO);
}
