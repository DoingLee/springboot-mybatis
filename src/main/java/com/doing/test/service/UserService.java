package com.doing.test.service;

import com.doing.test.domain.dto.UserDTO;

/**
 * @author doing
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    UserDTO getUserInfo(Long id);

}
