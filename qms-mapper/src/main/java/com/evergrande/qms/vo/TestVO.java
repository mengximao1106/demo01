/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: TestVo
 * Author:   caobo
 * Date:     2018-07-17 10:52
 * Description: 测试信息model，与表Test映射
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 设别信息表
 *
 * @author caobo
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "TestVO对象", description= "测试信息")
public class TestVO implements Serializable {
    /**
     * id主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    private String id;
    /**
     * 名字
     */
    @ApiModelProperty(value = "名字", name = "name")
    private String name;
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码", name = "mobile")
    private String mobile;

}
