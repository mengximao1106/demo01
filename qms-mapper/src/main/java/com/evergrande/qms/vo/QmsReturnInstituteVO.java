/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsReturnInstituteVO
 * Author:   mengximao
 * Date:     2018-08-04 13:15
 * Description: 返回推荐检测机构VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回推荐检测机构VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsReturnInstituteVO对象",description = "返回推荐检测机构VO")
public class QmsReturnInstituteVO implements Serializable {

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
     * 项目匹配百分比
     */
    @ApiModelProperty(value = "项目匹配百分比", name = "itemMatchDegree")
    private String itemMatchDegree;

    /**
     * 省份匹配百分比
     */
    @ApiModelProperty(value = "省份匹配百分比", name = "provinceMatchDegree")
    private String provinceMatchDegree;

    /**
     * 总金额
     */
    @ApiModelProperty(value = "总金额", name = "totalMoney")
    private String totalMoney;

}
