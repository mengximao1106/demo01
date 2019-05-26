/**
 * Copyright (C): 恒大集团版权所有 Evergrande Group
 * FileName: CustomBigDecimalSerializer
 * Author:   wenxiaoqiang
 * Date:     2018-06-01
 * Description: 金额格式化工具类
 */
package com.evergrande.qms.util;

import com.evergrande.qms.common.exception.BusinessException;
import com.evergrande.qms.common.model.ErrorCode;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.common.base.Throwables;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 金额格式化工具类
 *
 * @author wenxiaoqiang
 * @since 1.0.0
 */
@Log4j2
public class CustomBigDecimalSerializer extends JsonSerializer<BigDecimal> {
    @Override
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws BusinessException {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            jsonGenerator.writeString(decimalFormat.format(bigDecimal));
        }catch (IOException e){
            log.error("CustomBigDecimalSerializer.serialize: "+Throwables.getStackTraceAsString(e));
            throw BusinessException.define(ErrorCode.IO_Exception);
        }

    }
}
