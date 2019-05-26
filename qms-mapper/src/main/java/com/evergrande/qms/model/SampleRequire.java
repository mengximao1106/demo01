/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleRequire
 * Author:   laifuying
 * Date:     2018-08-07 15:27
 * Description: 取样要求
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 取样要求
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "取样要求对象", description= "取样要求model")
public class SampleRequire {
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
     * 取样规格
     */
    @ApiModelProperty(value = "取样规格", name = "sampleSize")
    private String sampleSize;

    /**
     * 取样数量（份）
     */
    @ApiModelProperty(value = "取样数量（份）", name = "sampleAmount")
    private Double sampleAmount;

    /**
     * 取样注意事项
     */
    @ApiModelProperty(value = "取样注意事项", name = "sampleNotes")
    private String sampleNotes;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate", example = "2018-07-24 14:10:08")
    private Date createDate;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate", example = "2018-07-24 14:10:08")
    private Date updateDate;
}