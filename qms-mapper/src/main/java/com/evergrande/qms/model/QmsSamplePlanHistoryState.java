/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: Dictionary
 * Author:   liuww
 * Date:     2018-08-14
 * Description: 抽样计划状态变更记录(QmsSamplePlanHistoryState)表实体类
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * 抽样计划状态变更记录(QmsSamplePlanHistoryState)表实体类
 *
 * @author liuww
 * @since 2018-08-14
 */
@NoArgsConstructor
@Data
@ApiModel(value = "抽样计划状态变更记录", description= "QmsSamplePlanHistoryState")
@Table(name = "qms_sample_plan_history_state")
public class QmsSamplePlanHistoryState {
    /**
     * 主键
     */
    @ApiModelProperty(value = "id主键", name = "id")
    @Id
    private String id;
    /**
     * 抽样计划编码
     */
    @ApiModelProperty(value = "抽样计划编码", name = "samplePlanCode")
    private String samplePlanCode;
    /**
     * 行号
     */
    @ApiModelProperty(value = "行号", name = "rowNum")
    private Integer rowNum;
    /**
     * 材料类别
     */
    @ApiModelProperty(value = "材料类别", name = "materialType")
    private String materialType;
    /**
     * 材料编码
     */
    @ApiModelProperty(value = "材料编码", name = "materialCode")
    private String materialCode;
    /**
     * 物料描述
     */
    @ApiModelProperty(value = "物料描述", name = "materialDesc")
    private String materialDesc;
    /**
     * 更新后状态: 1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：已完成、10：已取消、11-待校对
     */
    @ApiModelProperty(value = "更新后状态: 1：草稿、2：待审核、3：待下发、4：待抽样、5：待收样、6：待委托、7：待寄出、8：待检测、9：已完成、10：已取消、11-待校对", name = "status")
    private String status;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人", name = "updateUser")
    private String updateUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "更新时间", name = "updateDate")
    private Date updateDate;

    @Transient
    private String startDate;
    @Transient
    private String endDate;
    @Transient
    private int pageIndex;
    @Transient
    private int pageSize;
    @Transient
    List<String> ids;
}