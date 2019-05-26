/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSampleRecordInfoVO
 * Author:   mengximao
 * Date:     2018-08-11 12:31
 * Description: 抽样记录信息VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 抽样记录信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsSampleRecordInfoVO对象",description = "抽样记录信息VO")
public class QmsSampleRecordInfoVO  implements Serializable {

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialDesc")
    private String materialDesc;

    /**
     * 计划行号
     */
    @ApiModelProperty(value = "计划行号", name = "rowNum")
    private Integer rowNum;

    /**
     * 计划编号
     */
    @ApiModelProperty(value = "计划编号", name = "planCode")
    private String samplePlanCode;

    /**
     * 计划样品数量
     */
    @ApiModelProperty(value = "计划样品数量", name = "planSampleAmount")
    private String planSampleAmount;

    /**
     * 实际样品数量
     */
    @ApiModelProperty(value = "实际样品数量", name = "actualSampleAmount")
    private String actualSampleAmount;

    /**
     * 物料编号
     */
    @ApiModelProperty(value = "物料编号", name = "sampleCode")
    private String sampleCode;

    /**
     * 取消原因
     */
    @ApiModelProperty(value = "取消原因", name = "cancelReason")
    private String cancelReason;

    /**
     * 取样注意事项
     */
    @ApiModelProperty(value = "取样注意事项", name = "sampleNotes")
    private String sampleNotes;

    /**
     * 抽样记录文件下载信息
     */
    @ApiModelProperty(value = "抽样记录文件下载信息", name = "recordFileInfoVOList")
    private List<QmsRecordFileInfoVO> recordFileInfoVOList;

}
