/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SendTestAdminVO
 * Author:   mengximao
 * Date:     2018-07-24 14:14
 * Description: 送检任务管理VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 送检任务管理VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value = "SendTestAdminVO对象", description= "送检任务管理 model")
public class QmsSendTestAdminVO implements Serializable {

    /**
     * 抽检计划编号
     */
    @ApiModelProperty(value = "抽检计划编号", name = "planCode")
    private String samplePlanCode;

    /**
     * 计划明细行号
     */
    @ApiModelProperty(value = "计划明细行号", name = "rowNum")
    private Integer rowNum;

    /**
     *物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialDesc")
    private String materialDesc;

    /**
     * 是否复检(1,是 2,否)
     */
    @ApiModelProperty(value = "是否复检(1,是 2,否)", name = "recheckFlag")
    private String recheckFlag;

    /**
     * 检测机构编码
     */
    @ApiModelProperty(value = "检测机构编码", name = "instituteCode")
    private String instituteCode;

    /**
     * 送检检测机构
     */
    @ApiModelProperty(value = "送检检测机构", name = "instituteName")
    private String instituteName;
    /**
     * 收样人id
     */
    @ApiModelProperty(value = "收样人id", name = "receiveSampleUserId")
    private String receiveSampleUserId;
    /**
     * 收样人
     */
    @ApiModelProperty(value = "收样人", name = "receiveSampleUserName")
    private String receiveSampleUserName;

    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门", name = "inspectDepartment")
    private String inspectDepartment;

    /**
     * 送检状态
     */
    @ApiModelProperty(value = "送检状态", name = "status")
    private String status;

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
}
