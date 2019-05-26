/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleRequireVO
 * Author:   laifuying
 * Date:     2018-08-07 15:31
 * Description: 取样要求
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.util.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 取样要求
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "取样要求对象", description= "取样要求VO")
public class SampleRequireVO implements Serializable {
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
     * 取样规格
     */
    @ApiModelProperty(value = "取样规格", name = "sampleSize")
    private String sampleSize;

    /**
     * 取样数量（份）
     */
    @ApiModelProperty(value = "取样数量（份）", name = "sampleAmount")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double sampleAmount;

    /**
     * 取样注意事项
     */
    @ApiModelProperty(value = "取样注意事项", name = "sampleNotes")
    private String sampleNotes;
}