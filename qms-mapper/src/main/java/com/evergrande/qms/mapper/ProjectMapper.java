/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: ProjectMapper
 * Author:   laifuying
 * Date:     2018-07-24 14:31
 * Description: 项目mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.Project;
import com.evergrande.qms.vo.ProjectVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 项目mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface ProjectMapper extends MapperBase<Project> {
    /**
     * 批量增加项目
     * @param supplierList
     */
    void batchAddProject(List<Project> supplierList);


    /**
     * 批量修改项目
     * @param supplierList
     */
    void batchUpdateProject(List<Project> supplierList);

    /**
     * 批量删除项目
     * @param supplierList
     */
    void batchDeleteProject(List<Project> supplierList);

    /**
     * 获取表记录数量
     * @return
     */
    Integer getTableSize();

    /**
     * 根据项目编号查询记录
     * @param projectCode
     * @return
     */
    Project searchByProjectCode(String projectCode);

    /**
     * 根据项目编号模糊查询记录
     * @param projectCode
     * @return
     */
    List<Project> searchProjectLikeCode(@Param("projectCode") String projectCode);

    /**
     * 根据项目名称模糊查询记录
     * @param projectCode
     * @return
     */
    List<Project> searchProjectLikeName(@Param("projectName") String projectCode);

    /**
     * 抽样地点抽样人查询接口
     * @param project
     * @author liaowenlong
     * @return
     */
    List<Project> findAllList(Project project);
}