/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SyncUserMapper
 * Author:   chensheng
 * Date:     2018-08-13
 * Description: 对应数据库同步用户表：idm_sync_user表
 */
package com.evergrande.qms.mapper;
/**
 * @author chensheng
 * @create 2018/8/13
 * @since 1.0.0
 */

import com.evergrande.qms.model.SyncUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 对应同步用户表idm_sync_user表的service接口
 *
 * @author chensheng
 * @since 1.0.0
 */
@Mapper
public interface SyncUserMapper extends MapperBase<SyncUser>{

    /**
     * 根据登录账号，查询同步用户表的用户信息
     * <p>后台接口 客户端接口</p>
     *
     * @param loginName 登录账号
     * @return 同步用户
     */
    SyncUser findByLoginName(@Param("loginName") String loginName);
}