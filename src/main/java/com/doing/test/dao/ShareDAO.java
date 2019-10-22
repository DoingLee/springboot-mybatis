package com.doing.test.dao;

import com.doing.test.dao.domain.ShareDO;
import com.doing.test.domain.query.ShareQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author doing
 */
@Component
@Mapper
public interface ShareDAO {

    /**
     * 根据指定条件查询
     *
     * @param shareQuery 分享查询条件类
     * @return 共享信息结果集合
     */

    List<ShareDO> find(ShareQuery shareQuery);

    /**
     * 新增共享信息
     *
     * @param shareDO 共享信息
     * @return 返回成功写入db的记录数
     */
    long insert(ShareDO shareDO);

    /**
     * 更新状态
     *
     * @param shareDO
     * @return
     */
    long updateStatus(ShareDO shareDO);
}
