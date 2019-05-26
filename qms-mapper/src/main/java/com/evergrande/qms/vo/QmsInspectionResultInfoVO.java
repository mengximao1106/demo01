/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionResultInfo
 * Author:   mengximao
 * Date:     2018-08-09 16:59
 * Description: 初检信息-检测结果VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 初检信息-检测结果VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionResultInfoVO对象",description = "初检信息-检测结果VO")
public class QmsInspectionResultInfoVO implements Serializable {

    /**
     * 委托书编号
     */
    @ApiModelProperty(value = "委托书编号", name = "delegationCode")
    private String delegationCode;

    /**
     * 检测报告编号
     */
    @ApiModelProperty(value = "检测报告编号", name = "inspectionReportCode")
    private String inspectionReportCode;

    /**
     * 校对人
     */
    @ApiModelProperty(value = "校对人", name = "checker")
    private String checker;

    /**
     * 校对结果
     */
    @ApiModelProperty(value = "校对结果", name = "checkResult")
    private String checkResult;

    /**
     * 校对时间
     */
    @ApiModelProperty(value = "校对时间", name = "checkDate")
    private Date checkDate;

    /**
     * 系统核对人
     */
    @ApiModelProperty(value = "系统核对人", name = "systemChecker")
    private String systemChecker;

    /**
     * 系统核对结果
     */
    @ApiModelProperty(value = "系统核对结果", name = "systemChecker")
    private String systemCheckResult;

    /**
     * 系统核对时间
     */
    @ApiModelProperty(value = "系统核对时间", name = "systemCheckDate")
    private Date systemCheckDate;

    /**
     * 复核人
     */
    @ApiModelProperty(value = "复核人", name = "reviewer")
    private String reviewer;

    /**
     * 复核结果
     */
    @ApiModelProperty(value = "复核结果", name = "reviewResult")
    private String reviewResult;

    /**
     * 复核时间
     */
    @ApiModelProperty(value = "复核时间", name = "recheckDate")
    private Date reviewDate;

}
