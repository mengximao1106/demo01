/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachmentBind
 * Author:   liaowenlong
 * Date:     2018-08-13 15:00
 * Description: 附件表model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * oss附件关联表
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "oss附件关联表", description= "oss附件关联表")
public class OssAttachmentBind implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id",name = "id")
    private String id;
    /**
     * oss附件id
     */
    @ApiModelProperty(value = "oss附件id",name = "ossAttachmentId")
    private String ossAttachmentId;
    /**
     * 抽检计划id
     */
    @ApiModelProperty(value = "抽检计划id",name = "relevanceId")
    private String relevanceId;
    /**
     * 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书
     */
    @ApiModelProperty(value = "文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书",name = "type")
    private String type;
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

    /**
     * oss附件表model
     */
    @ApiModelProperty(value = "oss附件表model",name = "ossAttachmentList")
    private List<OssAttachment> ossAttachmentList;
}
