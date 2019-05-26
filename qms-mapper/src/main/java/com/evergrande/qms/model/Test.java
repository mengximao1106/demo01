/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Test
 * Author:   caobo
 * Date:     2018-07-17 15:14
 * Description: 测试model，与表test映射
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试model，与表test映射
 *
 * @author caobo
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "test对象", description= "测试model")
public class Test implements Serializable {

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
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime", example = "2018-02-20 17:48:30")
    private Date createTime;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateTime", example = "2018-03-20 17:48:30")
    private Date updateTime;

}
