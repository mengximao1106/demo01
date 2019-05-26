/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialDeaelVO
 * Author:   liaowenlong
 * Date:     2018-09-13 11:27
 * Description: 取样要求VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 取样要求VO
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsMaterialItemVO", description = "取样要求检测项目vo")
public class QmsMaterialItemVO implements Serializable {

    /**
     *检测编码
     */
    @ApiModelProperty(value = "检测编码", name = "inspectionCode")
    private String inspectionCode;
    /**
     *检测项目
     */
    @ApiModelProperty(value = "检测项目", name = "inspectionItem")
    private String inspectionItem;
    /**
     *值类型（数字：0，文本：1）
     */
    @ApiModelProperty(value = "值类型（数字：0，文本：1）", name = "valueType")
    private String valueType;
    /**
     *标准号
     */
    @ApiModelProperty(value = "标准号", name = "standardNum")
    private String standardNum;
    /**
     *标准名称
     */
    @ApiModelProperty(value = "标准名称", name = "standardName")
    private String standardName;
    /**
     * 监控指标类型/抽样类型（一般指标：0，重点指标：1）
     */
    @ApiModelProperty(value = "监控指标类型/抽样类型（一般指标：0，重点指标：1）", name = "monitorIndicatorType")
    private String monitorIndicatorType;
}
