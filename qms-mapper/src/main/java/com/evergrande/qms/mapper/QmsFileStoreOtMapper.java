/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: QmsFileStoreOtMapper
 * Author:   mengximao
 * Date:     2018-08-08 8:50
 * Description: 文件存储OT Mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.model.QmsOtAttachment;
import com.evergrande.qms.model.QmsOtAttachmentBind;
import com.evergrande.qms.vo.QmsOssAttachmentVO;
import com.evergrande.qms.vo.QmsUploadOtInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 文件存储OT Mapper接口
 *
 * @author mengximao
 * @since 1.0.0
 */
@Mapper
public interface QmsFileStoreOtMapper {

    /**
     * 查询下载送检委托书参数
     * @param inspectionOrderNum 检测订单号
     * @param type 文件类型
     * @return
     */
    List<QmsUploadOtInfoVO> findProxyOrReplyDownloadParam(@Param("inspectionOrderNum") String inspectionOrderNum,
                                                          @Param("type") String type);

    /**
     * 查询下载检测报告参数
     * @param samplePlanCode 计划编码
     * @param materialCode 物料编码
     * @param type 文件类型
     * @return
     */
    List<QmsUploadOtInfoVO> findReportDownloadParam(@Param("samplePlanCode") String samplePlanCode,
                                                    @Param("materialCode") String materialCode,
                                                    @Param("type") String type);

    /**
     * 查询抽样记录下载Url
     * @param map
     * @return
     */
    List<QmsOssAttachmentVO> findSampleRecordDownloadUrl(Map map);

    /**
     * 保存文件上传OT附件表
     * @param qmsOtAttachment
     */
    void saveOtAttachment(QmsOtAttachment qmsOtAttachment);

    /**
     * 保存文件上传OT附件中间表
     * @param qmsOtAttachmentBind
     */
    void saveOtAttachmentBind(QmsOtAttachmentBind qmsOtAttachmentBind);

    /**
     * 根据关联主键获取 附件 id
     * @param relevanceId 关联id
     * @param type 附件类型
     * @return
     */
    List<Map> getReturnId(@Param("relevanceId") String relevanceId, @Param("type") String type);

    /**
     * 查询检测订单下的附件信息
     * @param type 文件类型
     * @param inspectionOrderNum 检测订单号
     * @return
     */
    List<QmsUploadOtInfoVO> findDownloadInfoByOrderNum(@Param("type")String type, @Param("inspectionOrderNum")String inspectionOrderNum);

    /**
     * 删除附件
     * @param returnId
     */
    void deleteOtAttachmentByReturnId(String returnId);

    /**
     * 删除附件关系表
     * @param returnId
     */
    void deleteOtAttachmentBindByReturnId(String returnId);

}