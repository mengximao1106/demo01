/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsReviewTaskVO
 * Author:   mengximao
 * Date:     2018-08-16 15:30
 * Description: 复核任务管理VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 复核任务管理VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsReviewTaskVO",description = "复核任务管理VO")
public class QmsReviewTaskVO implements Serializable {

    /**
     * 抽检计划编号
     */
    @ApiModelProperty(value = "抽检计划编号", name = "samplePlanCode")
    private String samplePlanCode;

    /**
     * 行号
     */
    @ApiModelProperty(value = "行号",name = "rowNum")
    private Integer rowNum;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料描述
     */
    @ApiModelProperty(value = "物料描述",name = "materialDesc")
    private String materialDesc;

    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门",name = "inspectDepartment")
    private String inspectDepartment;

    /**
     * 检测机构编码
     */
    @ApiModelProperty(value = "检测机构编码", name = "instituteCode")
    private String instituteCode;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value = "检测机构名称", name = "instituteName")
    private String instituteName;

    /**
     * 复核状态
     */
    @ApiModelProperty(value = "复核状态", name = "reviewStatus")
    private String reviewStatus;

    /**
     * 复核人
     */
    @ApiModelProperty(value = "复核人", name = "reviewer")
    private String reviewer;

    /**
     * 人工复核结果: 1-合格，2-不合格，3-复检，4-不复检，5-改判为合格
     */
    @ApiModelProperty(value = "复核结果", name = "reviewResult")
    private String reviewResult;

    /**
     * 复检标志：1-是、2-否
     */
    @ApiModelProperty(value = "复检标志：1-是、2-否", name = "reviewResult")
    private String recheckFlag;

    /**
     * 检测订单号
     */
    @ApiModelProperty(value="检测订单号", name="inspectionOrderNum")
    private String inspectionOrderNum;

    /**
     * 材料负责人id
     */
    @ApiModelProperty(value="材料负责人id", name="dutyUserId")
    private String dutyUserId;

}
