/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleInspectplanVO
 * Author: chensheng
 * Date: 2018-07-24 14:44
 * Description: 抽样计划VO
 */
package com.evergrande.qms.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * APP同步抽样计划VO
 *
 * @author chensheng
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "SampleInspectplanVO对象", description = "APP同步抽样计划VO")
public class SampleInspectplanVO implements Serializable {
    /**
     * id=主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    private String id;
    /**
     * 计划编号
     */
    @ApiModelProperty(value = "计划编号", name = "samplePlanCode")
    private String samplePlanCode;

    /**
     * 计划编号集合
     */
    @ApiModelProperty(value = "计划编号", name = "samplePlanCodeList")
    private List<String> samplePlanCodeList;

    /**
     * 计划类型
     */
    @ApiModelProperty(value = "计划类型", name = "planType")
    private String planType;
    /**
     * 抽样类型:1-工厂、2-现场
     */
    @ApiModelProperty(value = "抽样类型:1-工厂、2-现场", name = "sampleType")
    private String sampleType;
    /**
     * 复检标志： 1-是 2-否
     */
    @ApiModelProperty(value = "复检标志： 1-是 2-否", name = "recheckFlag")
    private String recheckFlag;
    /**
     * 初样计划id
     */
    @ApiModelProperty(value = "初样计划id", name = "beforePlanId")
    private String beforePlanId;
    /**
     * 抽样地址编码
     */
    @ApiModelProperty(value = "抽样地址编码",name = "sampleAddressId")
    private String sampleAddressId;
    /**
     * 抽样地址
     */
    @ApiModelProperty(value = "抽样地址", name = "sampleAddress")
    private String sampleAddress;
    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人", name = "sampleUserName")
    private String sampleUserName;
    /**
     * 抽样日期
     */
    @ApiModelProperty(value = "抽样日期", name = "sampleDate")
    private String sampleDate;

    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门", name = "inspectDepartment")
    private String inspectDepartment;
    /**
     * 收样人姓名
     */
    @ApiModelProperty(value = "收样人姓名", name = "receiveSampleUserName")
    private String receiveSampleUserName;
    /**
     * 收样人id
     */
    @ApiModelProperty(value = "收样人id", name = "receiveSampleUserId")
    private String receiveSampleUserId;
    /**
     * 抽样状态: 1-待审核、2-待下发、3-待抽样、4-待收样、5-待检验、6-已完成、7-取消
     */
    @ApiModelProperty(value = "抽样状态: 1-待审核、2-待下发、3-待抽样、4-待收样、5-待检验、6-已完成、7-取消", name = "status")
    private String status;
    /**
     * 供应商编号
     */
    @ApiModelProperty(value = "供应商编号", name = "supplierCode")
    private String supplierCode;
    /**
     * 抽样工厂
     */
    @ApiModelProperty(value = "抽样工厂", name = "sampleFactory")
    private String sampleFactory;
    /**
     * 抽样部门
     */
    @ApiModelProperty(value = "抽样部门", name = "sampleDepartment")
    private String sampleDepartment;
    /**
     * 收样人电话号码
     */
    @ApiModelProperty(value = "收样人电话号码", name = "receiveSampleUserPhone")
    private String receiveSampleUserPhone;
    /**
     * 是否删除: 0-是 1-否
     */
    @ApiModelProperty(value = "是否删除: 0-是 1-否", name = "isdelete")
    private String isDelete;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", name = "updateDate")
    private Date updateDate;
    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人id", name = "sampleUserId")
    private String sampleUserId;
    /**
     * 抽样人部门id
     */
    @ApiModelProperty(value = "抽样人部门id", name = "sampleUserId")
    private String sampleDepartmentId;
    /**
     * 复检计划编号
     */
    @ApiModelProperty(value = "复检计划编号", name = "recheckPlanCode")
    private String recheckPlanCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value = "供应商名称", name = "supplierName")
    private String supplierName;

    /**
     * 抽样会签表
     */
    @ApiModelProperty(value = "抽样会签表", name = "ossSampleCountersign")
    private List<QmsOssAttachmentAppVO> ossSignTable;

    /**
     * 抽样委托书
     */
    @ApiModelProperty(value = "抽样委托书", name = "ossSamplePowerAtt")
    private List<QmsOssAttachmentAppVO> ossPowerOfAttorney;

    /**
     *抽样开始时间
     */
    @ApiModelProperty(value = "抽样开始时间", name = "startDate")
    private String startDate; ;
    /**
     *抽样结束时间
     */
    @ApiModelProperty(value = "抽样结束时间", name = "endDate")
    private String endDate ;
    /**
     * 实际抽样时间
     */
    @ApiModelProperty(value = "实际抽样时间", name = "actualSampleDate")
    private Date actualSampleDate;
    /**
     * 实际抽样ID
     */
    @ApiModelProperty(value = "实际抽样ID", name = "actualSampleUserId")
    private String actualSampleUserId;
    /**
     * 实际抽样姓名
     */
    @ApiModelProperty(value = "实际抽样姓名", name = "actualSampleUserName")
    private String actualSampleUserName;
    /**
     * 计划明细VO
     */
    @ApiModelProperty(value = "计划明细VO", name = "qmsSamplePlanDetailVOList")
    private List<SampleInspectPlanDetailVO> sampleInspectPlanDetailVOList;


}