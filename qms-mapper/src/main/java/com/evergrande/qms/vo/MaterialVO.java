/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialVO
 * Author:   liaowenlong
 * Date:     2018-08-08 17:32
 * Description: 新增抽检计划明细VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 新增抽检计划明细VO
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "新增抽检计划明细VO", description= "新增抽检计划明细VO")
public class MaterialVO implements Serializable {
    /**
     * 物料编码
     */
    @ApiModelProperty(value = "物料编码", name = "materialCode")
   private String materialCode;

    /**
     * 物料组代码
     */
    @ApiModelProperty(value = "物料组代码", name = "materialTypeCode")
    private String materialTypeCode;

    /**
     * 物料组名称/材料类别
     */
    @ApiModelProperty(value = "物料组名称/材料类别", name = "materialTypeName")
    private String materialTypeName;

    /**
     * 取样数量
     */
    @ApiModelProperty(value = "取样数量", name = "sampleAmount")
    private String sampleAmount;

    /**
     * 检测项目编码
     */
    @ApiModelProperty(value = "检测项目编码", name = "inspectionCode")
    private  String inspectionCode;

    /**
     * 检测项目
     */
    @ApiModelProperty(value = "检测项目", name = "inspectionItem")
    private String inspectionItem;

    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "检测依据标准内容", name = "inspectionStandard")
    private String inspectionStandard;

    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", name = "materialName")
    private String materialName;

    /**
     * 检测类型
     */
    @ApiModelProperty(value = "检测类型", name = "monitorIndicatorType")
    private String monitorIndicatorType;


 /**
  * 材料取样要求VO
  */
    @ApiModelProperty(value = "材料取样要求VO", name = "sampleRequireVOList")
    List<SampleRequireVO> sampleRequireVOList;

 /**
  * 材料检测项目VO
  */
    @ApiModelProperty(value = "材料检测项目VO", name = "qmsInspectionOrderItemVOList")
    List<QmsInspectionOrderItemVO> qmsInspectionOrderItemVOList;
 /**
  * 材料类别VO
  */
 @ApiModelProperty(value = "材料类别VO", name = "materialTypeVOList")
    List<MaterialTypeVO> materialTypeVOList;
    /**
     * 检测项目信息VO
     */
    @ApiModelProperty(value="检测项目信息VO", name="检测项目信息VO")
    List<InspectionItemInfoVO> inspectionItemInfoVOList;
    /**
     * 国家标准表VO
     */
    @ApiModelProperty(value="国家标准表VO", name="国家标准表VO")
    List<NationalStandardVO> nationalStandardVOList;
    /**
     *材料检测项目表VO
     */
    @ApiModelProperty(value="材料检测项目表VO", name="材料检测项目表VO")
    List<InspectionItemVO> inspectionItemVOList;

}
