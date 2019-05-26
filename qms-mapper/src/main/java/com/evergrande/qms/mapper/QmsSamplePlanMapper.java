/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSamplePlanMapper
 * Author:   liaowenlong
 * Date:     2018-07-24 14:06
 * Description: 抽样计划mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsSamplePlan;
import com.evergrande.qms.vo.QmsSampleplanVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 抽样计划mapper接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsSamplePlanMapper extends MapperBase<QmsSamplePlan> {


    /**
     * 删除 修改计划状态
     * @param qmsSampleplanVOList
     */
    void updateSamplePlan(List<QmsSampleplanVO> qmsSampleplanVOList);

    /**
     * 修改抽检计划
     * @param qmsSamplePlan
     */
    void updatePlan(QmsSamplePlan qmsSamplePlan);

    /**
     * 保存抽样计划
     * @param qmsSampleplanVO
     */
    void hold(QmsSampleplanVO qmsSampleplanVO);

    /**
     * 查询抽样计划
     * @param
     * @param qmsSampleplanVO
     * @return
     */
    List<QmsSampleplanVO> findAllList (QmsSamplePlan qmsSampleplanVO);

    /**
     * 根据计划编号查看详细信息
     * @param samplePlanCode
     * @return
     */
    QmsSamplePlan selectSamplePlanCode(String samplePlanCode);

    /**
     * 抽样计划状态跳转
     * @param qmsSampleplanVOList
     */
    void updateSamplePlanStatus(List<QmsSampleplanVO> qmsSampleplanVOList);

    /**
     * App 端  查询抽样计划
     * @param sampleType
     * @param startDate
     * @param endDate
     * @param status
     * @return
     */
    List<QmsSamplePlan> getPageList(@Param("sampleType") String sampleType, @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("status") String status);

    /**
     * 查询不合格数据<br>
     * 样品检测第一次页面选择不合格和不复检<br>
     * 样品检测第二次判定为不合格，触发生成SAP审批流程<br>
     * @param samplePlanCode
     * @param materialCode
     * @return
     */
    Map queryUnqualified(@Param("samplePlanCode") String samplePlanCode, @Param("materialCode") String materialCode);

    /**
     * pc首页根据loginName返回 抽样计划
     * @param loginName
     * @return
     */
    List<QmsSamplePlan> findIndexPage(@Param("loginName")String loginName);


    /**
     * 查询选中的（导出）数据
     * @param qmsSampleplanVO
     * @return
     */
    List<QmsSamplePlan> findExportData(QmsSampleplanVO qmsSampleplanVO);
    /**
     * 查询选中的（导出）数据数量
     * @param qmsSampleplanVO
     * @return
     */
    int  findExportCount(QmsSampleplanVO qmsSampleplanVO);

    /**
     * 修改
     * @param map
     * @return
     */
    int updateById(Map map);

    /**
     * app 推送消息用, 根据实际抽样人 查询 当前抽样地址下面的所有人员
     * @param user
     * @return
     */
    List<String> getSampleUserId(List<String> user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    QmsSamplePlan selectById(String id);

    /**
     * 根据code查询
     * @param id
     * @return
     */
    QmsSamplePlan selectByCode(String id);
}