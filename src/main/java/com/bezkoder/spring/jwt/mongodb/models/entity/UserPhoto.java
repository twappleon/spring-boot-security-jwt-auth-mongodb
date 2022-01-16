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
@Document(collection = "user_photo")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserPhoto对象", description = "")
public class UserPhoto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String userId;

    private String title;

    private String photoLink;

    private Date createTime;


}
