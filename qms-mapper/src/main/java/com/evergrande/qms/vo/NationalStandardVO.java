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
 * 国表家标准细取样要求VO.
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "国表家标准细取样要求VO", description= "国表家标准细取样要求VO")
public class NationalStandardVO implements Serializable {
    /**
     * Add by laifuying
     * ID 主键
     */
    @ApiModelProperty(value = "ID主键", name = "id")
    private String id;

    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "标准号", name = "标准号")
    private String standardNum;
    /**
     * 检测依据标准内容
     */
    @ApiModelProperty(value = "标准名称", name = "standardName")
    private String standardName;
    /**
     * 附件信息列表
     */
    @ApiModelProperty(value = "附件信息列表", name = "ossAttachmentVoList")
    private List<OssAttachmentVO> ossAttachmentVoList;
}
