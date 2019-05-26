/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ImportantProjectSearchVO
 * Author:   laifuying
 * Date:     2018-09-26 11:11
 * Description: 重点项目库查询VO
 */
package com.evergrande.qms.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 重点项目库查询VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "重点项目库查询VO", description= "重点项目库查询VO")
public class ImportantProjectSearchVO implements Serializable {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * id以英文逗号分隔。如1,2,3
     */
    @ApiModelProperty(value = "id以英文逗号分隔。如1,2,3", name = "ids")
    private String ids;

    /**
     * 重点项目代码
     */
    @ApiModelProperty(value = "重点项目代码", name = "projectCode")
    private String projectCode;

    /**
     * 重点项目名称
     */
    @ApiModelProperty(value = "重点项目名称", name = "projectName")
    private String projectName;
}