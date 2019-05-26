/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsUserMapper
 * Author:   wangyu
 * Date:     2018-07-17 10:52
 * Description: 用户mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsUser;
import com.evergrande.qms.vo.QmsUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 用户mapper接口
 * @author wangyu
 * @since 1.0.0
 */
@Mapper
public interface QmsUserMapper extends MapperBase<QmsUser> {

    /**
     * 根据账号返回用户信息
     * @param loginName
     * @return QmsUserVo
     */
    QmsUserVo findByLoginName(String loginName);

    /**
     * 查询用户
     * @param qmsUserVo
     * @return List
     */
    List<QmsUserVo> findSelectList(QmsUserVo qmsUserVo);

    /**
     * 查询所有用户
     * @param qmsUserVo
     * @return List
     */
    List<QmsUserVo> findAllList(QmsUserVo qmsUserVo);

    /**
     * 批量修改状态
     * @param qmsUser
     */
    void batchUpdateStatus(QmsUser qmsUser);

    /**
     * 根据ID获取当前用户信息
     * @param id
     * @return QmsUserVo
     */
    QmsUserVo findByUserId(String id);

    /**
     * 根据ID获取当前用户信息
     * @param list
     * @param passWord
     * @param loginName
     * @param updateDate
     */
    void updateResetPassWord(@Param("list") List<String> list,@Param("passWord") String passWord,@Param("loginName")  String loginName,@Param("updateDate") Date updateDate);

    /**
     * 获取接样人信息
     * @param searchVo
     * @return
     */
    List<QmsUser> findRecipient(QmsUserVo searchVo);
}