/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMenu
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 菜单表实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsMenu对象", description= "QmsMenu")
public class QmsMenu implements Serializable {

    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    private String id;

    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称", name = "menuName")
    private String menuName;

    /**
     * 菜单URL
     */
    @ApiModelProperty(value = "菜单URL", name = "menuUrl")
    private String menuUrl;

    /**
     * 父节点ID
     */
    @ApiModelProperty(value = "父节点ID", name = "parentId")
    private String parentId;

    /**
     * 权限类型（0表示admin；1表示app）
     */
    @ApiModelProperty(value = "id主键", name = "type")
    private Integer type;

    /**
     * 序列号
     */
    @ApiModelProperty(value = "序列号", name = "menuOrder")
    private Integer menuOrder;

    /**
     * 状态（1无效，2有效）
     */
    @ApiModelProperty(value = "状态（1无效，2有效）", name = "status")
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