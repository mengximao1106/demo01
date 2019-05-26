/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemVO
 * Author:   laifuying
 * Date:     2018-08-07 8:38
 * Description: 物料（材料）管理VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 检测项目管理VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料（材料）管理VO对象", description= "物料（材料）管理VO")
public class MaterialManageVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialName")
    private String materialName;

    /**
     * 物料类别/材料类别编码
     */
    @ApiModelProperty(value = "物料类别/材料类别编码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料类别/材料类别名称
     */
    @ApiModelProperty(value = "物料类别/材料类别名称", name = "materialTypeName")
    private String materialTypeName;

    /**
     * 物料种类/材料种类
     */
    @ApiModelProperty(value = "物料种类/材料种类", name = "materialCategory")
    private String materialCategory;

    /**
     * 监控指标类型/抽样类型
     */
    @ApiModelProperty(value = "监控指标类型/抽样类型", name = "monitorIndicatorType")
    private String monitorIndicatorType;

    /**
     * 类型(原材料-0/半成品-1/成品-2)
     */
    @ApiModelProperty(value = "类型(原材料-0/半成品-1/成品-2)", name = "genre")
    private String genre;
}