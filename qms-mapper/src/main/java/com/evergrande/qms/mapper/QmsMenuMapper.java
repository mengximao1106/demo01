/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMenuMapper
 * Author:   王宇
 * Date:     2018-07-17 10:52
 * Description: 菜单mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 菜单mapper接口
 *
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsMenuMapper  extends MapperBase<QmsMenu>{

    /**
     * 根据用户ID 类型查菜单
     * @param map
     * @return List
     */
    List<QmsMenu> findByUserId(Map map);

    /**
     * 根据角色ID 类型查菜单
     * @param map
     * @return List
     */
    List<QmsMenu> findByRoleId(Map map);
}