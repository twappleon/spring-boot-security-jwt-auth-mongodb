package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.service.UserPhotoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
@Slf4j
@RestController
@RequestMapping("/meetwithstranger/user-photo")
 @Api(" API")
public class UserPhotoController {

 @Autowired
 private UserPhotoService userPhotoService;


}

