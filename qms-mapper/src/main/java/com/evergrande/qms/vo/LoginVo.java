/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: LoginVo
 * Author:   wangyu
 * Date:     2018-05-02 09:26
 * Description: 后台登录用户封装类
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.Menu;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录后返回参数封装类
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "LoginVO对象", description= "登录后返回参数封装类")
public class LoginVo{
    /**
     * 登录成功后返回token
     */
    @ApiModelProperty(value = "token", name = "token")
    private String token;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", name = "userId")
    private String userId;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号", name = "loginName")
    private String loginName;


    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", name = "password")
    private String password;

    /**
     * 用户真实姓名
     */
    @ApiModelProperty(value = "用户真实姓名", name = "realName")
    private String realName;

    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码", name = "instituteCode")
    private String instituteCode;

    /**
     * 是否需要提示修改密码.(0否 1是)
     */
    @ApiModelProperty(value = "是否需要提示修改密码.(0否 1是)", name = "isInitial")
    private Integer isInitial;

    /**
     * 菜单列表
     */
    @ApiModelProperty(value = "菜单列表", name = "menuList")
    private List<Menu> menuList;

    /**
     * 领导表示(0否 1是)
     */
    @ApiModelProperty(value = "领导表示(0否 1是)", name = "isLed")
    private Integer isLed;

    /**
     * 部门（1内部，2外部）
     */
    @ApiModelProperty(value = "部门（1内部，2外部, 3管理员）", name = "department")
    private Integer department;

    /**
     * 踢出标识(0提示，1登出)
     */
    @ApiModelProperty(value = "踢出标识(0提示，1登出)", name = "kickOut")
    private Integer kickOut;
}