/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachment
 * Author:   liaowenlong
 * Date:     2018-08-13 15:12
 * Description: oss附件表model
 */
package com.evergrande.qms.vo;

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
public class QmsOssAttachmentVO implements Serializable {
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
     * 附件状态:Y：有效  N：无效
     */
    @ApiModelProperty(value = "附件状态:Y：有效  N：无效",name = "status")
    private String status;
    /**
     * 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书,8-国标附件,9-判定附件
     */
    @ApiModelProperty(value = "文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书,8-国标附件,9-判定附件",name = "type")
    private String type;
    /**
     * 关联主键id
     */
    @ApiModelProperty(value = "关联主键id",name = "relevanceId")
    private String relevanceId;
    /**
     * 文件大小（单位为字节）
     */
    @ApiModelProperty(value = "文件大小（单位为字节）",name = "fileSize")
    private Long fileSize;


}
