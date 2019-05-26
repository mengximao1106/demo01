/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRoleMenuFunc
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 角色功能关联表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * 角色功能关联表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsRoleMenuFunc对象", description= "QmsRoleMenuFunc")
public class QmsRoleMenuFunc implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id")
    private String id;

    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID", name = "roleId")
    private String roleId;

    /**
     * 功能ID
     */
    @ApiModelProperty(value = "功能ID", name = "menuFuncId")
    private String menuFuncId;

    /**
     * 是否可用（1-是、 2-否）
     */
    @ApiModelProperty(value = "是否可用（1-是、 2-否）", name = "status")
    private Integer status;

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