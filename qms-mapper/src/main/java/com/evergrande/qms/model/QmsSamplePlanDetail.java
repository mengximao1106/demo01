/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SamplePlan
 * Author:   liaowenlong
 * Date:     2018-07-24 13:49
 * Description: 抽样计划明细表,与qms_sample_plan_detail映射
 */
package com.evergrande.qms.model;


import com.evergrande.qms.util.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 抽样计划明细表,与qms_sample_plan_detail映射
 * @author liaowenlong
 * @since 1.0.0
 */

@NoArgsConstructor
@Data
@ApiModel(value = "QmsSamplePlanDetail对象", description= "计划明细model")
public class QmsSamplePlanDetail implements Serializable {
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
     * 检测订单id
     */
    @ApiModelProperty(value = "检测订单id",name="inspectionOrderId")
    private String inspectionOrderId;
    /**
     * 行号
     */
    @ApiModelProperty(value = "行号",name = "rowNum")
    private Integer rowNum;
    /**
     * 物料组代码
     */
    @ApiModelProperty(value = "物料组代码",name = "materialTypeCode")
    private String materialTypeCode;
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
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称",name = "materialDesc")
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
     * 材料负责人名称
     */
    @ApiModelProperty(value = "材料负责人名称",name = "materialManagerName")
    private String materialManagerName;
    /**
     * 抽样材料标准
     */
    @ApiModelProperty(value = "抽样材料标准",name = "materialStandard")
    private String materialStandard;
    /**
     *检测类型(1:一般指标 2:重点指标 3:全指标)
     */
    @ApiModelProperty(value = "检测类型(1:一般指标 2:重点指标 3:全指标)",name = "monitorIndicatorType")
    private String monitorIndicatorType;
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
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double planSampleAmount;
    /**
     * 计划抽样数量（备样）
     */
    @ApiModelProperty(value = "计划抽样数量（备样）",name = "planSampleAmountReserve")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double planSampleAmountReserve;
    /**
     * 实际抽样数量（初样）
     */
    @ApiModelProperty(value = "实际抽样数量（初样）",name = "actualSampleAmount")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double actualSampleAmount;
    /**
     * 实际抽样数量（备样）
     */
    @ApiModelProperty(value = "实际抽样数量（备样）",name = "actualSampleAmountReserve    ")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double actualSampleAmountReserve;
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
     * 实际收样时间
     */
    @ApiModelProperty(value = "实际收样时间",name = "sampleTime")
    private Date sampleTime;

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

    /**
     * 抽检计划检测项目
     */
    @ApiModelProperty(value = "抽检计划检测项目",name = "qmsSamplePlanItemList")
    private List<QmsSamplePlanItem> qmsSamplePlanItemList;

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
     * 操作类型
     */
    @ApiModelProperty(value = "操作类型",name = "operationType")
    private String operationType;

    /**
     * 寄出时间
     */
    @ApiModelProperty(value = "寄出时间",name = "sendOffTime")
    private Date sendOffTime;
    /**
     * 检测订单明细关联model
     */
    @ApiModelProperty(value = "检测订单明细关联model",name = "qmsOrderMaterialDetailBind")
    private List<QmsOrderMaterialDetailBind> qmsOrderMaterialDetailBind;

    /**
     * 自动生成计划--数据有效性:   1:是(默认)   2:否   物料编码本地库查询不到为无效
     */
    @ApiModelProperty(value = "自动生成计划--数据有效性:   1:是(默认)   2:否   物料编码本地库查询不到为无效",name = "dataStatus")
    private String dataStatus;

    /**
     * 复核状态：1-待复核，2-审核中，3-已复核
     */
    @ApiModelProperty(value = "复核状态：1-待复核，2-审核中，3-已复核",name = "reviewStatus")
    private String reviewStatus;
    /**
     * 实际到货时间
     */
    @ApiModelProperty(value = "实际到货时间",name = "arrivalTime")
    private Date arrivalTime;

    /**
     * 抽样状态1-待审核、2-待下发、3-待抽样、4-待收样、5-待委托、6-待寄出、\n7-待检测、8-待复核、9-已完成、10-已取消',
     */
    @ApiModelProperty(value="修改前检测状态", name="currentStatus")
    private String currentStatus;

    /**
     * BPM退回或审批不通过之前的复核结果：4-不复检，5-改判为合格
     */
    @ApiModelProperty(value = "BPM退回或审批不通过之前的复核状态：4-不复检，5-改判为合格",name = "beforeReviewResult")
    private String beforeReviewResult;

    /**
     * 校对不通过备注
     */
    @ApiModelProperty(value="校对不通过备注", name="revisionRemarks")
    private String revisionRemarks;

    /**
     * 复核：判定原因
     */
    @ApiModelProperty(value="判定原因", name="determineReason")
    private String determineReason;
}