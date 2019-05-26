/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsForepartInfoVO
 * Author:   mengximao
 * Date:     2018-07-31 10:30
 * Description: 初样检测信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 样品检测信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsSampleInspectionInfoVO对象",description = "样品检测信息VO")
public class QmsSampleInspectionInfoVO implements Serializable {

    /**
     * 初检信息-抽检计划信息VO
     */
    @ApiModelProperty(value = "抽检计划信息", name = "qmsSamplePlanInfoVO")
    private QmsSamplePlanInfoVO qmsSamplePlanInfoVO;

    /**
     * 初检信息- 检测项目
     */
    @ApiModelProperty(value = "检测项目", name = "qmsForepartTestItemVOList")
    private List<QmsForepartTestItemVO> qmsForepartTestItemVOList;

    /**
     * 初检信息-检测结果信息VO
     */
    @ApiModelProperty(value = "检测结果信息", name = "qmsInspectionResultInfoVO")
    private QmsInspectionResultInfoVO qmsInspectionResultInfoVO;

    /**
     * OT初检信息-文件下载信息
     */
    @ApiModelProperty(value = "文件下载信息", name = "qmsDownloadInfoVOList")
    private List<QmsDownloadInfoVO> qmsDownloadInfoVOList;

    /**
     * OSS文件下载信息
     */
    @ApiModelProperty(value = "OSS文件下载信息",name = "ossAttachmentVOList")
    private List<QmsOssAttachmentVO> ossAttachmentVOList;

}
