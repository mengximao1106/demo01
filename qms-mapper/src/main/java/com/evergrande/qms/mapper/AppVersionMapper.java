package com.evergrande.qms.mapper;
/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: AppVersionMapper
 * Author:   chensheng
 * Date:     2018-8-17 14:51:57
 * Description:
 */

import com.evergrande.qms.model.AppVersion;
import com.evergrande.qms.vo.AppVersionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * APP版本更新管理Mapper
 *
 * @author chensheng
 * @since 1.0.0
 */
@Mapper
public interface AppVersionMapper extends MapperBase<AppVersion> {

	/**
	 * 根据App ID删除信息
	 * <p>客户端接口</p>
	 *
	 * @param appVersionId APP版本id
	 */
	void deleteByAppVersionId(String appVersionId);

	/**
	 * 根据App 部署状态
	 * <p>后台接口</p>
	 *
	 * @param apkType APP类型（0：Android，1：IOS）
	 * @return 返回app版本
	 */
	AppVersionVO getByDeployDb(String apkType);

	/**
	 * 根据App ID修改信息
	 * <p>客户端接口</p>
	 *
	 * @param appVersionId APP版本对象
	 */
	void updateByAppVersionId(AppVersionVO appVersionId);

	/**
	 * 根据App ID修改信息
	 * <p>客户端接口</p>
	 *
	 * @param appVersion APP版本对象
	 */
	void updateApk(AppVersionVO appVersion);

	/**
	 * 根据App ID获取信息
	 * <p>客户端接口</p>
	 *
	 * @param appVersionId APP版本id
	 * @return 返回查询条数
	 */
	int getByAppVersionId(String appVersionId);

	/**
	 * 根据App apkType获取信息
	 * <p>客户端接口 后台接口</p>
	 *
	 * @param apkType APP类型（0：Android，1：IOS）
	 * @return 返回app版本集合
	 */
	List<AppVersionVO> getByApkType(String apkType);

	/**
	 * 添加PC更新信息
	 * <p>客户端接口</p>
	 *
	 * @param appVersionVO APP版本对象
	 */
	void apkTypeAdd(AppVersionVO appVersionVO);

	/**
	 * 查询全部数据
	 * <p>客户端接口</p>
	 *
	 * @return 返回app版本集合
	 */
	List<AppVersionVO> queryApk();

	/**
	 * 修改是否允许部署状态 已废弃
	 * <p>客户端接口</p>
	 *
	 * @param appVersionVO APP版本对象
	 */
	void updateIsDeployDb(AppVersionVO appVersionVO);

}