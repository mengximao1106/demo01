/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: TestMapper
 * Author:   liaowenlong
 * Date:     2018-07-24 10:52
 * Description: 抽样计划明细mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsInspectionResult;
import com.evergrande.qms.model.QmsSamplePlan;
import com.evergrande.qms.model.QmsSamplePlanDetail;
import com.evergrande.qms.vo.QmsSamplePlanDetailVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 抽样计划明细mapper接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsSamplePlanDetailMapper extends MapperBase<QmsSamplePlanDetail> {
    /**
     * 修改计划明细
     * @param qmsSamplePlanDetailVOList
     */
    void updateByPrimaryKey(List<QmsSamplePlanDetailVO> qmsSamplePlanDetailVOList);
    /**
     * 根据id删除
     * @param qmsSamplePlanDetailVOList
     */
    void deleteByPrimaryKey(List<QmsSamplePlanDetailVO> qmsSamplePlanDetailVOList);

    /**
     * 新增计划明细
     * @param qmsSamplePlanDetailVOList
     */
    void add(List<QmsSamplePlanDetailVO> qmsSamplePlanDetailVOList);

    /**
     * 插入
     * @param record
     * @return
     */
    int insertSelective(QmsSamplePlanDetail record);

    /**
     * 根据物料编号查询
     * @param materialCode
     * @return
     */
    QmsSamplePlanDetail selectByPrimaryKey(String materialCode);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(QmsSamplePlanDetail record);

    /**
     * 修改计划明细状态
     * @param qmsSamplePlanDetailList
     */
   void updateStatus(List<QmsSamplePlanDetail>qmsSamplePlanDetailList);

    /**
     * 根据计划明细ID查询检测项目
     * @param id
     * @return
     */
   QmsSamplePlanDetail selectSamplePlanDetailId(String id);

    /**
     * sap 查询专用 根据物料编码 查询  全指标 对应的抽样计划创建时间
     * @param materialCode
     * @param supplierCode
     * @return
     */
    Date getCreateDateByMaterialCode(@Param("materialCode") String materialCode, @Param("supplierCode") String supplierCode);

    /**
     * app 端 抽样详情修改
     * @param map
     */
    void updateApp(Map<String, Object> map);

    /**
     * pc首页根据loginName返回 抽样计划物料
     * @param loginName
     * @return
     */
    List<Map> findIndexPage(@Param("loginName")String loginName);

    /**
     * 检测结果表新增记录
     * @param qmsInspectionResultList
     */
    void batchAddInspectionResult(List<QmsInspectionResult> qmsInspectionResultList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<QmsSamplePlanDetail> findExportData(List<String> idList);


    /**
     * 根据计划明细id获取行号
     * @param id
     * @return
     */
    QmsSamplePlanDetail selectDetailId(String id);

    /**
     * 根据id查询
     * @param detailId
     * @return
     */
    QmsSamplePlanDetail selectById(String detailId);

    /**
     * 根据编号查询计划明细
     * @param samplePlanCode
     * @return
     */
    List<QmsSamplePlanDetail>selectFindId(String samplePlanCode );

    /**
     * 查询材料类别
     * @param qmsSamplePlanDetail
     * @return
     */
    List<QmsSamplePlanDetail> selectAll (QmsSamplePlanDetail qmsSamplePlanDetail);

    /**
     * 修改流程实例
     * @param samplePlanCode
     * @param rowNum
     * @param incident
     * @param incidentStatus
     * @return
     */
    int updateIncidentByCode(@Param("samplePlanCode") String samplePlanCode, @Param("rowNum") Integer rowNum,
                             @Param("incident") String incident);

    /**
     * 查询流程实例是否为空
     * @param samplePlanCode
     * @return
     */
    Map selectBySamplePlanCode(@Param("samplePlanCode") String samplePlanCode, @Param("rowNum") Integer rowNum);

    /**
     * 根据流程实例 查询 抽样计划
     * @param incident
     * @return
     */
    QmsSamplePlanDetail selectByIncident(String incident);

    /**
     * 根据流程实例  修改  流程状态
     * @param incidentStatus
     * @param incident
     * @return
     */
    int updateIncStatusByInc(@Param("incidentStatus") Integer incidentStatus,
                             @Param("incident") String incident);

}