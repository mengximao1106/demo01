package com.evergrande.qms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.Date;
/**
 * 材料复检不合格--数据发到 sap (QmsSapNotQualified)表实体类
 *
 * @author liuww
 * @since 2018-09-27 10:11:28
 */
@NoArgsConstructor
@Data
@Table(name ="qms_sap_not_qualified")
public class QmsSapNotQualified {
    /**主键*/
    private String id;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createDate;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateDate;
    /**计划编号*/
    private String samplePlanCode;
    /**行号*/
    private Integer rowNum;
    /**物料编码*/
    private String materialCode;
    /**物料名称*/
    private String materialDesc;
    /**材料类别*/
    private String materialType;
    /**供应商编号*/
    private String supplierCode;
    /**供应商名称*/
    private String supplierName;
    /**品牌*/
    private String brand;
    /**抽样地点*/
    private String sampleAddress;
    /**抽样时间*/
    private String sampleDate;
    /**检测机构名称*/
    private String institutionName;
    /**报告出具日期*/
    private String reportDate;
    /**报告编号*/
    private String reportNo;
    /**不合格项目*/
    private String unqualifiedItem;
    /**是否属于复检  复检标志： 1-是 2-否*/
    private String recheckFlag;
    /**问题来源*/
    private String problemSource;
    /**检测报告URL*/
    private String url;
    /**数据状态  1:未存入sap   2:已存入sap*/
    private Integer dataStatus;
    /**材料负责人id*/
    private String dutyUserId;
}