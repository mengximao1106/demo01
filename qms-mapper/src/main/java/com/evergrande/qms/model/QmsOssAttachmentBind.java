/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Dictionary
 * Author:   liuww
 * Date:     2018-08-10
 * Description: oss附件关联表(QmsOssAttachmentBind)表实体类
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
 * oss附件关联表(QmsOssAttachmentBind)表实体类
 *
 * @author liuww
 * @since 2018-08-10
 */
@NoArgsConstructor
@Data
@ApiModel(value = "oss附件关联表", description= "QmsOssAttachmentBind")
@Table(name = "qms_oss_attachment_bind")
public class QmsOssAttachmentBind {
    /**
     * 主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    @Id
    private String id;
    /**
     * oss附件id
     */
    @ApiModelProperty(value = "oss附件id", name = "ossAttachmentId")
    private String ossAttachmentId;
    /**
     * 关联主键id
     */
    @ApiModelProperty(value = "关联主键id", name = "relevanceId")
    private String relevanceId;
    /**
     * 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书
     */
    @ApiModelProperty(value = "文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书", name = "type")
    private Integer type;
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