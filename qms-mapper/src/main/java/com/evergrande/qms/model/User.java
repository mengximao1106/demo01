/**
 *  * Copyright (C): 恒大集团版权所有 Evergrande Group
 *  * FileName: User
 *  * Author:   wangyu
 *  * Date:    2018-07-18
 *  * Description: 用户实体类
 *  
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类SysUser，与表sys_user映射
 *
 * @author wangyu
 * @since 1.0.0
 */
@Data
@ApiModel(value = "qms_user 对象", description= "User Model")
public class User implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "id主键", name = "id")
    private String id;

    @ApiModelProperty(value = "login_name 用户账号", name = "loginName")
    private String loginName;

    @ApiModelProperty(value = "password 用户密码", name = "password")
    private String password;

    @ApiModelProperty(value = "real_name 用户名称", name = "realName")
    private String realName;

    @ApiModelProperty(value = "dept_id 部门ID", name = "deptId")
    private String deptId;

    @ApiModelProperty(value = "role_id 角色", name = "roleId")
    private String roleId;

    @ApiModelProperty(value = "proj_guids 所属项目", name = "projGuids")
    private String projGuids;

    @ApiModelProperty(value = "mobile 手机", name = "mobile")
    private String mobile;

    @ApiModelProperty(value = "telephone 办公电话", name = "telephone")
    private String telephone;

    @ApiModelProperty(value = "email 邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "status 状态", name = "status")
    private String status;

    @ApiModelProperty(value = "create_user创建人", name = "createUser")
    private String createUser;

    @ApiModelProperty(value = "create_time 创建时间", name = "createTime")
    private Date createDate;

    @ApiModelProperty(value = "update_user 修改人", name = "updateUser")
    private String updateUser;

    @ApiModelProperty(value = "update_time 修改时间", name = "updateTime")
    private Date updateDate;

}
