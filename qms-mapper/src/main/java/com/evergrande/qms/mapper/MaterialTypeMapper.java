/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialTypeMapper
 * Author:   laifuying
 * Date:     2018-07-25 16:03
 * Description: 物料组（类型）mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.MaterialType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 物料组（类型）mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface MaterialTypeMapper extends MapperBase<MaterialType> {
    /**
     * 批量增加物料组
     * @param materialTypeList
     */
    void batchAddMaterialType(List<MaterialType> materialTypeList);


    /**
     * 批量修改物料组
     * @param materialTypeList
     */
    void batchUpdateMaterialType(List<MaterialType> materialTypeList);

    /**
     * 批量删除物料组
     * @param materialTypeList
     */
    void batchDeleteMaterialType(List<MaterialType> materialTypeList);

    /**
     * 获取表记录数量
     * @return
     */
    Integer getTableSize();

    /**
     * 根据物料组编码查询数据
     * @param materialTypeCode
     * @return
     */
    MaterialType searchByMaterialTypeCode(String materialTypeCode);
}
