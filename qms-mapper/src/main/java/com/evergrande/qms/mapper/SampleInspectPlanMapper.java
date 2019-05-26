/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: SampleInspectPlanMapper
 * Author:   chensheng
 * Date:     2018-8-20 19:57:47
 * Description: 抽样计划mapper接口
 */
package com.evergrande.qms.mapper;

import com.evergrande.qms.vo.SampleInspectplanVO;
import com.evergrande.qms.vo.SampleParamVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 同步抽样计划mapper接口
 *
 * @author chensheng
 * @since 1.0.0
 */
@Mapper
public interface SampleInspectPlanMapper extends MapperBase<SampleInspectplanVO> {

	/**
	 * 同步抽样送检计划给APP
	 *
	 * @param sampleParamVO
	 * @return 抽样计划列表及抽样计划列表明细
	 * @author chensheng
	 */
	List<SampleInspectplanVO> findSampleInspectPlan(SampleParamVO sampleParamVO);

}