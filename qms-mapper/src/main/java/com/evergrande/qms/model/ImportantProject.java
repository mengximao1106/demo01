/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ImportantProject
 * Author:   laifuying
 * Date:     2018-08-28 10:28
 * Description: 重点项目库Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 重点项目库Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "重点项目库", description= "重点项目库Model")
public class ImportantProject {
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