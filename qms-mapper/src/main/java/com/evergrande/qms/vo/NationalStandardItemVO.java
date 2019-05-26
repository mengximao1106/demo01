/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandardItemVO
 * Author:   laifuying
 * Date:     2018-08-21 10:30
 * Description: 国家标准检测项目VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 国家标准检测项目VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "国家标准检测项目VO", description= "国家标准检测项目VO")
public class NationalStandardItemVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 国家标准号
     */
    @ApiModelProperty(value = "国家标准号", name = "standardNum")
    private String standardNum;

    /**
     * 标准名称/标准内容
     */
    @ApiModelProperty(value = "标准名称/标准内容", name = "standardName")
    private String standardName;

    /**
     * 检测编号
     */
    @ApiModelProperty(value = "检测编号", name = "inspectionCode")
    private String inspectionCode;

    /**
     * 检测项目
     */
    @ApiModelProperty(value = "检测项目", name = "inspectionItem")
    private String inspectionItem;

    /**
     * 监控指标类型/抽样类型
     */
    @ApiModelProperty(value = "监控指标类型/抽样类型（一般指标：0，重点指标：1）", name = "monitorIndicatorType")
    private String monitorIndicatorType;

    /**
     * 值类型
     */
    @ApiModelProperty(value = "值类型", name = "valueType")
    private String valueType;
}