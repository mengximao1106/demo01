/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsMaterialMapper
 * Author:   liaowenlong
 * Date:     2018-08-08 17:11
 * Description: 抽检计划明细数据接口
 */
package com.evergrande.qms.mapper;


import com.evergrande.qms.model.Material;
import com.evergrande.qms.vo.MaterialVO;
import com.evergrande.qms.vo.QmsMaterialDeailVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 抽检计划明细数据接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface QmsMaterialMapper extends MapperBase<MaterialVO>  {
    /**
     * 根据物料编号 配置抽检计划明细
     * @param materialCode
     * @return
     */

   QmsMaterialDeailVO selectMaterialCode(@Param("materialCode") String materialCode );

    /**
     * 查询物料编码
     * @param material
     * @return
     */
    List<Material> findList (Material material );

}