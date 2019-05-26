/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: CustomDoubleSerializer
 * Author:   laifuying
 * Date:     2018-09-19 9:55
 * Description: Double两位小数格式化工具类
 */
package com.evergrande.qms.util;

import com.evergrande.qms.common.exception.BusinessException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;

/**
 * Double两位小数格式化工具类
 *
 * @author laifuying
 * @since 1.0.0
 */
@Log4j2
public class CustomDoubleSerializer extends JsonSerializer<Double> {
    @Override
    public void serialize(Double d, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws BusinessException {
        CustomBigDecimalSerializer bigDecimalSerializer = new CustomBigDecimalSerializer();
        bigDecimalSerializer.serialize(new BigDecimal(d), jsonGenerator, serializerProvider);
    }
}