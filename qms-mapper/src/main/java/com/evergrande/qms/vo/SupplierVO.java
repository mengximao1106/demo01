/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SupplierVO
 * Author:   laifuying
 * Date:     2018-07-25 15:46
 * Description: 供应商VO
 */
package com.evergrande.qms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 供应商VO
 *
 * @author laifuying
 * @since 1.0.0
 */
@NoArgsConstructor
@Data
@ApiModel(value = "供应商VO对象", description= "供应商VO")
public class SupplierVO implements Serializable {
    /**
     * 供应商编码
     */
    @ApiModelProperty(value = "供应商编码", name = "supplierCode")
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value = "供应商名称", name = "supplierName")
    private String supplierName;

    /**
     * 品牌
     */
    @ApiModelProperty(value = "品牌", name = "brand")
    private String brand;

    /**
     * 省份
     */
    @ApiModelProperty(value = "省份", name = "province")
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty(value = "城市", name = "city")
    private String city;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址", name = "detailedAddress")
    private String detailedAddress;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话", name = "telephone")
    private String telephone;

    /**
     * 变更类型（C为新增，U为更新，D为删除）
     */
    @ApiModelProperty(value = "变更类型", name = "crudType")
    private String crudType;
}