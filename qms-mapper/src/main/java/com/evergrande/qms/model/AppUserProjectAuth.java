/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppUserProjectAuth
 * Author:   laifuying
 * Date:     2018-08-17 17:09
 * Description: 用户项目权限
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户项目权限
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "用户项目权限对象", description= "用户项目权限model")
public class AppUserProjectAuth {
    /**
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

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

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate", example = "2018-07-24 14:10:08")
    private Date createDate;

}