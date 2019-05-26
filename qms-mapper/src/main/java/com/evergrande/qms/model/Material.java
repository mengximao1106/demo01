/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Material
 * Author:   laifuying
 * Date:     2018-07-26 11:15
 * Description: 物料（包含原材料）Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 物料（包含原材料）Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料对象", description= "物料model")
public class Material {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 物料代码
     */
    @ApiModelProperty(value = "物料代码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialName")
    private String materialName;

    /**
     * 物料组编码
     */
    @ApiModelProperty(value = "物料组编码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料种类
     */
    @ApiModelProperty(value = "物料种类", name = "materialCategory")
    private String materialCategory;

    /**
     * 类型(原材料-0/半成品-1/成品-2)
     */
    @ApiModelProperty(value = "类型(原材料-0/半成品-1/成品-2)", name = "genre")
    private String genre;

    /**
     * 原生产厂商
     */
    @ApiModelProperty(value = "原生产厂商", name = "originalManufacturer")
    private String originalManufacturer;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", name = "unit")
    private String unit;

    /**
     * 变更类型（C为新增，U为更新，D为删除）
     */
    @ApiModelProperty(value = "变更类型", name = "crudType")
    private String crudType;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate", example = "2018-07-24 14:10:08")
    private Date createDate;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate", example = "2018-07-24 14:10:08")
    private Date updateDate;
}