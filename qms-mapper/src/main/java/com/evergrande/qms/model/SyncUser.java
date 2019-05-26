/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SyncUser
 * Author:   liaowenlong
 * Date:     2018-08-13 8:53
 * Description: IDM同步用户表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * IDM同步用户表idm_sync_user实体
 *
 * @author chensheng
 * @since 1.0.0
 */

@NoArgsConstructor
@Data
@ApiModel(value = "SyncUser对象", description= "SyncUser")
public class SyncUser implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id")
    private String id;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号", name = "loginName")
    private String loginName;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码", name = "password")
    private String password;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID", name = "deptId")
    private String deptId;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称", name = "realName")
    private String realName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", name = "mobile")
    private String mobile;

    /**
     * 座机号
     */
    @ApiModelProperty(value = "座机号", name = "telephone")
    private String telephone;


    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    /**
     * 状态（0离职，3在职）
     */
    @ApiModelProperty(value = "状态（0离职，3在职）", name = "status")
    private String status;

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