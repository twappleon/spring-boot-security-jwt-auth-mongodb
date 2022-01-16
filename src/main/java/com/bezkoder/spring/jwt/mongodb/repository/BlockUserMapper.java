package com.bezkoder.spring.jwt.mongodb.repository;


import com.bezkoder.spring.jwt.mongodb.models.entity.BlockUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
public interface BlockUserMapper extends MongoRepository<BlockUser,String> {

}
