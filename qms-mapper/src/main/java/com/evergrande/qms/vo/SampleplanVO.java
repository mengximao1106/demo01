/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleplanVO
 * Author:   liaowenlong
 * Date:     2018-08-09 18:17
 * Description: 抽检计划详情
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 抽检计划详情
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "SampleplanVO对象", description= "抽检计划详情")
public class SampleplanVO implements Serializable {


    /**
     * 计划类型
     */
    @ApiModelProperty(value = "计划类型",name = "planType")
    private String planType;
    /**
     * 抽样类型:1-工厂、2-现场
     */
    @ApiModelProperty(value = "抽样类型:1-工厂、2-现场",name = "sampleType")
    private String sampleType;

    /**
     * 初样计划id
     */
    @ApiModelProperty(value = "初样计划id",name = "beforePlanId")
    private String beforePlanId;
    /**
     * 抽样地址
     */
    @ApiModelProperty(value = "抽样地址",name = "sampleAddress")
    private String sampleAddress;
    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人",name = "sampleUserName")
    private String sampleUserName;
    /**
     * 抽样日期
     */
    @ApiModelProperty(value = "抽样日期",name = "sampleDate")
    private Date sampleDate;
    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门",name = "inspectDepartment")
    private String inspectDepartment;
    /**
     * 收样人id
     */
    @ApiModelProperty(value = "收样人",name = "receiveSampleUserName")
    private String receiveSampleUserName;

    /**
     * 供应商编号
     */
    @ApiModelProperty(value = "供应商编号",name = "supplierCode")
    private String supplierCode;
    /**
     * 抽样工厂
     */
    @ApiModelProperty(value = "抽样工厂",name = "sampleFactory")
    private String sampleFactory;
    /**
     * 抽样部门
     */
    @ApiModelProperty(value = "抽样部门",name = "sampleDepartment")
    private String sampleDepartment;
    /**
     * 收样人电话号码
     */
    @ApiModelProperty(value = "收样人电话号码",name = "receiveSampleUserPhone")
    private String receiveSampleUserPhone;

    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人id",name = "sampleUserId")
    private String sampleUserId;
    /**
     * 抽样人部门id
     */
    @ApiModelProperty(value = "抽样人部门id",name = "sampleUserId")
    private String sampleDepartmentId;
    /**
     * 复检计划编号
     */
    @ApiModelProperty(value = "复检计划编号",name = "recheckPlanCode")
    private String recheckPlanCode;
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;
    /**
     * 抽样计划编号
     */
    @ApiModelProperty(value = "抽样计划id",name = "samplePlanId")
    private String samplePlanCode;
    /**
     * 行号
     */
    @ApiModelProperty(value = "行号",name = "rowNum")
    private Integer rowNum;
    /**
     * 材料类别
     */
    @ApiModelProperty(value = "材料类别",name = "materialType")
    private String materialType;
    /**
     * 材料编码
     */
    @ApiModelProperty(value = "材料编码",name = "materialCode")
    private String materialCode;
    /**
     * 物料描述
     */
    @ApiModelProperty(value = "物料描述",name = "materialDesc")
    private String materialDesc;
    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌",name = "brand")
    private String brand;
    /**
     * 材料负责人id
     */
    @ApiModelProperty(value = "材料负责人id",name = "dutyUserId")
    private String dutyUserId;
    /**
     * 抽样材料标准
     */
    @ApiModelProperty(value = "抽样材料标准",name = "materialStandard")
    private String materialStandard;
    /**
     * 抽样类型
     */
    @ApiModelProperty(value = "抽样类型",name = "type")
    private String type;
    /**
     * 计划抽样订单号
     */
    @ApiModelProperty(value = "计划抽样订单号",name = "sampleOrderNumber")
    private String sampleOrderNumber;
    /**
     * 计划抽样数量（初样）
     */
    @ApiModelProperty(value = "计划抽样数量（初样）",name = "planSampleAmount")
    private Integer planSampleAmount;
    /**
     * 计划抽样数量（备样）
     */
    @ApiModelProperty(value = "计划抽样数量（备样）",name = "planSampleAmountReserve")
    private Integer planSampleAmountReserve;
    /**
     * 实际抽样数量（初样）
     */
    @ApiModelProperty(value = "实际抽样数量（初样）",name = "actualSampleAmount")
    private Integer actualSampleAmount;
    /**
     * 实际抽样数量（备样）
     */
    @ApiModelProperty(value = "实际抽样数量（备样）",name = "actualSampleAmountReserve    ")
    private Integer actualSampleAmountReserve;
    /**
     * 复检标志：1-是、2-否
     */
    @ApiModelProperty(value = "复检标志：1-是、2-否",name = "recheckFlag")
    private String recheckFlag;
    /**
     * 确认收样标志：1-已收样、2-未收样
     */
    @ApiModelProperty(value = "确认收样标志：1-已收样、2-未收样",name = "confirmSampleFlag")
    private String confirmSampleFlag;
    /**
     * 抽样状态1-待审核、2-待下发、3-待抽样、4-待收样、5-待委托、6-待寄出、\n7-待检测、8-待复核、9-已完成、10-已取消',
     */
    @ApiModelProperty(value = "抽样状态",name = "status")
    private String status;
    /**
     * 抽样会签表附件id
     */
    @ApiModelProperty(value = "抽样会签表附件id",name = "signAttachmentId")
    private String signAttachmentId;
    /**
     * 批次号
     */
    @ApiModelProperty(value = "批次号",name = "batchNumber")
    private String batchNumber;


    /**
     * 取消原因
     */
    @ApiModelProperty(value = "取消原因",name = "cancelReason")
    private String cancelReason;


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
     * 检测报告编码
     */
    @ApiModelProperty(value = "检测报告编码",name = "inspectionReportCode")
    private String inspectionReportCode;
    /**
     * 样品编号
     */
    @ApiModelProperty(value = "样品编号",name = "sampleCode")
    private String sampleCode;
}
