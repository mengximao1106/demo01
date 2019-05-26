/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandardMapper
 * Author:   laifuying
 * Date:     2018-08-21 10:49
 * Description: 国家标准Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.NationalStandard;
import com.evergrande.qms.vo.NationalStandardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 国家标准Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface NationalStandardMapper extends MapperBase<NationalStandard> {
    /**
     * 查询国家标准
     * @param searchVo
     * @return
     */
    List<NationalStandardVO> findAllList(NationalStandardVO searchVo);

    /**
     * 批量删除国家标准
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param standardNumList
     * @return
     */
    List<NationalStandardVO> findExportData(List<String> standardNumList);

    /**
     *查询国家标准基本信息
     * @param searchVo
     * @return
     */
    List<NationalStandard> findBaseList(NationalStandardVO searchVo);

    /**
     * 根据标准号查询记录
     * @param standardNum
     * @return
     */
    List<NationalStandard> findByStandardNum(String standardNum);

    /**
     * 根据标准名称查询记录
     * @param standardName
     * @return
     */
    List<NationalStandard> findByStandardName(String standardName);

    /**
     * 获取表记录数量
     * @param searchVo
     * @return
     */
    Integer getTableSize(NationalStandardVO searchVo);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}
