/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: IdmAuthResVO
 * Author:   huangxiaoqiu
 * Date:     2018-04-27 18:35
 * Description: idm身份认证返回结果封装类
 */
package com.evergrande.qms.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * idm身份认证返回结果封装类
 *
 * @author huangxiaoqiu
 * @since 1.0.0
 */
@Data
public class IdmAuthResVO implements Serializable {
    /**
     * String（true，false）返回接口调用状态
     */
    private String status;
    /**
     * String 返回操作消息
     */
    private String message;

    /**
     * idm返回字段：ticketValue
     */
    private String ticketValue;

    /**
     * idm返回字段：ticketName
     */
    private String ticketName;

    /**
     * 登录用户名：对应返回json的smart-alias字段
     */
    private String loginName;

    /**
     * idm返回字段：uid
     */
    private String uid;

}