/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionItem
 * Author:   liaowenlong
 * Date:     2018-09-14 15:51
 * Description: 材料检测项目表
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料检测项目表
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionItem 对象", description = "材料检测项目表")
public class QmsInspectionItem implements Serializable{
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 标准号
     */
    @ApiModelProperty(value = "标准号", name = "standardNum")
    private String standardNum;
    /**
     * 标准名称
     */
    @ApiModelProperty(value = "标准名称", name = "standardName")
    private String standardName;
    /**
     * 物料编号
     */
    @ApiModelProperty(value = "物料编号", name = "materialCode")
    private String materialCode;
    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码", name = "inspectionCode")
    private String inspectionCode;

}
