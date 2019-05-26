/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsItemResultVO
 * Author:   mengximao
 * Date:     2018-08-17 17:38
 * Description: 项目结果VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 项目检测结果VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsItemResultVO", description = "项目检测结果VO")
public class QmsItemResultVO implements Serializable {

    /**
     * 检测项目订单表主键
     */
    @ApiModelProperty(value = "检测项目订单表主键", name = "id")
    private String id;

    /**
     * 大于检测限值
     */
    @ApiModelProperty(value = "大于检测限值", name = "moreThanValue")
    private Double moreThanValue;

    /**
     * 小于检测限值
     */
    @ApiModelProperty(value = "小于检测限值", name = "lessThanValue")
    private Double lessThanValue;

    /**
     * 检测值
     */
    @ApiModelProperty(value = "检测值", name = "inspectionValue")
    private String inspectionValue;
    /**
     * 检测结果
     */
    @ApiModelProperty(value = "检测结果", name = "inspectionResult")
    private String inspectionResult;
    /**
     * 值类型
     */
    @ApiModelProperty(value = "值类型",name = "valueType")
    private String valueType;
}
