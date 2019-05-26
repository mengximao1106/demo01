/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandardSearchVO
 * Author:   laifuying
 * Date:     2018-09-26 11:16
 * Description: 国家标准库查询VO
 */
package com.evergrande.qms.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 国家标准库查询VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "国家标准库查询VO", description= "国家标准库查询VO")
public class NationalStandardSearchVO implements Serializable {
    /**
     * ID主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * id以英文逗号分隔。如1,2,3
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3", name = "ids")
    private String ids;

    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "标准号", name = "标准号")
    private String standardNum;
    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "标准名称", name = "standardName")
    private String standardName;
}