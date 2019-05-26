/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleRequireMapper
 * Author:   laifuying
 * Date:     2018-08-10 9:08
 * Description: 物料取样要求
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.SampleRequire;
import com.evergrande.qms.vo.SampleRequireVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 物料取样要求
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface SampleRequireMapper extends MapperBase<SampleRequire> {
    /**
     * 查询取样要求信息
     * @param searchVo
     * @return
     */
    List<SampleRequireVO> findAllList(SampleRequireVO searchVo);

    /**
     * 批量删除取样要求信息
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
    List<SampleRequireVO> findExportData(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param materialCodeList
     * @return
     */
    List<SampleRequireVO> findExportDataByMaterialCodes(List<String> materialCodeList);


    /**
     *查询取样要求数据
     * @param searchVo
     * @return
     */
    List<SampleRequire> findBaseList(SampleRequireVO searchVo);

    /**
     * 根据物料编码查询物料取样要求管理记录
     * @param materialCode
     * @return
     */
    List<SampleRequireVO> findByMaterialCode(String materialCode);
}
