/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsItemAreaInfo
 * Author:   mengximao
 * Date:     2018-08-21 17:10
 * Description: 检测项目区域信息
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * 检测项目区域信息
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsItemAreaInfo对象",description = "检测项目区域信息")
public class QmsItemAreaInfo implements Serializable {

    /**
     * 抽样省份
     */
    @ApiModelProperty(value = "抽样省份", name = "sampleProvince")
    private String sampleProvince;

    /**
     * 供应商省份
     */
    @ApiModelProperty(value = "供应商省份", name = "supplierProvince")
    private String supplierProvince;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码", name = "inspectionCode")
    private String inspectionCode;

    /**
     * 标准号
     */
    @ApiModelProperty(value = "标准号", name = "standardNum")
    private String standardNum;

    /**
     * 物料组代码
     */
    @ApiModelProperty(value = "物料组代码", name = "materialTypeCode")
    private String materialTypeCode;

}
