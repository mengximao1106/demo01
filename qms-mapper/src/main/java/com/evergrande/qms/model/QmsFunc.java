/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsFunc
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 功能表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsFunc对象", description= "QmsFunc")
public class QmsFunc implements Serializable {

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
     * 状态
     */
    @ApiModelProperty(value = "状态", name = "status")
    private Integer status;

    /**
     * 菜单ID
     */
    @ApiModelProperty(value = "菜单ID", name = "menuId")
    private String menuId;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate")
    private Date updateDate;


}