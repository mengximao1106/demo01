/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialMapper
 * Author:   laifuying
 * Date:     2018-07-26 11:26
 * Description: 物料（包含原材料、半成品、成品）Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.Material;
import com.evergrande.qms.vo.MaterialManageVO;
import com.evergrande.qms.vo.QmsMaterialVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物料（包含原材料、半成品、成品）Mapper接口， 原材料的编码以5+5位流水号，例如：500001
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface MaterialMapper extends MapperBase<Material> {
    /**
     * 批量增加物料
     * @param materialList
     */
    void batchAddMaterial(List<Material> materialList);


    /**
     * 批量修改物料
     * @param materialList
     */
    void batchUpdateMaterial(List<Material> materialList);

    /**
     * 批量删除物料
     * @param materialList
     */
    void batchDeleteMaterial(List<Material> materialList);

    /**
     * 获取表记录数量
     * @return
     */
    Integer getTableSize();

    /**
     * 根据物料编码查询数据
     * @param materialCode
     * @return
     */
    Material searchByMaterialCode(String materialCode);

    /**
     * 根据物料名称查询数据
     * @param materialName
     * @return
     */
    List<QmsMaterialVO> searchByMaterialName(String materialName);

    /**
     * 批量删除原材料
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询全部原材料
     * @param searchVo
     * @return
     */
    List<QmsMaterialVO> findAllList(QmsMaterialVO searchVo);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<QmsMaterialVO> findExportData(List<String> idList);

    /**
     * 根据编码查询记录
     * @param code
     * @return
     */
    MaterialManageVO getMaterialManageByCode(@Param("code") String code);

    /**
     * 根据编码查询物料组是否存在
     * @param materialCode
     * @return
     */
    int findMaterialTypeByMaterialCode(String materialCode);

    /**
     * 获取（原材料）表记录数量
     * @param searchVo
     * @return
     */
    Integer getOriginalTableSize(QmsMaterialVO searchVo);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}