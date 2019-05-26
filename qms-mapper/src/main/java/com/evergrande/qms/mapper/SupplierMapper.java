/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SupplierMapper
 * Author:   laifuying
 * Date:     2018-07-25 15:08
 * Description: 供应商mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.Supplier;
import com.evergrande.qms.vo.SupplierVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 供应商mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface SupplierMapper extends MapperBase<Supplier> {
    /**
     * 批量增加供应商
     * @param supplierList
     */
    void batchAddSupplier(List<Supplier> supplierList);


    /**
     * 批量修改供应商
     * @param supplierList
     */
    void batchUpdateSupplier(List<Supplier> supplierList);

    /**
     * 批量删除供应商
     * @param supplierList
     */
    void batchDeleteSupplier(List<Supplier> supplierList);

    /**
     * 获取表记录数量
     * @return
     */
    Integer getTableSize();

    /**
     * 根据供应商编号获取记录
     * @param supplierCode
     * @return
     */
    Supplier searchBySupplierCode(String supplierCode);

    /**
     * 供应商查询接口
     * @param supplierVO
     * @author liaowenlong
     * @return
     */
    List<Supplier> findAllList(Supplier supplierVO);
}
