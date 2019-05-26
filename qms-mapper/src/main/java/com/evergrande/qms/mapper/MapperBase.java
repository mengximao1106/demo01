/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: MapperBase
 * Author:   liangyijie
 * Date:     2017-11-8 19:06
 * Description: Base Mapper
 */
package com.evergrande.qms.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * Base Mapper 公共mapper类
 * @author liangyijie
 * @create 2017-11-8
 * @since 1.0.0
 */
public interface MapperBase<T> {
    /**
     * 获取数据
     * @param id
     * @return
     */
    T get(Serializable id);

    /**
     * 列表数据
     * @param t
     * @return
     */
    List<T> findList(T t);

    /**
     * 数据条数
     * @return
     */
    int getCount();

    /**
     * 添加数据
     * @param t
     */
    void add(T t);

    /**
     * 批量添加数据
     * @param ts
     */
    void batchAdd(List<T> ts);

    /**
     * 更新数据
     * @param t
     */
    void update(T t);

    /**
     * 批量更新
     * @param t
     */
    void batchUpdate(List<T> t);

    /**
     * 删除数据
     * @param id
     */
    void delete(Serializable id);

    /**
     * 清空所有数据
     */
    void deleteAll();
}
