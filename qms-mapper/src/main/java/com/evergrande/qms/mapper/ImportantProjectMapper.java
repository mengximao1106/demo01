/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ImportantProjectMapper
 * Author:   laifuying
 * Date:     2018-08-28 10:54
 * Description: 重点项目库Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.ImportantProject;
import com.evergrande.qms.vo.ImportantProjectVO;
import com.evergrande.qms.vo.MaterialManageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 重点项目库Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface ImportantProjectMapper extends MapperBase<ImportantProject> {
    /**
     * 查询检测项目
     * @param searchVo
     * @return
     */
    List<ImportantProjectVO> findAllList(ImportantProjectVO searchVo);

    /**
     * 根据项目编号查询记录
     * @param projectCode
     * @return
     */
    List<ImportantProject> findByProjectCode(String projectCode);

    /**
     * 批量删除重点项目
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<ImportantProjectVO> findExportData(List<String> idList);

    /**
     * 获取表记录数量
     * @param searchVo
     * @return
     */
    Integer getTableSize(ImportantProjectVO searchVo);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}
