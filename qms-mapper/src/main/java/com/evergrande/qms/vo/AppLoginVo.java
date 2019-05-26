/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppLoginVo
 * Author:   chensheng
 * Date:     2018-05-02 09:26
 * Description: 后台登录用户封装类
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.Menu;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 登录后返回参数封装类
 *
 * @author chensheng
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "LoginVO对象", description= "登录后返回参数封装类")
public class AppLoginVo implements Serializable{
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
     * IDM同步用户表 uid
     */
    @ApiModelProperty(value = "IDM同步用户表 uid", name = "uid")
    private String uid;

    /**
     * 菜单列表
     */
    @ApiModelProperty(value = "菜单列表", name = "menuList")
    private List<Menu> menuList;

    /**
     * APP端设备ID
     */
    @ApiModelProperty(value = "APP端设备ID.(0否 1是)", name = "deviceId")
    private String deviceId;

}