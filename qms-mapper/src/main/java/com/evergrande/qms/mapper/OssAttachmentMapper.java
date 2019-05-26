/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachmentMapper
 * Author:   laifuying
 * Date:     2018-08-23 16:48
 * Description: OSS附件Mapper
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.OssAttachment;
import com.evergrande.qms.model.OssAttachmentBind;
import com.evergrande.qms.vo.OssAttachmentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * OSS附件Mapper
 *
 * @author laifuying
 * @since 1.0.0
 */
@Mapper
public interface OssAttachmentMapper extends MapperBase<OssAttachment> {
    /**
     * 根据关联主键查询OSS附件信息,
     * @param searchVo
     * @return
     */
    List<OssAttachment> findAllList(OssAttachmentBind searchVo);

    /**
     * 根据id删除附件地址
     *
     * @param id
     */
    void deleteByPrimaryKey (String id);

    /**
     * 根据组合ID删除附件
     * @param relevanceId
     */
    void batchDeleteByRelevanceId(List<String> relevanceId);

    /**
     * 根据ID删除附件信息
     * @param idList
     */
    void batchDeleteById(List<String> idList);
}