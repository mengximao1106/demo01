/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSampleplanVO
 * Author:   liaowenlong
 * Date:     2018-07-24 14:44
 * Description: 抽样计划VO
 */
package com.evergrande.qms.vo;

import com.evergrande.qms.model.QmsOssAttachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 抽样计划VO
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "SamplePlan对象", description= "抽样计划model")
public class QmsSampleplanAppVO implements Serializable {
    /**
     * id=主键
     */
    @ApiModelProperty(value = "id主键",name = "id")
    private String id;
    /**
     * 计划编号
     */
    @ApiModelProperty(value = "计划编号",name = "samplePlanCode")
    private String samplePlanCode;
    /**
     * 计划类型
     */
    @ApiModelProperty(value = "计划类型",name = "planType")
    private String planType;
    /**
     * 抽样类型:1-工厂、2-现场
     */
    @ApiModelProperty(value = "抽样类型:1-工厂、2-现场",name = "sampleType")
    private String sampleType;
    /**
     * 复检标志： 1-是 2-否
     */
    @ApiModelProperty(value = "复检标志： 1-是 2-否",name = "recheckFlag")
    private String recheckFlag;
    /**
     * 初样计划id
     */
    @ApiModelProperty(value = "初样计划id",name = "beforePlanId")
    private String beforePlanId;
    /**
     * 抽样地址
     */
    @ApiModelProperty(value = "抽样地址",name = "sampleAddress")
    private String sampleAddress;
    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人",name = "sampleUserName")
    private String sampleUserName;
    /**
     * 抽样日期
     */
    @ApiModelProperty(value = "抽样日期",name = "sampleDate")
    private Date sampleDate;
    /**
     * 送检部门
     */
    @ApiModelProperty(value = "送检部门",name = "inspectDepartment")
    private String inspectDepartment;
    /**
     * 收样人姓名
     */
    @ApiModelProperty(value = "收样人姓名",name = "receiveSampleUserName")
    private String receiveSampleUserName;
    /**
     * 收样人id
     */
    @ApiModelProperty(value = "收样人id",name = "receiveSampleUserId")
    private String receiveSampleUserId;
    /**
     * 抽样状态:1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：待校对、10：已完成
     */
    @ApiModelProperty(value = "抽样状态: 1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：待校对、10：已完成",name = "status")
    private String status;
    /**
     * 供应商编号
     */
    @ApiModelProperty(value = "供应商编号",name = "supplierCode")
    private String supplierCode;
    /**
     * 抽样工厂
     */
    @ApiModelProperty(value = "抽样工厂",name = "sampleFactory")
    private String sampleFactory;
    /**
     * 抽样部门
     */
    @ApiModelProperty(value = "抽样部门",name = "sampleDepartment")
    private String sampleDepartment;
    /**
     * 收样人电话号码
     */
    @ApiModelProperty(value = "收样人电话号码",name = "receiveSampleUserPhone")
    private String receiveSampleUserPhone;
    /**
     * 是否删除: 0-是    1-否
     */
    @ApiModelProperty(value = "是否删除: 0-是    1-否",name = "isdelete")
    private String isDelete;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人",name = "createUser")
    private String createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人",name = "updateUser")
    private String updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间",name = "updateDate")
    private Date updateDate;
    /**
     * 抽样人id
     */
    @ApiModelProperty(value = "抽样人id",name = "sampleUserId")
    private String sampleUserId;
    /**
     * 抽样人部门id
     */
    @ApiModelProperty(value = "抽样人部门id",name = "sampleUserId")
    private String sampleDepartmentId;
    /**
     * 复检计划编号
     */
    @ApiModelProperty(value = "复检计划编号",name = "recheckPlanCode")
    private String recheckPlanCode;

    /**
     * 实际抽样时间
     */
    @ApiModelProperty(value = "实际抽样时间",name = "actualSampleDate")
    private Date actualSampleDate;
    /**
     * 实际抽样人ID
     */
    @ApiModelProperty(value = "实际抽样人ID",name = "actualSampleUserId")
    private String actualSampleUserId;
    /**
     * 计划明细VO
     */
    @ApiModelProperty(value = "计划明细VO",name = "qmsSamplePlanDetailVOList")
    private List<QmsSamplePlanDetailVO> qmsSamplePlanDetailVOList;

    /**
     * 计划明细VO app 提交数据使用
     */
    @ApiModelProperty(value = "计划明细VO app 提交数据使用",name = "qmsSampleDetailsAppVOS")
    private List<QmsSampleDetailsAppVO> qmsSampleDetailsAppVOS;

    /**
     * 会签附件
     */
    @ApiModelProperty(value = "会签附件",name = "signAttachment")
    List<QmsOssAttachment> signAttachment;

    /**
     * 委托抽样函附件
     */
    @ApiModelProperty(value = "委托抽样函附件",name = "entrustAttachment")
    List<QmsOssAttachment> entrustAttachment;
}
