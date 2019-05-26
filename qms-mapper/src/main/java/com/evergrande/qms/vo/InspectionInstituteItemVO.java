/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteItemVO
 * Author:   laifuying
 * Date:     2018-08-16 11:08
 * Description: 检测院项目VO
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.util.CustomBigDecimalSerializer;
import com.evergrande.qms.util.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 检测院项目VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测院项目VO对象", description= "检测院项目VO")
public class InspectionInstituteItemVO implements Serializable {
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;

    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码",name = "instituteCode")
    private String instituteCode;

    /**
     * 检测院名称
     */
    @ApiModelProperty(value = "检测院名称",name = "instituteName")
    private String instituteName;

    /**
     * 物料组编码/代码
     */
    @ApiModelProperty(value = "物料组编码/代码",name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料组名称
     */
    @ApiModelProperty(value = "物料组名称",name = "materialTypeName")
    private String materialTypeName;

    /**
     * 国家标准号
     */
    @ApiModelProperty(value = "国家标准号",name = "standardNum")
    private String standardNum;

    /**
     * 国家标准名称
     */
    @ApiModelProperty(value = "国家标准名称",name = "standardName")
    private String standardName;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码",name = "inspectionCode")
    private String inspectionCode;

    /**
     * 检测项目
     */
    @ApiModelProperty(value = "检测项目",name = "inspectionItem")
    private String inspectionItem;

    /**
     * 检测周期
     */
    @ApiModelProperty(value = "检测周期",name = "inspectionPeriod")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double inspectionPeriod;

    /**
     * 检测金额
     */
    @ApiModelProperty(value = "检测金额",name = "inspectionFee")
    @JsonSerialize(using = CustomBigDecimalSerializer.class)
    private BigDecimal inspectionFee;

    /**
     * 状态：0-启用；1-未启用
     */
    @ApiModelProperty(value = "状态",name = "status")
    private String status;
}