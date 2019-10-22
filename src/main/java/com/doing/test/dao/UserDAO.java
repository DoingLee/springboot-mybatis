package com.doing.test.dao;


import com.doing.test.dao.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author doing
 */
@Component
@Mapper
public interface UserDAO {


    /**
     * 根据用户id查找用户
     *
     * @param id
     * @return
     */
    UserDO findById(Long id);

}
