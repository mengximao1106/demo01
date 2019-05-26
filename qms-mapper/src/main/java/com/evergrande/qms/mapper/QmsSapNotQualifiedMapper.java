package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsSapNotQualified;
import com.evergrande.qms.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
/**
 * 材料复检不合格--数据发到 sap (QmsSapNotQualified)表数据库访问层
 *
 * @author liuww
 * @since 2018-09-27 10:11:32
 */
@Mapper
public interface QmsSapNotQualifiedMapper extends MyMapper<QmsSapNotQualified> {

}