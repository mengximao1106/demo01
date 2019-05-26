/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppUserProjectAuthVO
 * Author:   laifuying
 * Date:     2018-08-17 17:17
 * Description: 用户项目权限
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户项目权限
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "用户项目权限VO对象", description= "用户项目权限VO")
public class AppUserProjectAuthVO implements Serializable {
    /**
     * 集团
     */
    @ApiModelProperty(value = "集团", name = "groupName")
    private String groupName;

    /**
     * EMS账号
     */
    @ApiModelProperty(value = "EMS账号", name = "emsAccount")
    private String emsAccount;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名", name = "userName")
    private String userName;

    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID", name = "projectId")
    private String projectId;

    /**
     * WBS编号
     */
    @ApiModelProperty(value = "WBS编号", name = "wbsNum")
    private String wbsNum;
}