/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRoleMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 角色mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsRoleMapper  extends MapperBase<QmsRole>{

    /**
     * 查询所有角色
     * @param qmsRole
     * @return List
     */
    List<QmsRole> findAllList(QmsRole qmsRole);

    /**
     * 根据名称查询角色
     * @param roleName
     * @return QmsRole
     */
    QmsRole findByRoleName(String roleName);

}