package com.bezkoder.spring.jwt.mongodb.models.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author leonliu
 * @since 2022-01-16
 */
@Document(collection = "user_profile")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserProfile对象", description = "")
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;

    private String title;

    private String latitude;

    private String longitude;

    private String profilePhoto;

    private String bodyType;

    private String gender;

    private Date createTime;

    private Date updateTime;

    private String isOnlie;

    private String aboutMe;

    private Integer age;

    private Double height;

    private Double weight;

    private String relationState;

    private String preferDatingPlace;


}
