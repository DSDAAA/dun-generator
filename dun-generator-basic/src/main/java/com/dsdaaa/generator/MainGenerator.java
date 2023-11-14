package com.dsdaaa.generator;

import com.dsdaaa.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        //1.静态文件生成
        String projectPath = System.getProperty("user.dir");
        String inputPath = projectPath + File.separator + "dun-generator-demo-projects" + File.separator + "acm-template";
        String outputPath = projectPath;
        //复制
        StaticGenerator.copyFilesByRecursive(inputPath, outputPath);
        //2.动态文件生成
        String dynamicInputPath = projectPath + File.separator + "dun-generator-basic" + File.separator +
                "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/dsdaaa/acm/MainTemplate.java";

        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        DynamicGenerator.doGenerate(dynamicInputPath, dynamicOutputPath, mainTemplateConfig);
    }
}
