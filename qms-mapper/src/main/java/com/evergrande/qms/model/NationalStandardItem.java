/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandardItem
 * Author:   laifuying
 * Date:     2018-08-21 10:27
 * Description: 国家标准检测项目Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 国家标准检测项目Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "国家标准检测项目", description= "国家标准检测项目model")
public class NationalStandardItem {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 国家标准号
     */
    @ApiModelProperty(value = "国家标准号", name = "standardNum")
    private String standardNum;

    /**
     * 检测编号
     */
    @ApiModelProperty(value = "检测编号", name = "inspectionCode")
    private String inspectionCode;

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