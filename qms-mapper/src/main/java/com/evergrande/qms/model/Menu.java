/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMenu
 * Author:   wangyu
 * Date:     2018-07-17 15:14
 * Description: 菜单表实体
 */
package com.evergrande.qms.model;

import com.evergrande.qms.vo.QmsFuncVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 菜单表实体
 *
 * @author wangyu
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "Menu对象", description= "Menu")
public class Menu{

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
     * 子菜单
     */
    @ApiModelProperty(value = "子菜单", name = "menuList")
    private List<Menu> menuList;

    /**
     * 功能
     */
    @ApiModelProperty(value = "功能", name = "funcVoList")
    private List<QmsFuncVo> funcVoList;
}