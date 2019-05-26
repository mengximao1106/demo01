/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialTypeVO
 * Author:   laifuying
 * Date:     2018-07-25 16:01
 * Description: 物料组（类型）VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 物料组（类型）VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料组VO对象", description= "物料组VO")
public class MaterialTypeVO implements Serializable {
    /**
     * 物料组代码
     */
    @ApiModelProperty(value = "物料组代码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料组名称
     */
    @ApiModelProperty(value = "物料组名称", name = "materialTypeName")
    private String materialTypeName;

    /**
     * 材料负责人
     */
    @ApiModelProperty(value = "材料负责人", name = "materialManager")
    private String materialManager;

    /**
     * 变更类型（C为新增，U为更新，D为删除）
     */
    @ApiModelProperty(value = "变更类型", name = "crudType")
    private String crudType;
}