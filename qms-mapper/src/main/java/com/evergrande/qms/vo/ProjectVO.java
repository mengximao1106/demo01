/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ProjectVO
 * Author:   laifuying
 * Date:     2018-07-24 15:31
 * Description: 项目信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目信息VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "项目VO对象", description= "项目VO")
public class ProjectVO implements Serializable {
    /**
     * 项目大分期编号 主键
     */
    @ApiModelProperty(value = "项目大分期编号", name = "projectCode")
    private String projectCode;

    /**
     * 项目大分期名称
     */
    @ApiModelProperty(value = "项目大分期名称", name = "projectName")
    private String projectName;

    /**
     * 楼盘项目编号
     */
    @ApiModelProperty(value = "楼盘项目编号", name = "buildingItemCode")
    private String buildingItemCode;

    /**
     * 楼盘项目名称
     */
    @ApiModelProperty(value = "楼盘项目名称", name = "buildingItemName")
    private String buildingItemName;

    /**
     * 地区公司编号
     */
    @ApiModelProperty(value = "地区公司编号", name = "areaCompanyCode")
    private String areaCompanyCode;

    /**
     * 地区公司名称
     */
    @ApiModelProperty(value = "地区公司名称", name = "areaCompanyName")
    private String areaCompanyName;

    /**
     * 工厂
     */
    @ApiModelProperty(value = "工厂", name = "factory")
    private String factory;

    /**
     * 项目公司
     */
    @ApiModelProperty(value = "项目公司", name = "projectCompany")
    private String projectCompany;

    /**
     * 省份
     */
    @ApiModelProperty(value = "省份", name = "province")
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市", name = "city")
    private String city;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址", name = "detailedAddress")
    private String detailedAddress;

    /**
     * 收样人
     */
    @ApiModelProperty(value = "收样人", name = "collector")
    private String collector;

    /**
     * 变更类型（C为新增，U为更新，D为删除）
     */
    @ApiModelProperty(value = "变更类型", name = "crudType")
    private String crudType;

}