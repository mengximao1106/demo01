/**
 *  * Copyright (C): 恒大集团版权所有 Evergrande Group
 *  * FileName: User
 *  * Author:   wangyu
 *  * Date:    2018-07-18
 *  * Description: 部门实体类
 *  
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 部门实体类Department，与表sys_department映射
 *
 * @author wangyu
 * @since 1.0.0
 */
@Data
@ApiModel(value = "qms_department 对象", description= "Department Model")
public class Department {

    @ApiModelProperty(value = "id主键", name = "id")
    private String id;

    @ApiModelProperty(value = "name 部门全称", name = "name")
    private String name;

    @ApiModelProperty(value = "short_name 部门简称", name = "shortName")
    private String shortName;

    @ApiModelProperty(value = "type 部门类型", name = "type")
    private String type;

    @ApiModelProperty(value = "parent_id 上级部门", name = "parentId")
    private String parentId;

    @ApiModelProperty(value = "status状态", name = "status")
    private Integer status;

    @ApiModelProperty(value = "create_user创建人", name = "createUser")
    private String createUser;

    @ApiModelProperty(value = "create_date 创建时间", name = "createDate")
    private Date createDate;

    @ApiModelProperty(value = "update_user 修改人", name = "updateUser")
    private String updateUser;

    @ApiModelProperty(value = "update_date 修改时间", name = "updateDate")
    private Date updateDate;

}
