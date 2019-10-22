package com.doing.test.domain.query;

import lombok.Data;

import java.util.Objects;


/**
 * @author doing
 */
@Data
public class UserQuery {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户车位id
     */
    private Long parkId;

}
