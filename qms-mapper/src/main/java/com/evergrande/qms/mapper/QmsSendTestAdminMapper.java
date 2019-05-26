/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSendTestAdminMapper
 * Author:   mengximao
 * Date:     2018-07-25 9:21
 * Description: 送检任务管理Mapper
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.vo.QmsSendTestAdminVO;
import com.evergrande.qms.vo.QmsInstituteInfoVO;
import com.evergrande.qms.vo.QmsSamplePlanInfoVO;
import com.evergrande.qms.vo.QmsForepartTestItemVO;
import com.evergrande.qms.vo.QmsInspectionResultInfoVO;
import com.evergrande.qms.vo.QmsSampleRecordInfoVO;
import com.evergrande.qms.vo.QmsReviewTaskVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 送检任务管理Mapper
 * @author mengximao
 * @since 1.0.0
 */
@Mapper
public interface QmsSendTestAdminMapper extends MapperBase<QmsSendTestAdminVO> {
    /**
     * 查询当前用户所在部门
     * @param loginName 用户账号
     * @return
     */
    String findDeptNameByLoginName(String loginName);

    /**
     * 模糊查询部门名称
     * @param deptName 部门名称
     * @return
     */
    List<String> findDeptByVague(@Param("deptName") String deptName);

    /**
     * 模糊查询检测院名称
     * @param instituteName 检测院名称
     * @return
     */
    List<QmsInstituteInfoVO> findInstituteByVague(@Param("instituteName") String instituteName);

    /**
     * 查询已提交委托书的计划信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    QmsSamplePlanInfoVO findIsSendPlanInfo(@Param("samplePlanCode") String samplePlanCode,
                                           @Param("materialCode") String materialCode,
                                           @Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 查询计划信息（初样检测信息头部）-待委托
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    QmsSamplePlanInfoVO findNotSendPlanInfo(@Param("samplePlanCode") String samplePlanCode,
                                            @Param("materialCode") String materialCode);

    /**
     * 查询项目未确认的初样检测信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    List<QmsForepartTestItemVO> findItemUnconfirmedInfo(@Param("samplePlanCode") String samplePlanCode,
                                                        @Param("materialCode") String materialCode);

    /**
     * 查询项目已确认的初样检测信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    List<QmsForepartTestItemVO> findItemConfirmedInfo(@Param("samplePlanCode") String samplePlanCode,
                                                      @Param("materialCode") String materialCode,
                                                      @Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 查询委托书编号
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    String findDelegationCode(@Param("inspectionOrderNum") String inspectionOrderNum);

    /**
     * 查询检测结果复核信息
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    QmsInspectionResultInfoVO findReviewInfo(@Param("samplePlanCode") String samplePlanCode,
                                             @Param("materialCode") String materialCode);

    /**
     * 查询复检抽样计划对应的原抽样计划
     * @param samplePlanCode
     * @return
     */
    String findOriginalSamplePlanCode(String samplePlanCode);

    /**
     * 查询原抽样计划 抽样记录信息
     * @param map
     * @return
     */
    QmsSampleRecordInfoVO findSampleRecordInfo(Map map);

    /**
     * 查询复核任务
     * @param qmsReviewTaskVO
     * @return
     */
    List<QmsReviewTaskVO> findReviewTaskInfo(QmsReviewTaskVO qmsReviewTaskVO);

    /**
     * 查询初检检测订单号
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @return
     */
    String findOriginalOrderNum(@Param("samplePlanCode") String samplePlanCode,
                         @Param("materialCode") String materialCode);

    /**
     * 查询送检任务 不带检测机构
     * @param qmsSendTestAdminVO
     * @return
     */
   List<QmsSendTestAdminVO> findInstituteIsNullList(QmsSendTestAdminVO qmsSendTestAdminVO);

    /**
     *  查询送检任务 带检测机构
     * @param qmsSendTestAdminVO
     * @return
     */
   List<QmsSendTestAdminVO> findInstituteIsNotNullList(QmsSendTestAdminVO qmsSendTestAdminVO);

}