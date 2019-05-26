/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
<<<<<<< HEAD
 * FileName: qmsOrderMaterialDetailBind
 * Author:   mengximao
 * Date:     2018-08-30 20:28
 * Description: 检测订单物料明细中间表
=======
 * FileName: QmsOrderMaterialDetailBind
 * Author:   liaowenlong
 * Date:     2018-08-30 16:45
 * Description: 订单物料明细中间表model
>>>>>>> origin/master
 */
package com.evergrande.qms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单物料明细中间表model
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "QmsOrderMaterialDetailBind对象", description= "QmsOrderMaterialDetailBind")
public class QmsOrderMaterialDetailBind {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", name = "id")
    private String id;
    /**
     * 检测订id
     */
    @ApiModelProperty(value = "检测订id", name = "inspectionOrderId")
    private String inspectionOrderId;
    /**
     * 关联计划明细id
     */
    @ApiModelProperty(value = "关联计划明细id", name = "samplePlanDetailId")
    private String samplePlanDetailId;
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

}
