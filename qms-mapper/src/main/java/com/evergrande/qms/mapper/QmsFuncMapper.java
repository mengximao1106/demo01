/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsFuncMapper
 * Author:   王宇
 * Date:     2018-07-17 10:52
 * Description: 功能mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsFunc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 功能mapper接口
 *
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsFuncMapper extends MapperBase<QmsFunc>{

    /**
     * 根据用户ID查功能
     * @param userId
     * @return List
     */
    List<QmsFunc> findByUserId(String userId);

    /**
     * 根据角色ID查功能
     * @param roleId
     * @return List
     */
    List<QmsFunc> findByRoleId(String roleId);

}