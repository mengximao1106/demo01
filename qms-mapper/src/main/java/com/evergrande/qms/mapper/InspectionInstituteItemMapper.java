/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteItemMapper
 * Author:   laifuying
 * Date:     2018-08-16 11:13
 * Description: 检测院项目Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.InspectionInstituteItem;
import com.evergrande.qms.vo.InspectionInstituteItemVO;
import com.evergrande.qms.vo.NationalStandardItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 检测院项目Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface InspectionInstituteItemMapper extends MapperBase<InspectionInstituteItem> {
    /**
     * 查询检测院项目
     * @param searchVo
     * @return
     */
    List<InspectionInstituteItemVO> findAllList(InspectionInstituteItemVO searchVo);

    /**
     * 查询检测院项目基本信息
     * @param searchVo
     * @return
     */
    List<InspectionInstituteItem> findBaseList(InspectionInstituteItemVO searchVo);

    /**
     * 根据国家标准号ID查询记录
     * @param standardId
     * @return
     */
    List<InspectionInstituteItem> findByStandardId(String standardId);

    /**
     * 批量删除检测院项目
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param instituteCodeList
     * @return
     */
    List<InspectionInstituteItemVO> findExportData(List<String> instituteCodeList);
}
