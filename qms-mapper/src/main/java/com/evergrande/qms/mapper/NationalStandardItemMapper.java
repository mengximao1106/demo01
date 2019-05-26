/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: NationalStandardMapper
 * Author:   laifuying
 * Date:     2018-08-21 10:49
 * Description: 国标检测项目Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.NationalStandard;
import com.evergrande.qms.model.NationalStandardItem;
import com.evergrande.qms.vo.NationalStandardItemVO;
import com.evergrande.qms.vo.NationalStandardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 国标检测项目Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface NationalStandardItemMapper extends MapperBase<NationalStandardItem> {

    /**
     * 根据标准号查询检测项目
     * @param standarNum
     * @return
     */
    List<NationalStandardItemVO> findByStandardNum(String standarNum);
    /**
     * 根据KEY查询记录
     * @param searchVo
     * @return
     */
    List<NationalStandardItemVO> findByKey(NationalStandardItemVO searchVo);
    /**
     * 查询国标检测项目
     * @param searchVo
     * @return
     */
    List<NationalStandardItemVO> findAllList(NationalStandardItemVO searchVo);

    /**
     * 根据检测项目库ID查询记录,查询检测项目是否被国标库引用
     * @param inspectionId
     * @return
     */
    List<NationalStandardItemVO> findByInspectionId(String inspectionId);

    /**
     * 批量删除国标检测项目
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 根据国标库ID删除记录
     * @param idList
     */
    void deleteByStandardId(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<NationalStandardItemVO> findExportData(List<String> idList);

    /**
     *查询国标基本信息
     * @param searchVo
     * @return
     */
    List<NationalStandardItem> findBastList(NationalStandardItemVO searchVo);
}
