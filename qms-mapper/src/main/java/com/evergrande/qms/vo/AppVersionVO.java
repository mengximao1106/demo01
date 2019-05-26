/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppVersion
 * Author:   chensheng
 * Date:     2018-8-17 14:49:10
 * Description:
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * app版本VO
 * @author chensheng
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "appVersion对象", description= "App接口model")
public class AppVersionVO implements Serializable{
    /**
     * id
     */
    @ApiModelProperty(value = "主键ID", name = "id")
    private String id;
    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号", name = "apkCode")
    private String apkCode;
    /**
     *版本名称
     */
    @ApiModelProperty(value = "版本名称", name = "apkName")
    private String apkName;
    /**
     *文件名
     */
    @ApiModelProperty(value = "文件名", name = "apkFilename")
    private String apkFilename;
    /**
     *描述
     */
    @ApiModelProperty(value = "描述", name = "apkDesc")
    private String apkDesc;
    /**
     *二维码地址
     */
    @ApiModelProperty(value = "二维码地址", name = "qrCode")
    private String qrCode;
    /**
     *类型（0：Android，1：IOS）
     */
    @ApiModelProperty(value = "类型（0：Android，1：IOS）", name = "apkType")
    private String apkType;
    /**
     *下载路径
     */
    @ApiModelProperty(value = "下载路径", name = "apkDownLoad")
    private String apkDownLoad;
    /**
     *是否强制更新（S：必须更新，G：建议更新，N：无更新）
     */
    @ApiModelProperty(value = "是否强制更新（S：必须更新，G：建议更新，N：无更新）", name = "updateType")
    private String updateType;
    /**
     *是否删除（0：不删除，1：删除）
     */
    @ApiModelProperty(value = "是否删除（0：不删除，1：删除）", name = "deleteDb")
    private Boolean deleteDb;
    /**
     *是否部署（0：否，1：是）
     */
    @ApiModelProperty(value = "是否部署（0：否，1：是）", name = "deployDb")
    private Boolean deployDb;
    /**
     *是否允许部署（0：否，1：是）
     */
    @ApiModelProperty(value = "是否部署（0：否，1：是）", name = "isDeployDb")
    private Boolean isDeployDb;
    /**
     *软件大小
     */
    @ApiModelProperty(value = "软件大小", name = "apkSize")
    private String apkSize;
    /**
     *设备类型（android，ios）
     */
    @ApiModelProperty(value = "设备类型（android，ios）", name = "platform")
    private String platform;
    /**
     *创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;
    /**
     *部署时间
     */
    @ApiModelProperty(value = "部署时间", name = "deployDate",example = "2017-03-20 17:48:30")
    private Date deployDate;
    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate",example = "2017-03-20 17:48:30")
    private Date createDate;
    /**
     *修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     *修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate",example = "2017-03-20 17:48:30")
    private Date updateDate;
}
