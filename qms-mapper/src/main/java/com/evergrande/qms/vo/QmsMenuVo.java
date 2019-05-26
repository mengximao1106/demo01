/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMenuVo
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 菜单表实体
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单表VO
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsMenuVo对象", description= "QmsMenuVo")
public class QmsMenuVo implements Serializable {

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
     * 是否勾选
     */
    @ApiModelProperty(value = "是否勾选", name = "checked")
    private boolean checked;

    /**
     * 功能
     */
    @ApiModelProperty(value = "功能", name = "funcVoList")
    private List<QmsFuncVo> funcVoList;

    /**
     * 子菜单
     */
    @ApiModelProperty(value = "子菜单", name = "menuVoList")
    private List<QmsMenuVo> menuVoList;

}