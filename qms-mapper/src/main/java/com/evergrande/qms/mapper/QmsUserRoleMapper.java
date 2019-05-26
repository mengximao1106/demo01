/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserRoleMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 用户角色关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户角色关联mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsUserRoleMapper extends MapperBase<QmsUserRole> {

    /**
     * 根据角色ID查关联用户
     * @param roleId
     * @return List
     */
    List<QmsUserRole> findByRoleId(String roleId);
}