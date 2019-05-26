/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: RipeMaterialVO
 * Author:   laifuying
 * Date:     2018-07-26 11:22
 * Description: 成品物料VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 成品物料VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "成品物料VO对象", description= "成品物料VO")
public class RipeMaterialVO implements Serializable {
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
     * 物料种类(原材料-0/半成品-1/成品-2)
     */
    @ApiModelProperty(value = "物料种类(原材料-0/半成品-1/成品-2)", name = "materialCategory")
    private String materialCategory;

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
}