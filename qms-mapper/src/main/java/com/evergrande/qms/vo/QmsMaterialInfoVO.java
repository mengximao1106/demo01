/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialInfoVO
 * Author:   mengximao
 * Date:     2018-07-27 14:38
 * Description: 物料信息VO
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.util.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 物料信息VO
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsMaterialInfoVO", description = "物料信息VO")
public class QmsMaterialInfoVO implements Serializable {

    /**
     * 抽检计划编号
     */
    @ApiModelProperty(value = "抽检计划编号", name = "samplePlanCode")
    private String samplePlanCode;
    /**
     * 计划行号
     */
    @ApiModelProperty(value = "计划行号", name = "rowNum")
    private Integer rowNum;
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
     * 送检数量
     */
    @ApiModelProperty(value = "送检数量", name = "actualSampleAmount")
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double actualSampleAmount;

    /**
     * 是否复检(1:是，2：否)
     */
    @ApiModelProperty(value = "是否复检(1:是，2：否)", name = "recheckFlag")
    private String recheckFlag;

}
