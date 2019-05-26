/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialManage
 * Author:   liaowenlong
 * Date:     2018-09-13 8:47
 * Description: 材料管理model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料管理model
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsMaterialManage对象",description = "材料管理对象")
public class QmsMaterialManage implements Serializable {
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
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码名称", name = "materialName")
    private String materialName;

}
