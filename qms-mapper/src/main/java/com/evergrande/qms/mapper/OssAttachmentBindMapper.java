/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: OssAttachmentBindMapper
 * Author:   liaowenlong
 * Date:     2018-08-13 14:59
 * Description: 附件表相关查询接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.OssAttachment;
import com.evergrande.qms.model.OssAttachmentBind;
import com.evergrande.qms.vo.OssAttachmentVO;
import com.evergrande.qms.vo.QmsOssAttachmentAppVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 附件表相关查询接口
 *
 * @author liaowenlong
 * @since 1.0.0
 */
@Mapper
public interface OssAttachmentBindMapper extends MapperBase<OssAttachmentBind> {

    /**
     * 根据抽检计划ID查询抽样会签表
     * @param relevanceId
     * @return
     */
    List<OssAttachment>selectSignTable(String relevanceId);

    /**
     * 根据抽检计划ID查询委托抽样函
     * @param relevanceId
     * @return
     */
    List<OssAttachment>selectPowerOfAttorney(String relevanceId);

    /**
     * 根据ID删除附件地址
     * @param id
     */
    void deleteByPrimaryKey(String id);

    /**
     * 根据组合ID删除附件
     * @param relevanceId
     */
    void batchDeleteByRelevanceId(List<String> relevanceId);

    /**
     * 根据组合ID查询记录
     * @param id
     * @return
     */
    List<OssAttachmentVO> getByRelevanceId(String id);

	/**
	 * * 查询根据类型查询OSS附件
	 * @param type 文件类型:1-抽样前,2-抽样中,3-抽样后,4-取消,5-备份,6-抽样会签表,7-抽样委托书
	 * @param relevanceIdList 对应的关联id（抽样计划id或抽样计划详情id）
	 * @return
	 */
	List<QmsOssAttachmentAppVO> selectOssAttachmentTableList(@Param("relevanceIdList")List<String> relevanceIdList,@Param("type") String type);

    /**
     * 根据组合ID查询记录
     * @param relevanceId
     * @return
     */
	List<OssAttachmentBind> getBaseRecByRelevanceId(List<String> relevanceId);

    /**
     * 根据关联主键查询
     * @param relevanceId
     * @param type
     * @return
     */
	List<Map> selectByRelevanceId(@Param("relevanceId")String relevanceId, @Param("type")String type);

}