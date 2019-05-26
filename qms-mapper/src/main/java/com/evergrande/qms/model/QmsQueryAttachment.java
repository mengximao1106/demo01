/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsQueryAttachment
 * Author:   mengximao
 * Date:     2018-08-08 10:05
 * Description: 查询附件参数model
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 查询附件参数model
 *
 * @author mengximao
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ApiModel(value="QmsQueryAttachment对象",description = "查询附件参数model")
public class QmsQueryAttachment implements Serializable {

    /**
     * 抽检计划编号
     */
    @ApiModelProperty(value = "抽检计划编号", name = "planCode")
    private String planCode;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 下载具体文件的类型：1-送检委托书，2-委托书回函，3-检测报告
     */
    @ApiModelProperty(value = "类型(1-送检委托书，2-委托书回函，3-检测报告)", name = "type")
    private String type;

}
