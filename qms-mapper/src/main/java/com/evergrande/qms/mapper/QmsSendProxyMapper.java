/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSendProxyMapper
 * Author:   mengximao
 * Date:     2018-08-04 17:57
 * Description: 待委托接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsItemAreaInfo;
import com.evergrande.qms.model.QmsInstituteInfo;
import com.evergrande.qms.model.QmsInspectionOrder;
import com.evergrande.qms.model.QmsInspectionOrderItem;
import com.evergrande.qms.model.QmsSamplePlanDetail;
import com.evergrande.qms.model.QmsOrderMaterialDetailBind;
import com.evergrande.qms.vo.QmsInspectionItemVO;
import com.evergrande.qms.vo.QmsMaterialInfoVO;
import com.evergrande.qms.vo.QmsPlanMaterialVO;
import com.evergrande.qms.vo.QmsSumbitProxyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 待委托Mapper接口
 *
 * @author mengximao
 * @since 1.0.0
 */
@Mapper
public interface QmsSendProxyMapper {
    /**
     * 查询物料信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    List<QmsMaterialInfoVO> findMaterialInfo(@Param("samplePlanCode") String samplePlanCode,
                                                @Param("materialCode") String materialCode);

    /**
     * 模糊查询物料信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param materialDesc 物料描述
     * @param loginName 用户名
     * @return
     */
    List<QmsMaterialInfoVO> findMaterialInfoByVague(@Param("samplePlanCode") String samplePlanCode,
                                                    @Param("materialCode") String materialCode,
                                                    @Param("materialDesc") String materialDesc,
                                                    @Param("loginName") String loginName);

    /**
     *  查询某物料下的所有项目
     * @param qmsPlanMaterialVO
     * @return
     */
    List<QmsItemAreaInfo> findMaterialItem(QmsPlanMaterialVO qmsPlanMaterialVO);

    /**
     * 查询检测订单信息
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    QmsSumbitProxyVO findOrderInfo(String inspectionOrderNum);

    /**
     * 查询物料信息列表
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    List<QmsMaterialInfoVO> findMateialList(@Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 查询检测机构编码  检测机构名称  检测机构省份  检测项目编码  检测金额
     * @param map
     * @return
     */
    List<QmsInstituteInfo> findInstituteInfo(Map map);

    /**
     * 带检测院名称查询检测项目信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param instituteCode 检测机构编码
     * @return
     */
    List<QmsInspectionItemVO> findInspectionItemWithInstituteName(@Param("samplePlanCode")String samplePlanCode,
                                                                  @Param("materialCode")String materialCode,
                                                                  @Param("instituteCode")String instituteCode);

    /**
     * 保存检测订单表
     * @param qmsInspectionOrder
     */
    void saveInspectionOrder(QmsInspectionOrder qmsInspectionOrder);

    /**
     * 批量保存检测订单项目表
     * @param qmsInspectionOrderItemList
     */
    void batchAddInspectionOrderItem(List<QmsInspectionOrderItem> qmsInspectionOrderItemList);

    /**
     * 更新检测订单id
     * @param qmsSamplePlanDetail
     */
    void updateInspectionOrderId(QmsSamplePlanDetail qmsSamplePlanDetail);

    /**
     * 查询计划明细id
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    String findSamplePlanDetailId(@Param("samplePlanCode")String samplePlanCode,
                                  @Param("materialCode")String materialCode);

    /**
     * 查询之前备拒绝的检测机构编码
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    List<String> findRefuseInstitute(@Param("samplePlanCode") String samplePlanCode,
                                     @Param("materialCode") String materialCode);

    /**
     * 批量保存检测订单物料明细表
     * @param qmsOrderMaterialDetailBindList
     */
    void batchAddOrderMaterialDetailBind(List<QmsOrderMaterialDetailBind> qmsOrderMaterialDetailBindList);

    /**
     * 查询物料是否已存在待确认、待收样、待检测、已检测的订单。如果存在说明已提交过。
     *@param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    Integer findIsRepeatSumibit(@Param("samplePlanCode")String samplePlanCode,
                                @Param("materialCode")String materialCode);
}