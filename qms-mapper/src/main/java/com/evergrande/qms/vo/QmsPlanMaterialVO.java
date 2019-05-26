/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsPlanMaterialVO
 * Author:   mengximao
 * Date:     2018-08-10 16:47
 * Description: 抽样计划编码、物料编码VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 抽样计划编码、物料编码VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsPlanMaterialVO", description = "抽样计划编码、物料编码VO")
public class QmsPlanMaterialVO implements Serializable {

    /**
     * 抽检计划编号
     */
    @ApiModelProperty(value = "抽检计划编号", name = "samplePlanCode")
    private String samplePlanCode;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 检测订单号
     */
    @ApiModelProperty(value="检测订单号", name="inspectionOrderNum")
    private String inspectionOrderNum;

    /**
     * 复核标志：3-复检，4-不复检，5-改判结果
     */
    @ApiModelProperty(value = "复核标志：3-复检，4-不复检，5-改判结果", name = "reviewFlag")
    private String reviewFlag;

    /**
     * 校对标志：1-通过，2-不通过
     */
    @ApiModelProperty(value = "校对标志：1-通过，2-不通过", name = "revisionFlag")
    private String revisionFlag;

    /**
     * 是否复检： 1-复检，2-初检
     */
    @ApiModelProperty(value = "是否复检： 1-复检，2-初检", name = "recheckFlag")
    private String recheckFlag;

    /**
     * 校对不通过备注
     */
    @ApiModelProperty(value="校对不通过备注", name="revisionRemarks")
    private String revisionRemarks;

    /**
     * 复核：判定原因
     */
    @ApiModelProperty(value="判定原因", name="determineReason")
    private String determineReason;

    /**
     * 附件信息列表
     */
    @ApiModelProperty(value = "附件信息列表", name = "ossAttachmentVoList")
    private List<OssAttachmentVO> ossAttachmentVoList;
}
