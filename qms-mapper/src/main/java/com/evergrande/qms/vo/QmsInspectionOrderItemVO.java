/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsInspectionItemVO
 * Author:   mengximao
 * Date:     2018-07-27 20:41
 * Description: 检测项目VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 检测订单项目VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsInspectionOrderItemVO 对象", description = "检测订单项目VO")
public class QmsInspectionOrderItemVO {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键", name="id")
    private String id;

    /**
     * 检测确认标志：1-是、2-否
     */
    @ApiModelProperty(value="检测确认标志：1-是、2-否", name="confirmFlag")
    private String confirmFlag;

    /**
     * 不检测原因
     */
    @ApiModelProperty(value="不检测原因", name="noInspectionReason")
    private String noInspectionReason;

    /**
     * 检测编码
     */
    @ApiModelProperty(value="检测编码", name="inspectionCode")
    private String inspectionCode;
    /**
     * 检测项目
     */
    @ApiModelProperty(value="检测项目", name="inspectionItem")
    private String inspectionItem;
    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value="检测依据标准内容", name="inspectionStandard")
    private String inspectionStandard;
    /**
     * 检测金额
     */
    @ApiModelProperty(value="检测金额", name="inspectionFee")
    private BigDecimal inspectionFee;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人", name="updateUser")
    private String updateUser;

}
