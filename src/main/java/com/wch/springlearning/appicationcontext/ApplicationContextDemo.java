package com.wch.springlearning.appicationcontext;

import com.wch.springlearning.appicationcontext.config.WebConfig;
import com.wch.springlearning.beanfactory.config.Config;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wch
 * @CreateTime: 2023-03-14  21:52
 * @Description: TODO
 * @Version: 1.0
 */
public class ApplicationContextDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext(WebConfig.class);

    }

}
