package com.wch.springlearning.beanfactory;

import com.wch.springlearning.beanfactory.bean.BeanOne;
import com.wch.springlearning.beanfactory.config.Config;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigUtils;

/**
 * @Author: wch
 * @CreateTime: 2023-03-14  20:32
 * @Description: TODO
 * @Version: 1.0
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder
                .genericBeanDefinition(Config.class).setScope("singleton").getBeanDefinition();
        defaultListableBeanFactory.registerBeanDefinition("config", beanDefinition);
        //给BeanFactory添加一些后置处理器
        AnnotationConfigUtils.registerAnnotationConfigProcessors(defaultListableBeanFactory);
        //BeanFactory后置处理器的功能就是补充了一些bean的定义
        defaultListableBeanFactory.getBeansOfType(BeanFactoryPostProcessor.class)
                .values().forEach(e -> e.postProcessBeanFactory(defaultListableBeanFactory));
        for (String beanDefinitionName : defaultListableBeanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        //bean的后置处理器，针对bean的生命周期各个阶段提供扩展，例如解析@Autowired
        defaultListableBeanFactory.getBeansOfType(BeanPostProcessor.class)
                .values().forEach(defaultListableBeanFactory::addBeanPostProcessor);
        System.out.println(defaultListableBeanFactory.getBean(BeanOne.class).getBeanTwo());



    }
}
