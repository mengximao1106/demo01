/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemInfo
 * Author:   laifuying
 * Date:     2018-07-27 9:40
 * Description: 检测项目基础信息表
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 检测项目基础信息表
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测项目对象", description= "检测项目model")
public class InspectionItemInfo {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

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
    @ApiModelProperty(value = "监控指标类型/抽样类型", name = "monitorIndicatorType")
    private String monitorIndicatorType;

    /**
     * 值类型
     */
    @ApiModelProperty(value = "值类型", name = "valueType")
    private String valueType;

    /**
     * 状态：0-正常，1-删除
     */
    @ApiModelProperty(value = "状态：0-正常，1-删除", name = "status")
    private String status;

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