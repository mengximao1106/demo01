/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsOtAttachment
 * Author:   mengximao
 * Date:     2018-08-13 12:34
 * Description: 文件存储OT Model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 文件存储OT附件表 Model 对应qms_ot_attachment 表
 *
 * @author mengximao
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsOssAttachment", description= "文件存储OT附件")
@Table(name = "qms_ot_attachment")
public class QmsOtAttachment implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    @Id
    private String id;
    /**
     * 上传文件oss返回的id
     */
    @ApiModelProperty(value = "上传文件oss返回的id", name = "returnId")
    private String returnId;
    /**
     * 上传文件名
     */
    @ApiModelProperty(value = "上传文件名", name = "fileName")
    private String fileName;
    /**
     * 文件大小
     */
    @ApiModelProperty(value = "文件大小",name = "fileSize")
    private Long fileSize;
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
    private String status;
}
