package com.bezkoder.spring.jwt.mongodb.repository;


import com.bezkoder.spring.jwt.mongodb.models.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
public interface RoomRepository extends MongoRepository<Room,String> {
    List<Room> findByMemer1Id(String memer1Id);

    List<Room> findByMemer1IdAndMember2Id(String memer1Id,String member2Id);
}
