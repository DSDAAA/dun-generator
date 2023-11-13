package com.dsdaaa.model;

import lombok.Data;

/**
 * 静态模板配置
 */
@Data
public class MainTemplateConfig {
    /**
     * 作者（字符串，填充值）
     */
    private String author;

    private String outputText;
    /**
     * 是否循环 (开关)
     */
    private boolean loop;
}
