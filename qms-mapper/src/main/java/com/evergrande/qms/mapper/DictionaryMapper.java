/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: DictionaryMapper
 * Author:   laifuying
 * Date:     2018-08-02 14:40
 * Description: 系统字典Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.Dictionary;
import com.evergrande.qms.vo.InspectionInstituteVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 系统字典Mapper接口
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface DictionaryMapper extends MapperBase<Dictionary> {
    /**
     * 根据字典名称获取数据
     * @param dicName
     * @return
     */
    Dictionary searchByDicName(String dicName);

    /**
     * 根据条件查询记录
     * @param dictionary
     * @return
     */
    List<Dictionary> findAllList(Dictionary dictionary);

    /**
     * 查询位置
     * @param dictionary
     * @return
     */
    List<Dictionary> findLocation(Dictionary dictionary);
}
