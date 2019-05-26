/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemInfoVO
 * Author:   liuww
 * Date:     2018-08-13
 * Description: app端抽样详情保存数据封装
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.QmsOssAttachment;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * app端抽样详情保存数据封装
 * @author liuww
 */
@NoArgsConstructor
@Data
@ApiModel(value = "app端抽样详情保存VO", description= "app端抽样详情保存VO")
public class QmsSampleDetailsAppVO {

    /**
     * 抽样详细信息id
     */
    @ApiModelProperty(value = "抽样详情id",name = "qmsSamplePlanDetailId")
    private String qmsSamplePlanDetailId;

    /**
     * 到货时间
     */
    @ApiModelProperty(value = "到货时间",name = "arrivalTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date arrivalTime;

    /**
     * 实际抽样数量（初样）
     */
    @ApiModelProperty(value = "实际抽样数量（初样）",name = "actualSampleAmount")
    private Double actualSampleAmount;
    /**
     * 实际抽样数量（备样）
     */
    @ApiModelProperty(value = "实际抽样数量（备样）",name = "actualSampleAmountReserve    ")
    private Double actualSampleAmountReserve;

    /**
     * 无法抽样原因
     */
    @ApiModelProperty(value = "无法抽样原因",name = "cancelReason")
    private String cancelReason;

    /**
     * 其他原因
     */
    @ApiModelProperty(value = "其他原因",name = "otherReasons")
    private String otherReasons;

    /**
     * 状态:1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：待校对、10：已完成、11：已取消
     */
    @ApiModelProperty(value = "状态:1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：待校对、10：已完成、11：已取消',",name = "status")
    private String status;

    /**
     * 无法抽样原因附件
     */
    @ApiModelProperty(value = "无法抽样原因附件",name = "samplingReasonAttachment")
    List<QmsOssAttachment> samplingReasonAttachment;

    /**
     * 抽前附件
     */
    @ApiModelProperty(value = "抽前附件",name = "beforeAttachment")
    List<QmsOssAttachment> beforeAttachment;

    /**
     * 抽中附件
     */
    @ApiModelProperty(value = "抽中附件",name = "midAttachment")
    List<QmsOssAttachment> midAttachment;

    /**
     * 抽后附件
     */
    @ApiModelProperty(value = "抽后附件",name = "afterAttachment")
    List<QmsOssAttachment> afterAttachment;

    /**
     * 备样附件
     */
    @ApiModelProperty(value = "备样附件",name = "sparePartsAttachment")
    List<QmsOssAttachment> sparePartsAttachment;
}
