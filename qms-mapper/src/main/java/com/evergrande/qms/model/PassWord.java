/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: PassWord
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 密码实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 密码实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
public class PassWord {

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", name = "userId")
    private String userId;

    /**
     * 用户当前密码
     */
    @ApiModelProperty(value = "用户当前密码", name = "password")
    private String password;

    /**
     * 新密码
     */
    @ApiModelProperty(value = "新密码", name = "newPassword")
    private String newPassword;

    /**
     * 新密码确认
     */
    @ApiModelProperty(value = "新密码确认", name = "repeatPassword")
    private String repeatPassword;

}