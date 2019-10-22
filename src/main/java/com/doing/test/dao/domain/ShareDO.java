package com.doing.test.dao.domain;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author doing
 */
@Data
public class ShareDO implements Serializable {

    private static final long serialVersionUID = -3334385405445766067L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 车位id
     */
    private Long parkId;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 共享日期
     */
    private Date shareDate;

    /**
     * 车位状态
     */
    private Integer status;
}
