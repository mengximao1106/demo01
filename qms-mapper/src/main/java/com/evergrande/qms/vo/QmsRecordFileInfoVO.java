/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsRecordFileInfoVO
 * Author:   mengximao
 * Date:     2018-08-23 8:50
 * Description: 抽样记录文件下载信息
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * 抽样记录文件下载信息 VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsRecordFileInfoVO对象", description= "OT文件下载入参信息VO")
public class QmsRecordFileInfoVO implements Serializable {

    /**
     * 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书
     */
    @ApiModelProperty(value = "文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书",name = "fileType")
    private String fileType;

    /**
     * OSS文件下载信息
     */
    @ApiModelProperty(value = "OSS文件下载信息",name = "ossAttachmentVOList")
    private List<QmsOssAttachmentVO> ossAttachmentVOList;
}
