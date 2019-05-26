/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserMenuFuncMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 用户功能关联mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsUserMenuFunc;
import com.evergrande.qms.vo.QmsUserVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户功能关联mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsUserMenuFuncMapper extends MapperBase<QmsUserMenuFunc> {

    /**
     * 批量插入用户功能
     * @param qmsUserVo
     */
    void batchInsert(QmsUserVo qmsUserVo);

}