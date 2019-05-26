/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionItemVO
 * Author:   mengximao
 * Date:     2018-08-02 14:33
 * Description: 检测项目信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 检测项目信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionItemVO 对象", description = "检测项目VO")
public class QmsInspectionItemVO implements Serializable {

    /**
     * 检测编号
     */
    @ApiModelProperty(value="检测编号", name="inspectionCode")
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
     * 项目值类型
     */
    @ApiModelProperty(value="项目值类型（数字：0，文本：1）", name="valueType")
    private String valueType;

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

}
