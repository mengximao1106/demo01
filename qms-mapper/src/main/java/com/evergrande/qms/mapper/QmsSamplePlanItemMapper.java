/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: TestMapper
 * Author:   liaowenlong
 * Date:     2018-07-24 10:52
 * Description: 抽样计划检查项目mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsSamplePlanItem;
import com.evergrande.qms.vo.QmsSamplePlanItemVO;
import com.evergrande.qms.vo.QmsSampleplanVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 抽样计划检查项目mapper接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsSamplePlanItemMapper extends MapperBase<QmsSamplePlanItem> {
    /**
     * 删除检测项目
     * @param qmsSamplePlanItemList
     */
    void deleteByPrimaryKey(List<QmsSamplePlanItem> qmsSamplePlanItemList);

    /**
     * 添加抽检计划检测项目
     * @param qmsSamplePlanItemList
     */
    void addList(List<QmsSamplePlanItem> qmsSamplePlanItemList);


    /**
     * 根据id查询检测项目
     * @param id
     * @return
     */
    QmsSamplePlanItem selectByPrimaryKey(String id);


    /**
     * 根据计划编号查询计划明细id
     * @param id
     * @return
     */
    List<QmsSamplePlanItem>selectSamplePlanCode(String id);



    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<QmsSamplePlanItem> findExportData(List<String> idList);

    /**
     * 插入
     * @param record
     * @return
     */
    int insertSelective(QmsSamplePlanItem record);

    /**
     * 根据检测项目编码，查询记录
     * @param inspectionCode
     * @return
     */
    List<QmsSamplePlanItem> findByInspectionCode(String inspectionCode);
}