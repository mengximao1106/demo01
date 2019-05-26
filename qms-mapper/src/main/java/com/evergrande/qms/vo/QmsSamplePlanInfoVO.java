/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSamplePlanInfo
 * Author:   mengximao
 * Date:     2018-08-09 16:55
 * Description: 出样检测信息-抽检计划信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 初检信息-抽检计划信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsSamplePlanInfoVO对象",description = "初检信息-抽检计划信息VO")
public class QmsSamplePlanInfoVO implements Serializable {
    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialCode")
    private String materialDesc;

    /**
     * 计划行号
     */
    @ApiModelProperty(value = "计划行号", name = "rowNum")
    private Integer rowNum;

    /**
     * 计划编号
     */
    @ApiModelProperty(value = "计划编号", name = "planCode")
    private String samplePlanCode;
    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门", name = "inspectDepartment")
    private String inspectDepartment;

    /**
     * 送检人员
     */
    @ApiModelProperty(value = "送检人员", name = "inspectionSendUserName")
    private String inspectionSendUserName;

    /**
     * 送检时间
     */
    @ApiModelProperty(value = "送检时间", name = "inspectionSendTime", example = "2018-08-09")
    private String inspectionSendTime;

    /**
     * 复检标志：1-是、2-否
     */
    @ApiModelProperty(value = "复检标志：1-是、2-否", name = "recheckFlag")
    private String recheckFlag;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value = "检测机构名称", name = "instituteName")
    private String instituteName;

    /**
     * 检测订单号
     */
    @ApiModelProperty(value = "检测订单号", name = "inspectionOrderNum")
    private String inspectionOrderNum;

    /**
     * 检测订单状态
     */
    @ApiModelProperty(value = "检测订单状态", name = "orderStatus")
    private String orderStatus;

    /**
     * BPM退回或审批不通过之前的复核结果：4-不复检，5-改判为合格
     */
    @ApiModelProperty(value = "BPM退回或审批不通过之前的复核状态：4-不复检，5-改判为合格",name = "beforeReviewResult")
    private String beforeReviewResult;

    /**
     * 复核：判定原因
     */
    @ApiModelProperty(value="判定原因", name="determineReason")
    private String determineReason;

    /**
     * 校对不通过备注
     */
    @ApiModelProperty(value="校对不通过备注", name="revisionRemarks")
    private String revisionRemarks;

}
