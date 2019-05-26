/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionItemMapper
 * Author:   liaowenlong
 * Date:     2018-09-14 15:50
 * Description: 材料标准库查询接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsInspectionItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 材料标准库查询接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsInspectionItemMapper {
    /**
     * 查询材料标准号
     * @param map
     * @return
     */
    List<QmsInspectionItem> findAll(Map map );
}