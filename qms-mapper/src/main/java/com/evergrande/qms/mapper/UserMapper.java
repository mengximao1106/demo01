/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: UserMapper
 * Author:   wangyu
 * Date:     2018-07-18
 * Description: sysuser Mapper接口
 */
package com.evergrande.qms.mapper;


import com.evergrande.qms.model.User;
import com.evergrande.qms.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * sysuser Mapper接口
 *
 * @author wangyu
 * @create 2018-07-18
 * @since 1.0.0
 */
@Mapper
public interface UserMapper extends MapperBase<User> {
    /**
     * 查询部门下的员工
     * @param deptId
     * @return List
     */
    List<User> findByDeptId(String deptId);

    /**
     * 根据账号查询 用户信息
     * @param loginName
     * @return User
     */
    User findByLoginName(String loginName);

    /**
     * 根据id查询名称与部门
     * @param userId
     * @return
     */
    UserVo findById(String userId);

    /**
     * 查询所有员工
     * @return List
     */
    List<UserVo> findAllList();

    /**
     * 根据 loginName 查询 用户和部门信息
     * @param loginName
     * @return Map
     */
    Map<String, String> getUserAndDeptByLoginName(@Param("loginName") String loginName);

    /**
     * 查询idm账号不存在user表里得用户
     * @return List
     */
    List<UserVo> findUserNoExistList();
}
