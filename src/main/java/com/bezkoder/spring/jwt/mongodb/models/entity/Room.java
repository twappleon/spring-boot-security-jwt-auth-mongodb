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
@Document(collection = "room")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Room对象", description = "")
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private Integer memer1Id;

    private Integer member2Id;

    private Date createTime;

    private Date updateTime;


}
