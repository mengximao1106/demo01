/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Dictionary
 * Author:   liuww
 * Date:     2018-08-14
 * Description: 抽样计划状态变更记录(QmsSamplePlanHistoryState)表数据库访问层
 */
package com.evergrande.qms.mapper;


import com.evergrande.qms.model.QmsSamplePlanHistoryState;
import com.evergrande.qms.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 抽样计划状态变更记录(QmsSamplePlanHistoryState)表数据库访问层
 *
 * @author liuww
 * @since 2018-08-14
 */
@Mapper
public interface QmsSamplePlanHistoryStateMapper extends MyMapper<QmsSamplePlanHistoryState> {

}