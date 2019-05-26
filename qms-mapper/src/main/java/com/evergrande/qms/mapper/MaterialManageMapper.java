/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: MaterialManageMapper
 * Author:   laifuying
 * Date:     2018-08-07 14:05
 * Description: 物料（材料）管理Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.MaterialManage;
import com.evergrande.qms.vo.InspectionInstituteVO;
import com.evergrande.qms.vo.MaterialManageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 物料（材料）管理Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface MaterialManageMapper extends MapperBase<MaterialManage> {
    /**
     * 查询物料（材料）管理信息
     * @param materialManageVO
     * @return
     */
    List<MaterialManageVO> findAllList(MaterialManageVO materialManageVO);

    /**
     * 批量删除物料（材料）管理信息
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<MaterialManageVO> findExportData(List<String> idList);

    /**
     * 根据物料编码查询记录
     * @param materialCode
     * @return
     */
    MaterialManage searchByMaterialCode(String materialCode);

    /**
     * 查询物料基本信息
     * @param searchVo
     * @return
     */
    List<MaterialManageVO> findBaseMaterialList(MaterialManageVO searchVo);

    /**
     * 查询可抽样的物料信息
     * @param searchVo
     * @return
     */
    List<MaterialManageVO> findSamplingMaterialList(MaterialManageVO searchVo);

    /**
     * 查询物料组/物料类型数据
     * @param searchVo
     * @return
     */
    List<MaterialManageVO> findMaterialType(MaterialManageVO searchVo);

    /**
     * 根据物料ID查询记录
     * @param materialId
     * @return
     */
    List<MaterialManage> searchByMaterialId(String materialId);

    /**
     * 获取表记录数量
     * @param searchVo
     * @return
     */
    Integer getTableSize(MaterialManageVO searchVo);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}
