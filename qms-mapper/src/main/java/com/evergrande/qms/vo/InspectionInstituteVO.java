/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteVO
 * Author:   laifuying
 * Date:     2018-08-13 16:37
 * Description: 检测院信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 检测院信息VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测院信息VO对象", description= "检测院信息VO")
public class InspectionInstituteVO implements Serializable {
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
    @ApiModelProperty(value = "省份ID",name = "province")
    private String province;

    /**
     * 省份
     */
    @ApiModelProperty(value = "省份名称",name = "provinceName")
    private String provinceName;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市ID",name = "city")
    private String city;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市名称",name = "cityName")
    private String cityName;

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
     * 附件信息列表
     */
    @ApiModelProperty(value = "附件信息列表", name = "ossAttachmentVoList")
    private List<OssAttachmentVO> ossAttachmentVoList;
}