/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteSearchVO
 * Author:   laifuying
 * Date:     2018-09-26 10:58
 * Description: 检测院查询VO
 */
package com.evergrande.qms.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 检测院查询VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "检测院查询VO", description= "检测院查询VO")
public class InspectionInstituteSearchVO implements Serializable {
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;

    /**
     * id以英文逗号分隔。如1,2,3
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3", name = "ids")
    private String ids;

    /**
     * 检测院编码
     */
    @ApiModelProperty(value = "检测院编码",name = "instituteCode")
    private String instituteCode;
    /**
     * 检测院名称
     */
    @ApiModelProperty(value = "检测院名称",name = "instituteName")
    private String instituteName;
}