/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsGlobalSamplePlanQueryMapper
 * Author:   liuyongzhi
 * Date:     2018/8/27
 * Description: 抽样全局查询Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsGlobalSamplePlanQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 抽样全局查询Mapper接口
 *
 * @author liuyongzhi
 * @since 1.0.0
 */
@Mapper
public interface QmsGlobalSamplePlanQueryMapper {

    /**
     * 条件查询
     *
     * @param map
     * @return
     */
    List<HashMap> findAllList(Map map);

    /**
     * 导出数据
     *
     * @param globalSamplePlanQuery
     * @return
     */
    List<HashMap> exportData(QmsGlobalSamplePlanQuery globalSamplePlanQuery);

    /**
     * 获取导出数据数量
     *
     * @param globalSamplePlanQuery
     * @return
     */
    int countData(QmsGlobalSamplePlanQuery globalSamplePlanQuery);

}
