/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionOrderMapper
 * Author:   liuyongzhi
 * Date:     2018-08-07 17:00
 * Description: 检测任务mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsInspectionOrder;
import com.evergrande.qms.model.QmsInspectionOrderItem;
import com.evergrande.qms.model.QmsSamplePlanDetail;
import com.evergrande.qms.model.QmsSamplePlanHistoryState;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检测任务Mapper接口
 *
 * @author liuyongzhi
 * @create 2018-08-07 17:00
 * @since 1.0.
 */
@Mapper
public interface QmsInspectionOrderMapper {
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
     * @param inspectionOrder
     * @return
     */
    List<HashMap> exportInspectionOrder(QmsInspectionOrder inspectionOrder);

    /**
     * 获取导出数据数
     *
     * @param inspectionOrder
     * @return
     */
    int countData(QmsInspectionOrder inspectionOrder);

    /**
     * 获取订单详情
     *
     * @param params
     * @return
     */
    HashMap getInspectionOrderById(Map params);

    /**
     * 获取订单物料
     *
     * @param inspectionOrderId
     * @return
     */
    List<HashMap> findMaterialByOrderId(String inspectionOrderId);

    /**
     * 查询计划明细
     *
     * @param params
     * @return
     */
    HashMap getSamplePlanDetailById(Map params);

    /**
     * 获取检测项目
     *
     * @param params
     * @return
     */
    List<HashMap> findOrderItemByDetailId(Map params);

    /**
     * 保存检测项目
     *
     * @param orderItem
     */
    void saveInspectionOrderItem(QmsInspectionOrderItem orderItem);

    /**
     * 修改检测订单
     *
     * @param inspectionOrder
     * @return
     */
    int updateInspectionOrder(QmsInspectionOrder inspectionOrder);

    /**
     * 修改计划明细状态
     *
     * @param params
     */
    void updatePlanDetailStatus(Map params);

    /**
     * 获取订单附件
     *
     * @param params
     * @return
     */
    List<HashMap> findOtFileByOrderId(Map params);

    /**
     * 修改计划状态
     *
     * @param params
     * @return
     */
    void updateSamplePlanStatusByOrderId(Map params);

    /**
     * 修改计划明细
     *
     * @param planDetail
     * @return
     */
    int updatePlanDetail(QmsSamplePlanDetail planDetail);

    /**
     * 修改计划状态
     *
     * @param planDetail
     * @return
     */
    void updateSamplePlanStatusByDetailId(QmsSamplePlanDetail planDetail);

    /**
     * 获取订单状态
     *
     * @param planDetail
     * @return
     */
    int getOrderStatusById(QmsSamplePlanDetail planDetail);

    /**
     * 修改ot文件关系表状态
     *
     * @param params
     * @return
     */
    void updateAttachmentBind(Map params);

    /**
     * 修改ot文件表状态
     *
     * @param params
     * @return
     */
    void updateAttachment(Map params);

    /**
     * 根据计划编码查询不合格项目
     *
     * @param samplePlanCode
     * @return
     */
    List<String> queryUnqualifiedItem(String samplePlanCode);

    /**
     * 获取计划物料信息
     *
     * @param inspectionOrderId
     * @return
     */
    List<QmsSamplePlanHistoryState> findSamplePlanDetailByOrderId(String inspectionOrderId);

    /**
     * 根据‘检测院编码’获取表记录数量
     *
     * @param instituteId
     * @return
     */
    int getSizeByInstituteId(String instituteId);

    /**
     * 根据DelegationCode获取表记录数量
     *
     * @param inspectionOrder
     * @return
     */
    int getInspectionOrderCountByDelegationCode(QmsInspectionOrder inspectionOrder);
}
