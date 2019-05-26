/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialVO
 * Author:   laifuying
 * Date:     2018-08-30 14:50
 * Description: 物料信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 物料/材料信息VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="物料/材料信息VO", description = "物料/材料信息VO")
public class QmsMaterialVO implements Serializable {
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
     * 物料组/材料类别编码
     */
    @ApiModelProperty(value = "物料组/材料类别编码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料组/材料类别名称
     */
    @ApiModelProperty(value = "物料组/材料类别名称", name = "materialTypeName")
    private String materialTypeName;

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
}