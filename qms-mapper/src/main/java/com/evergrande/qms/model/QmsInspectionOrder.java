/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionOrder
 * Author:   mengximao
 * Date:     2018-07-27 11:30
 * Description: 检测订单表
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 检测订单表 对应 qms_inspection_order 表
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionOrder 对象", description = "检测订单表")
public class QmsInspectionOrder implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键", name="id")
    private String id;

    /**inspectionOrderNum
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

    /**
     * OT文件实体
     */
    @ApiModelProperty(value = "OT文件实体",name = "otAttachments")
    private List<QmsOtAttachment> otAttachments;

    /**
     * 检测项目实体
     */
    @ApiModelProperty(value = "检测项目实体",name = "orderItem")
    private List<QmsInspectionOrderItem> orderItem;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "取消原因",name = "cancelReason")
    private String cancelReason;

    /**
     * ids
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3",name = "ids")
    private String ids;

    /**
     * 检测状态：1-待确认，2-待收样，3-待检测，4-已检测，5-已取消
     */
    @ApiModelProperty(value="修改前检测状态", name="currentStatus")
    private String currentStatus;

    /**
     * 检测机构编码
     */
    @ApiModelProperty(value="检测机构编码", name="instituteCode")
    private String instituteCode;

    /**
     * 送检开始时间
     */
    @ApiModelProperty(value = "送检开始时间",name = "inspectionSendStartTime")
    private Date inspectionSendStartTime;

    /**
     * 送检结束时间
     */
    @ApiModelProperty(value = "送检结束时间",name = "inspectionSendEndTime")
    private Date inspectionSendEndTime;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value="检测机构名称", name="inspectionOrganizationName")
    private String inspectionOrganizationName;

    /**
     * id集合
     */
    @ApiModelProperty(value = "id集合",name = "idList")
    private List<String> idList;

    /**
     * 用户账户
     */
    @ApiModelProperty(value="用户账户", name="loginName")
    private String loginName;

    /**
     * 领导表示(0否 1是)
     */
    @ApiModelProperty(value = "领导表示(0否 1是)", name = "isLed")
    private Integer isLed;


}
