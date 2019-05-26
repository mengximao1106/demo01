/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemVO
 * Author:   laifuying
 * Date:     2018-08-07 15:43
 * Description: 物料关联检测项目
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

/**
 * 物料关联检测项目
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料关联检测项目VO对象", description= "物料关联检测项目VO")
public class InspectionItemVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialName")
    private String materialName;

    /**
     * 物料类别/材料类别编码
     */
    @ApiModelProperty(value = "物料类别/材料类别编码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料类别/材料类别名称
     */
    @ApiModelProperty(value = "物料类别/材料类别名称", name = "materialTypeName")
    private String materialTypeName;

    /**
     * 物料种类/材料种类
     */
    @ApiModelProperty(value = "物料种类/材料种类", name = "materialCategory")
    private String materialCategory;


    /**
     * 检测依据标准内容/执行标准(国标)编码
     */
    @ApiModelProperty(value = "检测依据标准内容/执行标准(国标)编码", name = "standardNum")
    private String standardNum;

    /**
     * 检测依据标准内容/执行标准(国标)
     */
    @ApiModelProperty(value = "检测依据标准内容/执行标准(国标)", name = "inspectionStandard")
    private String inspectionStandard;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码", name = "inspectionCode")
    private String inspectionCode;

    /**
     * 检测项目名称
     */
    @ApiModelProperty(value = "检测项目名称", name = "inspectionItem")
    private String inspectionItem;

    /**
     * 监控指标类型/抽样类型
     */
    @ApiModelProperty(value = "监控指标类型/抽样类型", name = "monitorIndicatorType")
    private String monitorIndicatorType;

    /**
     * 值类型
     */
    @ApiModelProperty(value = "值类型", name = "valueType")
    private String valueType;

    /**
     * 引用的方法标准
     */
    @ApiModelProperty(value = "引用的方法标准", name = "referencedStandard")
    private String referencedStandard;

    /**
     * 检测限值（>=）
     */
    @ApiModelProperty(value = "检测限值（>=）", name = "moreThanValue")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double moreThanValue;

    /**
     * 检测限值（<=）
     */
    @ApiModelProperty(value = "检测限值（<=）", name = "moreThanValue")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double lessThanValue;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", name = "unit")
    private String unit;

}