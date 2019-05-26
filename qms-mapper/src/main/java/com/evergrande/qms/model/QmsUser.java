/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUser
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 用户表实体
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
 * 用户表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsUser对象", description= "QmsUser")
public class QmsUser implements Serializable {
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
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    /**
     * 状态（0停用，1正常，2冻结）
     */
    @ApiModelProperty(value = "状态（0停用，1正常，2冻结）", name = "status")
    private Integer status;

    /**
     * 部门（1内部，2外部）
     */
    @ApiModelProperty(value = "部门（1内部，2外部, 3管理员）", name = "department")
    private Integer department;

    /**
     * 权限类型（1标准，2自定义）
     */
    @ApiModelProperty(value = "权限类型（1标准，2自定义）", name = "powerType")
    private Integer powerType;

    /**
     * 系统权限（1智慧验收，2抽样送检）
     */
    @ApiModelProperty(value = "系统权限（1智慧验收，2抽样送检）", name = "sysPower")
    private String sysPower;

    /**
     * 是否是超级管理员（0不是； 1是）
     */
    @ApiModelProperty(value = "是否是超级管理员（0不是； 1是）", name = "isAdmin")
    private Integer isAdmin;

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

    /**
     * 是否需要提示修改密码.(0否 1是)
     */
    @ApiModelProperty(value = "是否需要提示修改密码.(0否 1是)", name = "isInitial")
    private Integer isInitial;

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
     * 用户ID集合
     */
    @ApiModelProperty(value = "修改时间", name = "用户ID集合")
    private List<String> userIdList;

    /**
     * 领导表示(0否 1是)
     */
    @ApiModelProperty(value = "领导表示(0否 1是)", name = "isLed")
    private Integer isLed;
}