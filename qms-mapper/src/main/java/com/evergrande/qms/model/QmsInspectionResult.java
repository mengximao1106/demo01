/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionResult
 * Author:   mengximao
 * Date:     2018-08-15 14:26
 * Description: 检测结果 对应qms_inspection_result表
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 检测结果 对应qms_inspection_result表
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionResult对象",description = "检测结果Model")
public class QmsInspectionResult implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键", name = "id")
    private String id;
    /**
     * 抽样计划编号
     */
    @ApiModelProperty(value = "抽样计划id",name = "samplePlanId")
    private String samplePlanCode;
    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码",name = "materialCode")
    private String materialCode;
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
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate")
    private Date updateDate;
}
