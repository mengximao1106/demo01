/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppLoginResVO
 * Author:   chensheng
 * Date:     2018-08-09
 * Description: app登录后返回数据的封装对象
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.Menu;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * app登录后返回数据的封装对象
 *
 * @author chensheng
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "AppLoginResVO对象", description= "APP登录返回参数封装类")
public class AppLoginResVO implements Serializable{
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
     * 菜单列表
     */
    @ApiModelProperty(value = "菜单列表", name = "menuVoList")
    private List<Menu> menuList;

    /**
     * 系统权限
     */
    @ApiModelProperty(value = "系统权限", name = "sysPower")
	@JsonIgnore
    private String sysPower;

    /**
     * 系统权限集合
     */
    @ApiModelProperty(value = "系统权限集合", name = "sysPowerList")
    private List sysPowerList;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", name = "mobile")
    private String mobile;

    /**
     * 部门（1内部，2外部）
     */
    @ApiModelProperty(value = "部门（1内部，2外部）", name = "department")
    private Integer department;
}