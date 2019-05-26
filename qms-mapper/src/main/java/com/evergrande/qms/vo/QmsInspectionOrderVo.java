/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionOrderVo
 * Author:   liuyongzhi
 * Date:     2018-07-17 15:14
 * Description: 检测订单实体
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体
 *
 * @author liuyongzhi
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsInspectionOrderVo对象", description= "QmsInspectionOrderVo")
public class QmsInspectionOrderVo implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键", name="id")
    private String id;
    /**
     * 抽样计划id
     */
    @ApiModelProperty(value="抽样计划id", name="samplePlanId")
    private String samplePlanId;
    /**
     * 抽样计划明细id
     */
    @ApiModelProperty(value="抽样计划明细id", name="samplePlanDetailId")
    private String samplePlanDetailId;
    /**
     * 检测订单号
     */
    @ApiModelProperty(value="检测订单号", name="inspectionOrderNum")
    private String inspectionOrderNum;
    /**
     * 检测机构
     */
    @ApiModelProperty(value="检测机构", name="inspectionOrganization")
    private String inspectionOrganization;
    /**
     * 送检时间
     */
    @ApiModelProperty(value="送检时间", name="inspectionSendTime")
    private Date inspectionSendTime;
    /**
     * 委托书编号
     */
    @ApiModelProperty(value="委托书编号", name="delegationCode")
    private String delegationCode;
    /**
     * 预计完成时间
     */
    @ApiModelProperty(value="预计完成时间", name="predictCompleteDate")
    private Date predictCompleteDate;
    /**
     * 检测状态：1-待确认，2-待收样，3-待检测，4-已检测，5-已取消
     */
    @ApiModelProperty(value="检测状态", name="status")
    private String status;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人",name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人",name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间",name = "updateDate")
    private Date updateDate;

    /**
     * 到样时间
     */
    @ApiModelProperty(value = "到样时间",name = "sampleArriveTime")
    private Date sampleArriveTime;
}