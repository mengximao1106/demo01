/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemInfoVO
 * Author:   laifuying
 * Date:     2018-07-27 9:51
 * Description: 检测项目基础数据VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 检测项目基础数据VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测项目VO对象", description= "检测项目VO")
public class InspectionItemInfoVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * id以英文逗号分隔。如1,2,3
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3", name = "ids")
    private String ids;

    /**
     * 检测编码
     */
    @ApiModelProperty(value = "检测编码", name = "inspectionCode")
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