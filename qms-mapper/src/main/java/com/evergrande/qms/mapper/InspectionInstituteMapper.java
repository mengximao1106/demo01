/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: InspectionInstituteMapper
 * Author:   laifuying
 * Date:     2018-08-13 16:40
 * Description: 检测院信息Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.InspectionInstitute;
import com.evergrande.qms.vo.InspectionInstituteVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 检测院信息Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface InspectionInstituteMapper extends MapperBase<InspectionInstitute> {
    /**
     * 查询检测院
     * @param searchVo
     * @return
     */
    List<InspectionInstituteVO> findAllList(InspectionInstituteVO searchVo);

    /**
     * 批量删除检测院
     * @param idList
     */
    void batchDelete(List<String> idList);

    /**
     * 查询选中的（导出）数据
     * @param idList
     * @return
     */
    List<InspectionInstituteVO> findExportData(List<String> idList);


    /**
     * 根据检测院名称查询记录
     * @param instituteName
     * @return
     */
    List<InspectionInstitute> findByInstituteName(String instituteName);


    /**
     * 根据检测院名称模糊查询记录
     * @param instituteName
     * @return
     */
    List<InspectionInstitute> findByInstituteNameLike(@Param("instituteName") String instituteName);

    /**
     * 根据检测院名编码查询
     * @param instituteCode
     * @return
     */
    InspectionInstitute findByInstituteCode(@Param("instituteCode") String instituteCode);

    /**
     * 获取表记录数量
     * @param searchVo
     * @return
     */
    Integer getTableSize(InspectionInstituteVO searchVo);

    /**
     * 获取表记录数量
     * @param idList
     * @return
     */
    Integer getExportSize(List<String> idList);
}
