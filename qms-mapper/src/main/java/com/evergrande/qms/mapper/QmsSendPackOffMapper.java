/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSendPackOffMapper
 * Author:   mengximao
 * Date:     2018-08-04 18:01
 * Description: 待寄出Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsInspectionOrder;
import com.evergrande.qms.model.QmsSamplePlan;
import com.evergrande.qms.model.QmsSamplePlanDetail;
import com.evergrande.qms.model.QmsSamplePlanHistoryState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 待寄出Mapper接口
 *
 * @author mengximao
 * @since 1.0.0
 */
@Mapper
public interface QmsSendPackOffMapper {

    /**
     * 更新物料状态
     * @param qmsSamplePlanDetail
     */
    void updateMaterailStatus(QmsSamplePlanDetail qmsSamplePlanDetail);

    /**
     * 查询计划编码下最小的物料编码的状态
     * @param samplePlanCode 计划编码
     * @return
     */
    String findMaterialMinStatusByPlanCode(String samplePlanCode);

    /**
     * 更新qms_sample_plan status状态
     * @param qmsSamplePlan
     */
    void updateQmsSamplePlanStatus(QmsSamplePlan qmsSamplePlan);

    /**
     * 查询物料信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    QmsSamplePlanHistoryState findMaterialDetailInfo(@Param("samplePlanCode") String samplePlanCode,
                                                     @Param("materialCode") String materialCode);

    /**
     * 更新复核状态
     * @param qmsSamplePlanDetail
     */
    void updateReviewStatus(QmsSamplePlanDetail qmsSamplePlanDetail);

    /**
     * 更新检测订单状态
     * @param qmsInspectionOrder
     */
    void updateOrderStatus(QmsInspectionOrder qmsInspectionOrder);

    /**
     * 查询当前物料状态
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    QmsSamplePlanDetail findMaterialStatus(@Param("samplePlanCode") String samplePlanCode,
                       @Param("materialCode") String materialCode);
}
