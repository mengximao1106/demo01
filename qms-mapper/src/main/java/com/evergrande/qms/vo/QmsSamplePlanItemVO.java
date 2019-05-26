/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsSamplePlanItemVO
 * Author:   liaowenlong
 * Date:     2018-08-08 8:28
 * Description: 抽样计划检测项目表VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * 抽样计划检测项目表VO
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsSamplePlanItem对象VO", description= "抽样计划检测项目model")
public class QmsSamplePlanItemVO implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id",name = "id")
    private String id;
    /**
     * 抽样计划编号
     */
    @ApiModelProperty(value = "抽样计划id",name = "samplePlanId")
    private String samplePlanCode;
    /**
     * 抽样计划明细id
     */
    @ApiModelProperty(value = "抽样计划明细id",name = "samplePlanDetailId")
    private String samplePlanDetailId;
    /**
     * 检测编码
     */
    @ApiModelProperty(value = "检测编码",name = "inspectionCode")
    private String inspectionCode;
    /**
     * 检测项目
     */
    @ApiModelProperty(value = "检测项目",name = "inspectionItem")
    private String inspectionItem;
    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "检测依据标准内容",name = "standardName")
    private String standardName;
    /**
     * 标准号
     */
    @ApiModelProperty(value = "标准号",name = "standardNum")
    private String standardNum;
    /**
     * 监控指标类型
     */
    @ApiModelProperty(value = "监控指标类型",name = "monitorIndicatorType")
    private String monitorIndicatorType;
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
     *标识:'c'--新增  'u'--修改  'd'--删除
     */
    @ApiModelProperty(value = "标识:'c'--新增  'u'--修改  'd'--删除",name = "flag")
    private String flag;
    /**
     * 值类型
     */
    @ApiModelProperty(value = "值类型", name = "valueType")
    private String valueType;
    /**
     * 行号
     */
    @ApiModelProperty(value = "行号",name = "rowNum")
    private Integer rowNum;



}
