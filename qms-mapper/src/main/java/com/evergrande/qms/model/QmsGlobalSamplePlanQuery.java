/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsGlobalSamplePlanQuery
 * Author:   liuyongzhi
 * Date:     2018/9/26
 * Description: 全局查询实体
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 全局查询实体
 *
 * @author liuyongzhi
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "全局查询实体", description= "全局查询实体")
public class QmsGlobalSamplePlanQuery implements Serializable {
    /**
     * 材料类别
     */
    @ApiModelProperty(value = "材料类别", name = "materialType")
    private String materialType;

    /**
     * 供应商编码
     */
    @ApiModelProperty(value = "供应商编码", name = "supplierCode")
    private String supplierCode;

    /**
     * 计划类型
     */
    @ApiModelProperty(value = "计划类型", name = "sampleType")
    private String sampleType;

    /**
     * 计划状态
     */
    @ApiModelProperty(value = "计划状态", name = "status")
    private String status;

    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
    private String materialCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value = "供应商名称", name = "supplierName")
    private String supplierName;

    /**
     * 检测机构名称
     */
    @ApiModelProperty(value = "检测机构名称", name = "inspectionOrganizationName")
    private String inspectionOrganizationName;

    /**
     * 是否合格
     */
    @ApiModelProperty(value = "是否合格", name = "inspectionEvaluate")
    private String inspectionEvaluate;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialDesc")
    private String materialDesc;

    /**
     * 抽样人
     */
    @ApiModelProperty(value = "抽样人", name = "sampleUserName")
    private String sampleUserName;

    /**
     * 委托书编号
     */
    @ApiModelProperty(value = "委托书编号", name = "delegationCode")
    private String delegationCode;

    /**
     * 抽样地点
     */
    @ApiModelProperty(value = "抽样地点", name = "sampleAddress")
    private String sampleAddress;

    /**
     * 计划编号
     */
    @ApiModelProperty(value = "计划编号", name = "samplePlanCode")
    private String samplePlanCode;

    /**
     * 计划类型
     */
    @ApiModelProperty(value = "计划类型", name = "planType")
    private String planType;

    /**
     * 抽样时间开始
     */
    @ApiModelProperty(value = "抽样时间开始", name = "actualSampleStartDate")
    private Date actualSampleStartDate;

    /**
     * 抽样时间结束
     */
    @ApiModelProperty(value = "抽样时间结束", name = "actualSampleEndDate")
    private Date actualSampleEndDate;

    /**
     * 抽样时间结束
     */
    @ApiModelProperty(value = "id集合", name = "idList")
    private List idList;
}
