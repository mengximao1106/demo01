/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteItem
 * Author:   laifuying
 * Date:     2018-08-13 15:36
 * Description: 检测院对应检测项目Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 检测院对应检测项目Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测院对应检测项目对象", description= "检测院对应检测项目model")
public class InspectionInstituteItem {
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;

    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码",name = "instituteCode")
    private String instituteCode;

    /**
     * 物料组编码/代码
     */
    @ApiModelProperty(value = "物料组编码/代码",name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 国家标准号
     */
    @ApiModelProperty(value = "国家标准号",name = "standardNum")
    private String standardNum;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码",name = "inspectionCode")
    private String inspectionCode;

    /**
     * 检测周期
     */
    @ApiModelProperty(value = "检测周期",name = "inspectionPeriod")
    private Double inspectionPeriod;

    /**
     * 检测金额
     */
    @ApiModelProperty(value = "检测金额",name = "inspectionFee")
    private BigDecimal inspectionFee;

    /**
     * 状态：0-启用；1-未启用
     */
    @ApiModelProperty(value = "状态",name = "status")
    private String status;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人",name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人",name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间",name = "updateDate")
    private Date updateDate;
}