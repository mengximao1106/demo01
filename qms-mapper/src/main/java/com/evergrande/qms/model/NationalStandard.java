/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandard
 * Author:   laifuying
 * Date:     2018-08-21 9:44
 * Description: 国家标准Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * 国家标准Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "国家标准", description= "国家标准model")
public class NationalStandard {
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
     * 标准性质
     */
    @ApiModelProperty(value = "标准性质", name = "standardProperty")
    private String standardProperty;

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