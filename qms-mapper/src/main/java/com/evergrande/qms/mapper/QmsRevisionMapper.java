/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRevisionMapper
 * Author:   mengximao
 * Date:     2018-08-12 20:18
 * Description: 待校对Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsInspectionResult;
import com.evergrande.qms.model.QmsInspectionOrderItem;
import com.evergrande.qms.model.QmsSamplePlan;
import com.evergrande.qms.model.QmsSamplePlanDetail;
import com.evergrande.qms.model.QmsSamplePlanItem;
import com.evergrande.qms.vo.QmsItemResultVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 待校对Mapper接口
 *
 * @author mengximao
 * @since 1.0.0
 */
@Mapper
public interface QmsRevisionMapper {
    /**
     * 更新校对结果
     * @param qmsInspectionResult
     */
    void updateCheckResult(QmsInspectionResult qmsInspectionResult);

    /**
     * 更新系统核对结果
     * @param qmsInspectionResult
     */
    void updateSystemCheckResult(QmsInspectionResult qmsInspectionResult);

    /**
     * 查询检测要求和结果
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    List<QmsItemResultVO> findMaterialAllItem(@Param("samplePlanCode") String samplePlanCode,
                                              @Param("materialCode") String materialCode,
                                              @Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 批量更新项目单项评定
     * @param qmsInspectionOrderItemList
     */
    void batchUpdateItemEvaluate(List<QmsInspectionOrderItem> qmsInspectionOrderItemList);

    /**
     * 更新复核结果
     * @param qmsInspectionResult
     */
    void updateReviewResult(QmsInspectionResult qmsInspectionResult);

    /**
     * 查询需要复核的计划信息
     * @param samplePlanCode 计划编码
     * @return
     */
    QmsSamplePlan findSamplePlanInfo(String samplePlanCode);

    /**
     * 查询需要复核的物料信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    QmsSamplePlanDetail findSamplePlanDetailInfo(@Param("samplePlanCode") String samplePlanCode,
                                                 @Param("materialCode")  String materialCode);

    /**
     * 查询需要复核的项目信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    List<QmsSamplePlanItem> findSamplePlanItemInfo(@Param("samplePlanCode") String samplePlanCode,
                                                   @Param("materialCode")  String materialCode,
                                                   @Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 更新初检关联的复检抽样计划
     * @param samplePlanCode
     * @param sampleplanId
     */
    void updateOriginalPlan(@Param("samplePlanCode") String samplePlanCode, @Param("sampleplanId") String sampleplanId);
}