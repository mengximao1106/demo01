/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Dictionary
 * Author:   laifuying
 * Date:     2018-08-02 14:41
 * Description: 系统字典
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统字典
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "系统字典对象", description= "系统字典model")
public class Dictionary {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 字典名称
     */
    @ApiModelProperty(value = "字典名称", name = "dicName")
    private String dicName;

    /**
     * 字典值
     */
    @ApiModelProperty(value = "字典值", name = "dicValue")
    private String dicValue;

    /**
     * 字典类别
     */
    @ApiModelProperty(value = "字典类别", name = "dicType")
    private String dicType;

    /**
     * 父级Key
     */
    @ApiModelProperty(value = "父级Key", name = "parentKey")
    private String parentKey;
}