/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItem
 * Author:   laifuying
 * Date:     2018-08-07 15:35
 * Description: 物料关联检测项目
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 物料关联检测项目
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料关联检测项目对象", description= "物料关联检测项目model")
public class InspectionItem {
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
     * 执行标准
     */
    @ApiModelProperty(value = "执行标准", name = "standardNum")
    private String standardNum;
    /**
     * 引用的方法标准
     */
    @ApiModelProperty(value = "引用的方法标准", name = "referencedStandard")
    private String referencedStandard;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", name = "unit")
    private String unit;

    /**
     * 检测限值（>=）
     */
    @ApiModelProperty(value = "检测限值（>=）", name = "moreThanValue")
    private Double moreThanValue;

    /**
     * 检测限值（<=）
     */
    @ApiModelProperty(value = "检测限值（<=）", name = "moreThanValue")
    private Double lessThanValue;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate", example = "2018-07-24 14:10:08")
    private Date createDate;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate", example = "2018-07-24 14:10:08")
    private Date updateDate;
}