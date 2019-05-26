/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialType
 * Author:   laifuying
 * Date:     2018-07-25 15:58
 * Description: 物料组（类型）Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 物料组（类型）Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "物料组对象", description= "物料组model")
public class MaterialType {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

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

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate", example = "2018-07-24 14:10:08")
    private Date createDate;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate", example = "2018-07-24 14:10:08")
    private Date updateDate;
}