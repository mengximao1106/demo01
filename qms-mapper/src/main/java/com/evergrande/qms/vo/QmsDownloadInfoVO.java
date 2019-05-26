/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsDownloadInfoVO
 * Author:   mengximao
 * Date:     2018-08-10 12:42
 * Description: OT文件下载入参信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * OT文件下载入参信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsDownloadInfoVO对象", description= "OT文件下载入参信息VO")
public class QmsDownloadInfoVO implements Serializable {

    /**
     * 文件类型：1-送检委托书，2-委托书回函，3-检测报告
     */
    @ApiModelProperty(value = "文件类型：1-送检委托书，2-委托书回函，3-检测报告",name = "fileType")
    private String fileType;

    /**
     * 下载文件入参列表
     */
    @ApiModelProperty(value = "下载文件入参列表",name = "qmsUploadOtInfoVOList")
    private List<QmsUploadOtInfoVO> qmsUploadOtInfoVOList;
}
