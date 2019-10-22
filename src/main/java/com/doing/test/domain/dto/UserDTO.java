package com.doing.test.domain.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author doing
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 7968067840680364482L;

    /**
     * 用户id
     */
    private Long userId;
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

    /**
     * 车位园区
     */
    private String parkDistrict;

    /**
     * 车位号
     */
    private Long parkNumber;

    /**
     * 车位状态 0-正常 1-已共享
     */
    private Integer parkStatus;
}
