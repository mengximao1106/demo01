/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachment
 * Author:   liaowenlong
 * Date:     2018-08-13 15:12
 * Description: oss附件表model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * oss附件表model
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "oss附件表model", description= "oss附件表model")
public class OssAttachment implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id",name = "id")
    private String id;
    /**
     * 上传文件oss返回的存储路径
     */
    @ApiModelProperty(value = "上传文件oss返回的存储路径",name = "ossKey")
    private String ossKey;
    /**
     * 上传文件oss返回文件下载url
     */
    @ApiModelProperty(value = "上传文件oss返回文件下载url",name = "ossUrl")
    private String ossUrl;
    /**
     *附件大小
     */
    @ApiModelProperty(value = "附件大小",name = "fileSize")
    private Long fileSize;
    /**
     * 原文件名
     */
    @ApiModelProperty(value = "原文件名",name = "originalFileName")
    private String originalFileName;
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
    /**
     * 附件状态:Y：有效  N：无效
     */
    @ApiModelProperty(value = "附件状态:Y：有效  N：无效",name = "status")
    private String status;



}
