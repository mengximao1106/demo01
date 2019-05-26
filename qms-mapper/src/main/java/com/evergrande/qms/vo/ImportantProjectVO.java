/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ImportantProjectVO
 * Author:   laifuying
 * Date:     2018-08-28 10:43
 * Description: 重点项目库VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 重点项目库VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "重点项目库VO对象", description= "重点项目库VO")
public class ImportantProjectVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 重点项目代码
     */
    @ApiModelProperty(value = "重点项目代码", name = "projectCode")
    private String projectCode;

    /**
     * 重点项目名称
     */
    @ApiModelProperty(value = "重点项目名称", name = "projectName")
    private String projectName;

    /**
     * 省份
     */
    @ApiModelProperty(value = "省份", name = "province")
    private String province;

    /**
     * 省份
     */
    @ApiModelProperty(value = "省份名称",name = "provinceName")
    private String provinceName;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市", name = "city")
    private String city;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市名称",name = "cityName")
    private String cityName;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址", name = "detailedAddress")
    private String detailedAddress;

    /**
     * 项目联系人
     */
    @ApiModelProperty(value = "项目联系人", name = "projectContact")
    private String projectContact;

    /**
     * 项目联系人电话
     */
    @ApiModelProperty(value = "项目联系人电话", name = "projectContactTelephone")
    private String projectContactTelephone;

    /**
     * 重点项目联系人
     */
    @ApiModelProperty(value = "重点项目联系人", name = "impProjectContact")
    private String impProjectContact;

    /**
     * 重点项目联系人电话
     */
    @ApiModelProperty(value = "重点项目联系人电话", name = "impProjectContactTelephone")
    private String impProjectContactTelephone;

    /**
     * 质检联系人
     */
    @ApiModelProperty(value = "质检联系人", name = "qualityChecker")
    private String qualityChecker;

    /**
     * 质检联系人电话
     */
    @ApiModelProperty(value = "质检联系人电话", name = "qualityCheckerTelephone")
    private String qualityCheckerTelephone;

    /**
     * 管理及监察中心联系人
     */
    @ApiModelProperty(value = "管理及监察中心联系人", name = "manaCenterContact")
    private String manaCenterContact;

    /**
     * 管理及监察中心联系人电话
     */
    @ApiModelProperty(value = "管理及监察中心联系人电话", name = "manaCenterTelephone")
    private String manaCenterTelephone;

    /**
     * 所属质检部
     */
    @ApiModelProperty(value = "所属质检部", name = "department")
    private String department;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
}