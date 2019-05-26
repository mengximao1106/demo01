/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialDeaelVO
 * Author:   liaowenlong
 * Date:     2018-09-13 11:27
 * Description: 取样要求VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 取样要求VO
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsMaterialDeailVO", description = "取样要求vo")
public class QmsMaterialDeailVO implements Serializable {
    /**
     *物料编号
     */
    @ApiModelProperty(value = "物料编号", name = "materialode")
    private String materialCode;
    /**
     *物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialName")
    private String materialName;
    /**
     *材料类别编码
     */
    @ApiModelProperty(value = "材料类别编码", name = "materialTypeCode")
    private String materialTypeCode;
    /**
     *取样数量
     */
    @ApiModelProperty(value = "取样数量", name = "sampleAmount")
    private String sampleAmount;
    /**
     *材料类别名称
     */
    @ApiModelProperty(value = "材料类别名称", name = "materialTypeName")
    private String materialTypeName;
    /**
     *材料负责人
     */
    @ApiModelProperty(value = "材料负责人", name = "materialManager")
    private String materialManager;
    /**
     *材料负责人名称
     */
    @ApiModelProperty(value = "材料负责人名称", name = "materialManagerName")
    private String materialManagerName;
    /**
     *标准名称
     */
    @ApiModelProperty(value = "标准名称", name = "standardName")
    private String standardNum;
    /**
     * 取样要求检测项目VO
     */
    @ApiModelProperty(value = "取样要求检测项目VO", name = "qmsMaterialItemVOList")
    private List<QmsMaterialItemVO> qmsMaterialItemVOList;
}
