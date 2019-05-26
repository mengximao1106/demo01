/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserMenuMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 用户菜单关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsUserMenu;
import com.evergrande.qms.vo.QmsUserVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户菜单关联mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsUserMenuMapper extends MapperBase<QmsUserMenu> {

    /**
     * 批量插入用户菜单
     * @param qmsUserVo
     */
    void batchInsert(QmsUserVo qmsUserVo);

}