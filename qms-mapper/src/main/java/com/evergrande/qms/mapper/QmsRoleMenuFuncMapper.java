/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRoleMenuFuncMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 角色功能关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsRole;
import com.evergrande.qms.model.QmsRoleMenuFunc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色功能关联mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsRoleMenuFuncMapper extends MapperBase<QmsRoleMenuFunc>{

    /**
     * 批量插入角色功能
     * @param qmsRole
     */
    void batchInsert(QmsRole qmsRole);

    /**
     * 根据角色ID返回菜单
     * @param roleId
     * @return List
     */
    List<QmsRoleMenuFunc> findByRoleId(String roleId);

}