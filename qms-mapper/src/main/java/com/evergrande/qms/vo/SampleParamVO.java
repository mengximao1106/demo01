/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleParamVO
 * Author:   chensheng
 * Date:     2018-08-20 15:31
 * Description: 同步抽样计划参数封装类
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 同步抽样计划查询参数封装类
 *
 * @author chensheng
 * @since 1.0.0
 */

@NoArgsConstructor
@Data
@ApiModel(value = "SampleParamVO", description= "同步抽样计划查询参数封装类")
public class SampleParamVO implements Serializable {

    /**
     * 登录用户账号
     */
    @ApiModelProperty(value = "登录用户账号",name = "loginName")
    private String loginName;

    /**
     * 登录用户拥有的项目权限ID集合
     */
    @ApiModelProperty(value = "登录用户拥有的项目权限名称集合",name = "sampleAddressIdList")
    private List<String> sampleAddressIdList;
}