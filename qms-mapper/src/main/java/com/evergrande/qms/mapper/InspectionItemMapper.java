/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemMapper
 * Author:   laifuying
 * Date:     2018-08-08 17:07
 * Description: 物料关联检测项目Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.InspectionItem;
import com.evergrande.qms.vo.InspectionItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 物料关联检测项目Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface InspectionItemMapper extends MapperBase<InspectionItem> {
    /**
     * 查询物料关联检测项目信息
     * @param inspectionItemVO
     * @return
     */
    List<InspectionItemVO> findAllList(InspectionItemVO inspectionItemVO);

    /**
     * 根据国家标准号查询记录
     * @param standardId
     * @return
     */
    List<InspectionItem> findByStandardId(String standardId);

    /**
     * 批量删除物料关联检测项目信息
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 根据物料ID删除记录
     * @param idList
     */
    void deleteByMaterialId(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<InspectionItemVO> findExportData(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param materialCodeList
     * @return
     */
    List<InspectionItemVO> findExportDataByMaterialCodes(List<String> materialCodeList);

    /**
     *查询物料关联检测项目数据
     * @param vo
     * @return
     */
    List<InspectionItem> findBaseList(InspectionItemVO vo);


    /**
     * 根据物料编码查询出物料关联检测项目管理记录
     * @param materialCode
     * @return
     */
    List<InspectionItemVO> findByMaterialCode(String materialCode);
}
