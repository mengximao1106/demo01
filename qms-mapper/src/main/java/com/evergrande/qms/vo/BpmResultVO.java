package com.evergrande.qms.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuww
 */
@Data
@NoArgsConstructor
public class BpmResultVO {

    /**
     * 流程状态  0是审批通过  1是退回  2是拒绝
     */
    private Integer status;
    /**
     * 流程实例
     */
    private String incident;
    /**
     * 合格 或 不合格
     */
    private String decisionResult;
    /**
     * 复检  不复检
     */
    private String ischeck;
    /**
     * 报告编号
     */
    private String reportNumber;
    /**
     * 物料编码
     */
    private String materialCoding;
    /**
     * 复核人
     */
    private String reviewer;

}


