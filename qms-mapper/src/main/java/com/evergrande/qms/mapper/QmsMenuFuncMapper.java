/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMenuFuncMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 菜单与功能关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsMenuFunc;
import com.evergrande.qms.vo.QmsMenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单与功能关联mapper接口
 *
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsMenuFuncMapper extends MapperBase<QmsMenuFunc>{

    /**
     * 查询所有功能
     * @param type 类型（app,pc）
     * @return List
     */
    List<QmsMenuVo> findAllList(@Param("type") Integer type);
}