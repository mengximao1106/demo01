/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsFuncVo
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 功能表实体
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能表VO
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsFuncVo对象", description= "QmsFuncVo")
public class QmsFuncVo implements Serializable {

    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    private String id;

    /**
     * 功能名称
     */
    @ApiModelProperty(value = "功能名称", name = "funcName")
    private String funcName;

    /**
     * 功能链接
     */
    @ApiModelProperty(value = "功能名称", name = "funcUrl")
    private String funcUrl;

    /**
     * 序列号
     */
    @ApiModelProperty(value = "序列号", name = "funcOrder")
    private Integer funcOrder;

    /**
     * 是否勾选
     */
    @ApiModelProperty(value = "是否勾选", name = "checked")
    private boolean checked;

}