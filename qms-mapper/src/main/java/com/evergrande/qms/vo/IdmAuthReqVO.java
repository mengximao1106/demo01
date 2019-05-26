/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: IdmAuthReqVO
 * Author:   huangxiaoqiu
 * Date:     2018-04-27 16:09
 * Description: idm身份验证传递参数封装类
 */
package com.evergrande.qms.vo;
/**
 * @author kate
 * @create 2018/4/27
 * @since 1.0.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * idm身份验证请求参数封装类
 *
 * @author huangxiaoqiu
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class IdmAuthReqVO implements Serializable {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;

}