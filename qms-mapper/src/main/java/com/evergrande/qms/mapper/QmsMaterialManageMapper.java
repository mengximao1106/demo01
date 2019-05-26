/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialManageMapper
 * Author:   liaowenlong
 * Date:     2018-09-13 8:52
 * Description: 材料管理查询接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsMaterialManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 材料管理查询接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsMaterialManageMapper  {

    /**
     * 材料信息查询
     * @param qmsMaterialManage
     * @return
     */
    List<QmsMaterialManage> findList(QmsMaterialManage qmsMaterialManage);

}