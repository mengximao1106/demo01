/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionItemInfoMapper
 * Author:   laifuying
 * Date:     2018-07-27 10:00
 * Description: 检测项目Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.InspectionItemInfo;
import com.evergrande.qms.vo.InspectionItemInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 检测项目Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface InspectionItemInfoMapper extends MapperBase<InspectionItemInfo> {

    /**
     * 查询检测项目
     * @param item
     * @return
     */
    List<InspectionItemInfo> findAllList(InspectionItemInfo item);

    /**
     * 批量删除检测项目
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<InspectionItemInfo> findExportData(List<String> idList);

    /**
     * 根据 materialCode 查询
     * @param materialCode
     * @return
     */
    Map<String, String> getByMaterialCode(@Param("materialCode") String materialCode);

    /**
     * 查询检测项目 做计划检测项目的新增
     * @param inspectionItemInfo
     * @return
     */
    List<InspectionItemInfoVO> findInspectionCode(InspectionItemInfo inspectionItemInfo);


    /**
     * 根据检测名称查询记录
     * @param inspectionItem
     * @return
     */
    List<InspectionItemInfo> findByInspectionItem(String inspectionItem);

    /**
     * 根据检测编码查询记录
     * @param inspectionCode
     * @return
     */
    List<InspectionItemInfo> findByInspectionCode(String inspectionCode);

    /**
     * 根据标准号查询相关的检测项目
     * @param map
     * @return
     */
    List<InspectionItemInfoVO> findItem(Map map);

    /**
     * 获取表记录数量
     * @param item
     * @return
     */
    Integer getTableSize(InspectionItemInfo item);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}
