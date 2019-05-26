package com.evergrande.qms.mapper;


import com.evergrande.qms.model.QmsSapOrder;
import com.evergrande.qms.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * (QmsSapOrder)表数据库访问层
 *
 * @author liuww
 * @since 2018-09-11 15:42:59
 */
@Mapper
public interface QmsSapOrderMapper extends MyMapper<QmsSapOrder> {

}