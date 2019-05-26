/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserRole
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 用户角色关联表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户角色关联表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsUserRole对象", description= "QmsUserRole")
public class QmsUserRole implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id")
    private String id;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", name = "userId")
    private String userId;

    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID", name = "roleId")
    private String roleId;

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