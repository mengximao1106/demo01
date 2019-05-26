/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachmentVO
 * Author:   laifuying
 * Date:     2018-08-23 14:03
 * Description: OSS附件VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OSS附件VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "OSS附件对象", description= "OSS附件对象")
public class OssAttachmentVO {
    /**
     * 附件ID
     */
    @ApiModelProperty(value = "附件ID",name = "id")
    private String id;

    /**
     * 绑定附件表ID
     */
    @ApiModelProperty(value = "绑定附件表ID",name = "bId")
    private String bId;

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
}