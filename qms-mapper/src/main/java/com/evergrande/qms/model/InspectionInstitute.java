/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstitute
 * Author:   laifuying
 * Date:     2018-08-13 15:29
 * Description: 检测院信息Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 检测院信息Model
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测院信息对象", description= "检测院信息model")
public class InspectionInstitute {
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;
    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码",name = "instituteCode")
    private String instituteCode;
    /**
     * 检测院名称
     */
    @ApiModelProperty(value = "检测院名称",name = "instituteName")
    private String instituteName;
    /**
     * 省份
     */
    @ApiModelProperty(value = "省份",name = "province")
    private String province;
    /**
     * 城市
     */
    @ApiModelProperty(value = "城市",name = "city")
    private String city;
    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址",name = "detailedAddress")
    private String detailedAddress;
    /**
     * 国家级检测中心
     */
    @ApiModelProperty(value = "国家级检测中心",name = "nationalInspectCenter")
    private String nationalInspectCenter;
    /**
     * 对应发票/财政收据
     */
    @ApiModelProperty(value = "对应发票/财政收据",name = "receipt")
    private String receipt;
    /**
     * 接样人
     */
    @ApiModelProperty(value = "接样人",name = "recipient")
    private String recipient;
    /**
     * 接样人电话
     */
    @ApiModelProperty(value = "接样人电话",name = "recipientTelephone")
    private String recipientTelephone;
    /**
     * 部门领导
     */
    @ApiModelProperty(value = "部门领导",name = "departmentLeader")
    private String departmentLeader;
    /**
     * 职位
     */
    @ApiModelProperty(value = "职位",name = "position")
    private String position;
    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话",name = "leaderTelephone")
    private String leaderTelephone;
    /**
     * 单位电话
     */
    @ApiModelProperty(value = "单位电话",name = "instituteTelephone")
    private String instituteTelephone;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱",name = "email")
    private String email;
    /**
     * 状态：0-启用；1-未启用
     */
    @ApiModelProperty(value = "状态",name = "status")
    private String status;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人",name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人",name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间",name = "updateDate")
    private Date updateDate;
}