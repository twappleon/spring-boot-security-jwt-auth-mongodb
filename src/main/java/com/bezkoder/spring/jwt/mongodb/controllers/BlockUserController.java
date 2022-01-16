package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.service.BlockUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/meetwithstranger/block-user")
@Api(" API")
public class BlockUserController {

    @Autowired
    private BlockUserService blockUserService;


}

