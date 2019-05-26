/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: TestMapper
 * Author:   caobo
 * Date:     2018-07-17 10:52
 * Description: 测试信息mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 设备信息mapper接口
 *
 * @author caobo
 * @since 1.0.0
 */
@Mapper
public interface TestMapper extends MapperBase<Test>{

    /**
     * 查询全部数据
     * <p>后台接口 客户端接口</p>
     *
     * @return 列表
     */
    List<Test> findAllList();

}
