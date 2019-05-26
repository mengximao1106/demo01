/**
 *  * Copyright (C): 恒大集团版权所有 Evergrande Group
 *  * FileName: UserVo
 *  * Author:   wangyu
 *  * Date:    2018-07-18
 *  * Description: 用户实体类
 *  
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类SysUser，与表sys_user映射
 *
 * @author wangyu
 * @since 1.0.0
 */
@Data
@ApiModel(value = "qms_user 对象", description= "User Model")
public class UserVo implements Serializable {

    @ApiModelProperty(value = "用户ID", name = "userId")
    private String userId;

    @ApiModelProperty(value = "用户名称", name = "userName")
    private String userName;

    @ApiModelProperty(value = "手机号", name = "mobile")
    private String mobile;

    @ApiModelProperty(value = "账号", name = "loginName")
    private String loginName;

    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "部门ID", name = "deptId")
    private String deptId;

    @ApiModelProperty(value = "部门名称", name = "deptName")
    private String deptName;

}
