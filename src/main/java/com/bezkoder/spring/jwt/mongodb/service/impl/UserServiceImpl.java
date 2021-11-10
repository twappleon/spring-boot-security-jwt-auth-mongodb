package com.bezkoder.spring.jwt.mongodb.service.impl;

import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.exceptiopn.BusinessLogicException;
import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.payload.response.UserResponse;
import com.bezkoder.spring.jwt.mongodb.repository.UserRepository;
import com.bezkoder.spring.jwt.mongodb.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserResponse getById(String id) {
        Optional<User> optional = userRepository.findById(id);
        if(optional.isPresent()){
            UserResponse userResponse = new UserResponse();
            BeanUtils.copyProperties(optional.get(),userResponse);
            return userResponse;
        } else {
            throw  new BusinessLogicException(StatusEnum.USER_NOT_EXIST.getValue(),StatusEnum.USER_NOT_EXIST.getInfo(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
