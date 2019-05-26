/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRole
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 角色表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsRole对象", description= "QmsRole")
public class QmsRole implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id")
    private String id;

    /**
     * 角色编码
     */
    @ApiModelProperty(value = "角色编码", name = "code")
    private String code;

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称", name = "name")
    private String name;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", name = "status")
    private Integer status;

    /**
     * 角色描述
     */
    @ApiModelProperty(value = "角色描述", name = "description")
    private String description;

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

    /**
     * 菜单权限
     */
    @ApiModelProperty(value = "菜单权限", name = "menuList")
    private List<String> menuList;

    /**
     * 功能权限
     */
    @ApiModelProperty(value = "功能权限", name = "funcList")
    private List<String> funcList;
}