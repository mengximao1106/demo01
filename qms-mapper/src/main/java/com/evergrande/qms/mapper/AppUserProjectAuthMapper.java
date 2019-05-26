/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppUserProjectAuthMapper
 * Author:   laifuying
 * Date:     2018-08-17 17:19
 * Description: 用户项目权限Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.AppUserProjectAuth;
import com.evergrande.qms.vo.ProjectVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户项目权限Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface AppUserProjectAuthMapper extends MapperBase<AppUserProjectAuth> {

    /**
     * 根据EMS(ems_account)账号查询对应的权限名称（抽样地点）building_item_name
     *
     * @param loginName
     * @return 该账号拥有的项目权限（抽样地点wbs_num）集合
     * @author chensheng
     */
    List<String> findSampleAddressId(String loginName);
}