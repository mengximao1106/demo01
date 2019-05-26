/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionOrderVO
 * Author:   mengximao
 * Date:     2018-07-27 10:48
 * Description: 检测订单VO
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
 * 检测订单VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionOrderVO 对象", description = "检测订单VO")
public class QmsSumbitProxyVO implements Serializable {

    /**
     * 检测机构编码
     */
    @ApiModelProperty(value="检测机构编码", name="instituteCode")
    private String instituteCode;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value="检测机构名称", name="instituteName")
    private String instituteName;

    /**
     * 送检时间
     */
    @ApiModelProperty(value="送检时间", name="inspectionSendTime")
    private String inspectionSendTime;

    /**
     * 检测订单号
     */
    @ApiModelProperty(value="检测订单号", name="inspectionOrderNum")
    private String inspectionOrderNum;

    /**
     * 订单状态：1-待确认，2-待收样，3-待检测，4-已检测，5-已取消
     */
    @ApiModelProperty(value="订单状态：1-待确认，2-待收样，3-待检测，4-已检测，5-已取消", name="orderStatus")
    private String orderStatus;

    /**
     *物料订单检测项目VO
     */
    private List<QmsMaterialInfoVO> materialInfoVOList;

    /**
     * 文件上传OT返回的信息VO
     */
    @ApiModelProperty(value="OT返回的信息VO", name="downloadInfoVOList")
    private List<QmsDownloadInfoVO> downloadInfoVOList;
}
