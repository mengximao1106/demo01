/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserMenuFunc
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 用户功能关联表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户功能关联表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsUserMenuFunc对象", description= "QmsUserMenuFunc")
public class QmsUserMenuFunc implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id")
    private String id;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", name = "userId")
    private String userId;

    /**
     * 功能ID
     */
    @ApiModelProperty(value = "功能ID", name = "menuFuncId")
    private String menuFuncId;

    /**
     * 是否可用（1-是、 2-否）
     */
    @ApiModelProperty(value = "是否可用（1-是、 2-否）", name = "status")
    private Integer status;

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