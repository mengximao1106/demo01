/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: DepartmentMapper
 * Author:   wangyu
 * Date:     2018-07-18
 * Description: department Mapper接口
 */
package com.evergrande.qms.mapper;


import com.evergrande.qms.model.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * department Mapper接口
 *
 * @author wangyu
 * @create 2018-07-18
 * @since 1.0.0
 */
@Mapper
public interface DepartmentMapper extends MapperBase<Department> {
    /**
     * 根据父节查子节点
     * @param parentId
     * @return List
     */
    List<Department> findByParentId(String parentId);

}
