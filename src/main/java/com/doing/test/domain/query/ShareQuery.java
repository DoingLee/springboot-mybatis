package com.doing.test.domain.query;


import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * @author doing
 */
@Data
public class ShareQuery {

    private Long id;
    /**
     * 车位id
     */
    private Long parkId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 车位状态
     */
    private int status;
    /**
     * 分享日期
     */
    private Date shareDate;
    /**
     * 分享日期大于
     */
    private Date shareDateUpper;
    /**
     * 分享日期小于
     */
    private Date shareDateLower;
}
