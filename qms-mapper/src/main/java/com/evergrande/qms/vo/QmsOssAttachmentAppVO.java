/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachment
 * Author:   chensheng
 * Date:     2018-08-13 15:12
 * Description: oss附件表model
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.OssAttachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * oss附件表model
 *
 * @author chensheng
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "oss附件表model", description= "oss附件表model")
public class QmsOssAttachmentAppVO implements Serializable {
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
     * 关联主键id
     */
    @ApiModelProperty(value = "关联主键id",name = "relevanceId")
    private String relevanceId;

    /**
     * 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书,8-国标附件
     */
    @ApiModelProperty(value = "文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书,8-国标附件",name = "type")
    private String type;
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
