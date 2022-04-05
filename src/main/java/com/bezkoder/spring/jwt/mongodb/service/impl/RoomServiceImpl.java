package com.bezkoder.spring.jwt.mongodb.service.impl;


import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.exceptiopn.BusinessLogicException;
import com.bezkoder.spring.jwt.mongodb.models.dto.RoomAddDTO;
import com.bezkoder.spring.jwt.mongodb.models.dto.RoomSearchDTO;
import com.bezkoder.spring.jwt.mongodb.models.entity.Room;
import com.bezkoder.spring.jwt.mongodb.models.vo.RoomListVO;
import com.bezkoder.spring.jwt.mongodb.repository.RoomRepository;
import com.bezkoder.spring.jwt.mongodb.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
@Service
@Slf4j
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;
    @Override
    public List<RoomListVO> list(RoomSearchDTO roomSearchDTO) {
        List<Room> list =  roomRepository.findByMemer1Id(roomSearchDTO.getMemer1Id());
        log.info("list:{}",list);
        List<RoomListVO> result = new ArrayList<>();
        list.stream().forEach(r->{
            RoomListVO vo = new RoomListVO();
            BeanUtils.copyProperties(r,vo);
            result.add(vo);
        });
        return result;
    }

    @Override
    public RoomListVO add(RoomAddDTO roomAddDTO) {
        List<Room> list =  roomRepository.findByMemer1IdAndMember2Id(roomAddDTO.getMemer1Id(),roomAddDTO.getMember2Id());
        log.info("list:{}",list.size());
        if(list.size() == 0) {
            Room room = new Room();
            BeanUtils.copyProperties(roomAddDTO, room);
            room.setCreateTime(new Date());
            Room r = roomRepository.save(room);
            RoomListVO vo = new RoomListVO();
            BeanUtils.copyProperties(r, vo);
            return vo;
        } else {
            throw  new BusinessLogicException(StatusEnum.ROOM_EXIST.getValue(),StatusEnum.ROOM_EXIST.getInfo(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
