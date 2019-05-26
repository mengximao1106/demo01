/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInstituteInfoVO
 * Author:   mengximao
 * Date:     2018-08-13 16:28
 * Description: 检测院编码、检测院名称信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 检测院编码、检测院名称信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInstituteInfoVO对象",description = "检测院编码、检测院名称信息VO")
public class QmsInstituteInfoVO implements Serializable {
    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码", name = "instituteCode")
    private String instituteCode;

    /**
     * 检测院名称
     */
    @ApiModelProperty(value = "检测院名称", name = "instituteName")
    private String instituteName;
}
