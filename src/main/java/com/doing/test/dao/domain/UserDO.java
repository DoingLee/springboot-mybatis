package com.doing.test.dao.domain;

import lombok.Data;

import java.util.Objects;


/**
 * @author doing
 */
@Data
public class UserDO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户头像
     */
    private String image;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 分享次数
     */
    private String shareTimes;
    /**
     * 借用次数
     */
    private String borrowTimes;

    /**
     * 用户车位id
     */
    private Long parkId;
}
