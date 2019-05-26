/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInstituteInfo
 * Author:   mengximao
 * Date:     2018-08-04 16:07
 * Description: 检测院、检测项目、检测金额 Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 检测机构编码  检测机构名称  检测机构省份  检测项目编码  检测金额 Model
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInstituteInfo对象",description = "检测院相关信息Model")
public class QmsInstituteInfo implements Serializable {

    /**
     * 检测机构编码
     */
    @ApiModelProperty(value = "检测机构编码", name = "instituteCode")
    private String instituteCode;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value = "检测机构名称", name = "instituteName")
    private String instituteName;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码", name = "inspectionCode")
    private String inspectionCode;

    /**
     * 检测机构所在省份
     */
    @ApiModelProperty(value = "检测机构所在省份", name = "instituteProvince")
    private String instituteProvince;

    /**
     * 检测金额
     */
    @ApiModelProperty(value = "检测金额", name = "inspectionFee")
    private BigDecimal inspectionFee;

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
