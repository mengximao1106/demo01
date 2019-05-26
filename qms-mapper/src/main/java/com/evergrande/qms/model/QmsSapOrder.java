package com.evergrande.qms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * (QmsSapOrder)表实体类
 *
 * @author liuww
 * @since 2018-09-11 15:42:56
 */
@NoArgsConstructor
@Data
@Table(name = "qms_sap_order")
public class QmsSapOrder {
    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改人
     */
    private String updateUser;
    /**
     * 修改时间
     */
    private Date updateDate;
    /**
     * 订单号
     */
    private String orderNumber;
    /**
     * 行号
     */
    private Integer rowNum;
    /**
     * 供应商编号
     */
    private String supplierCode;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 物料组代码
     */
    private String materialTypeCode;
    /**
     * 材料类别
     */
    private String materialType;
    /**
     * 物料编码
     */
    private String materialCode;
    /**
     * 物料名称
     */
    private String materialDesc;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 抽样材料标准
     */
    private String materialStandard;
    /**
     * 计划抽样时间（要求交货日期）
     */
    private String sampleDate;
    /**
     * WBS编号
     */
    private String wbs;
    /**
     * 抽样地点
     */
    private String sampleAddress;
    /**
     * 抽样人ID
     */
    private String sampleUserId;
    /**
     * 收样人id
     */
    private String receiveSampleUserId;
    /**
     * 材料负责人id
     */
    private String dutyUserId;

    /**
     * U 上半月 D 下半月
     */
    private String month;
    /**
     * 计划指标类型：全指标检测或者重点指标检测
     */
    private String indicatorType;
    /**
     * 生成计划  1：未生成    2：已生成
     */
    private Integer automaticPlan;

    /**
     * sap查询的月份，需要根据此月份生成计划
     */
    private String syncMonth;

    /**
     * 批次
     */
    private Integer batch;



}