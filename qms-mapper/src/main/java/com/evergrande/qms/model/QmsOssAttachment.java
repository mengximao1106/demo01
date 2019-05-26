/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Dictionary
 * Author:   liuww
 * Date:     2018-08-10
 * Description: 文件存储oss附件表(QmsOssAttachment)表实体类
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 文件存储oss附件表(QmsOssAttachment)表实体类
 *
 * @author liuww
 * @since 2018-08-10
 */
@NoArgsConstructor
@Data
@ApiModel(value = "文件存储oss附件", description= "QmsOssAttachment")
@Table(name = "qms_oss_attachment")
public class QmsOssAttachment {
    /**
     * 主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    @Id
    private String id;
    /**
     * 上传文件oss返回的存储路径
     */
    @ApiModelProperty(value = "上传文件oss返回的存储路径", name = "ossKey")
    @Column(name = "`oss_key`")
    private String ossKey;
    /**
     * 上传文件oss返回文件下载url
     */
    @ApiModelProperty(value = "上传文件oss返回文件下载url", name = "ossUrl")
    private String ossUrl;

    /**
     * 文件大小
     */
    @ApiModelProperty(value = "文件大小", name = "fileSize")
    private Long fileSize;

    @ApiModelProperty(value = "源文件名", name = "originalFileName")
    private String originalFileName;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate")
    private Date updateDate;
    /**
     * Y：有效  N：无效
     */
    @ApiModelProperty(value = "Y：有效  N：无效", name = "status")
    @Column(name = "`status`")
    private String status;
}