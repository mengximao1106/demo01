/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionOrderItem
 * Author:   mengximao
 * Date:     2018-07-27 11:38
 * Description: 检测订单项目表
 */
package com.evergrande.qms.model;

import com.evergrande.qms.vo.QmsInspectionItemVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 检测订单项目表 对应 qms_inspection_order_item 表
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionOrderItem 对象", description = "检测订单项目表")
public class QmsInspectionOrderItem implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键", name="id")
    private String id;
    /**
     * 抽样计划编码
     */
    @ApiModelProperty(value="抽样计划编码", name="samplePlanCode")
    private String samplePlanCode;
    /**
     * 抽样计划明细id
     */
    @ApiModelProperty(value="抽样计划明细id", name="samplePlanDetailId")
    private String samplePlanDetailId;
    /**
     * 检测订单id
     */
    @ApiModelProperty(value="检测订单id", name="inspectionOrderId")
    private String inspectionOrderId;
    /**
     * 检测编码
     */
    @ApiModelProperty(value="检测编码", name="inspectionCode")
    private String inspectionCode;
    /**
     * 检测项目
     */
    @ApiModelProperty(value="检测项目", name="inspectionItem")
    private String inspectionItem;
    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value="检测依据标准内容", name="inspectionStandard")
    private String inspectionStandard;
    /**
     * 检测金额
     */
    @ApiModelProperty(value="检测金额", name="inspectionFee")
    private BigDecimal inspectionFee;
    /**
     * 检测确认标志：1-是，2-否
     */
    @ApiModelProperty(value="检测确认标志：1-是，2-否", name="confirmFlag")
    private String confirmFlag;
    /**
     * 检测结果
     */
    @ApiModelProperty(value="检测结果", name="inspectionResult" ,example = "2.50")
    private String inspectionResult;
    /**
     * 单项评定
     */
    @ApiModelProperty(value="单项评定", name="inspectionEvaluate")
    private String inspectionEvaluate;
    /**
     * 不检测原因
     */
    @ApiModelProperty(value="不检测原因", name="noInspectionReason")
    private String noInspectionReason;
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
     * 值类型
     */
    @ApiModelProperty(value = "值类型",name = "valueType")
    private String valueType;

    /**
     * 结果描述
     */
    @ApiModelProperty(value = "结果描述",name = "resultDesc")
    private String resultDesc;

    /**
     * 标准号
     */
    @ApiModelProperty(value = "标准号",name = "standardNum")
    private String standardNum;

    /**
     * 监控指标类型
     */
    @ApiModelProperty(value = "监控指标类型",name = "monitorIndicatorType")
    private String monitorIndicatorType;

    /**
     * 检测值
     */
    @ApiModelProperty(value = "检测值",name = "inspectionValue")
    private String inspectionValue;

    public QmsInspectionOrderItem(QmsInspectionItemVO qmsInspectionItemVO){
        this.inspectionCode = qmsInspectionItemVO.getInspectionCode();
        this.inspectionItem = qmsInspectionItemVO.getInspectionItem();
        this.inspectionStandard = qmsInspectionItemVO.getInspectionStandard();
        this.inspectionFee = qmsInspectionItemVO.getInspectionFee();
        this.valueType = qmsInspectionItemVO.getValueType();
        this.standardNum = qmsInspectionItemVO.getStandardNum();
        this.monitorIndicatorType = qmsInspectionItemVO.getMonitorIndicatorType();
        this.inspectionValue= qmsInspectionItemVO.getInspectionValue();
    }

}
