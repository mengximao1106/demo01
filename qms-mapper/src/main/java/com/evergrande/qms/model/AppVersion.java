/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppVersion
 * Author:   chensheng
 * Date:     2018-08-17 9:24
 * Description: APP版本model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * APP版本实体类，与qms_app_version表映射
 *
 * @author chensheng
 * @since 1.0.0
 */


@NoArgsConstructor
@Data
@ApiModel(value = "appVersion对象", description = "App接口model")
public class AppVersion implements Serializable {
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
     *描述
     */
    @ApiModelProperty(value = "描述", name = "apkDesc")
    private String apkDesc;
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
     *创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate",example = "2018-8-17 09:53:48")
    private Date createDate;
    /**
     *修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     *修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate",example = "2018-8-17 09:53:48")
    private Date updateDate;

}