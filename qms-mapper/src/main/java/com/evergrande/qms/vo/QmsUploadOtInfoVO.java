/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUploadInfo
 * Author:   mengximao
 * Date:     2018-08-07 16:04
 * Description: 文件上传OT返回的信息Model
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 文件上传OT返回的信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsUploadOtInfo对象", description= "文件上传OT返回的信息Model")
public class QmsUploadOtInfoVO implements Serializable {
    /**
     * 文件上传OT返回的id
     */
    @ApiModelProperty(value = "文件上传OT返回的id",name = "id")
    private String id;

    /**
     * 文件名
     */
    @ApiModelProperty(value = "文件名",name = "fileName")
    private String fileName;

    /**
     * 文件大小
     */
    @ApiModelProperty(value = "文件大小",name = "size")
    private Long size;

}
