/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRoleMenuMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 角色菜单关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsRole;
import com.evergrande.qms.model.QmsRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色菜单关联mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsRoleMenuMapper extends MapperBase<QmsRoleMenu> {

    /**
     * 批量插入角色菜单
     * @param qmsRole
     */
    void batchInsert(QmsRole qmsRole);

    /**
     * 根据角色ID查询菜单
     * @param roleId
     * @return List
     */
    List<QmsRoleMenu> findByRoleId(String roleId);
}