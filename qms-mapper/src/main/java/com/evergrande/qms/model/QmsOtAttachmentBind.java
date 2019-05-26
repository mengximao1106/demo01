/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: qmsOtAttachmentBind
 * Author:   mengximao
 * Date:     2018-08-13 12:39
 * Description: 文件上传OT附件中间表 Model 对应 qms_ot_attachment_bind 表
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
 * 文件上传OT附件中间表 Model 对应 qms_ot_attachment_bind 表
 *
 * @author mengximao
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsOtAttachmentBind", description= "文件上传OT附件中间表")
@Table(name = "qms_ot_attachment_bind")
public class QmsOtAttachmentBind implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    @Id
    private String id;
    /**
     * 文件存储OT附件表id
     */
    @ApiModelProperty(value = "文件存储OT附件表id", name = "otAttachmentId")
    private String otAttachmentId;
    /**
     * 关联主键id
     */
    @ApiModelProperty(value = "关联主键id", name = "relevanceId")
    private String relevanceId;
    /**
     * 文件类型:1-送检委托书,2-委托书回函,3-检测报告
     */
    @ApiModelProperty(value = "文件类型:1-送检委托书,2-委托书回函,3-检测报告", name = "type")
    private String type;
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
