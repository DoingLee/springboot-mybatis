package com.doing.test.service.impl;

import com.doing.test.dao.UserDAO;
import com.doing.test.dao.domain.UserDO;
import com.doing.test.domain.dto.UserDTO;
import com.doing.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author doing
 */
@Component
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO getUserInfo(Long id) {
        if (null == id) {
            LOG.error("getUserInfo id is null");
            throw new RuntimeException("用户id不能为空！");
        }

        UserDTO userDTO = new UserDTO();

        UserDO userDO = userDAO.findById(id);
        if (null == userDO) {
            LOG.error("user does not exist for id = {}", id);
            throw new RuntimeException("用户不存在！");
        }
        userDTO.setUserId(userDO.getId());
        userDTO.setParkId(userDO.getParkId());
        userDTO.setBorrowTimes(userDO.getBorrowTimes());
        userDTO.setShareTimes(userDO.getShareTimes());
        userDTO.setImage(userDO.getImage());
        userDTO.setName(userDO.getName());
        return userDTO;
    }
}
