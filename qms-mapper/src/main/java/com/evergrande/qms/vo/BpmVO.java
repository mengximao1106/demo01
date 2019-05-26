package com.evergrande.qms.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuww
 * 提交数据到 bpm, bpm返回信息封装类
 */
@NoArgsConstructor
@Data
public class BpmVO {
    /**
     * 流程实例号 流程提交成功后会返回实例号给到第三方系统，第三方系统需要记录下来该实例号。
     */
    private String incident;
    /**
     * 流程提交成功
     */
    private String errorMessage;
    /**
     * 1 成功，0 失败
     */
    private String result;
    /**
     * 流程 url
     */
    private String url;
}
