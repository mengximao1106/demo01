/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialManageSearchVO
 * Author:   laifuying
 * Date:     2018-09-26 11:06
 * Description: 材料管理查询VO
 */
package com.evergrande.qms.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料管理查询VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "材料管理查询VO", description= "材料管理查询VO")
public class MaterialManageSearchVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * id以英文逗号分隔。如1,2,3
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3", name = "ids")
    private String ids;

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
}