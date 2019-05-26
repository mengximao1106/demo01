/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsForepartTestVO
 * Author:   mengximao
 * Date:     2018-07-25 17:12
 * Description: 初样检测信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 检测项目VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsForepartTestItemVO对象",description = "检测项目VO")
public class QmsForepartTestItemVO implements Serializable {

    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "检测依据标准内容", name = "inspectionStandard")
    private String inspectionStandard;

    /**
     * 国标编码
     */
    @ApiModelProperty(value = "国标编码", name = "standardNum")
    private String standardNum;

    /**
     * 检测项目
     */
    @ApiModelProperty(value = "检测项目", name = "inspectionItem")
    private String inspectionItem;

    /**
     * 检测限值
     */
    @ApiModelProperty(value = "检测限值", name = "inspectionLimit")
    private String inspectionLimit;
    /**
     * 检测值
     */
    @ApiModelProperty(value = "检测值", name = "inspectionValue")
    private String inspectionValue;
    /**
     * 检验结果
     */
    @ApiModelProperty(value = "检验结果", name = "inspectionResult")
    private String inspectionResult;

    /**
     * 单项评定
     */
    @ApiModelProperty(value = "单项评定", name = "inspectionEvaluate")
    private String inspectionEvaluate;
    /**
     * 结果描述
     */
    @ApiModelProperty(value = "结果描述", name = "resultDesc")
    private String resultDesc;
    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", name = "unit")
    private String unit;

}
