package com.wch.springlearning.beanfactory.config;

import com.wch.springlearning.beanfactory.bean.BeanOne;
import com.wch.springlearning.beanfactory.bean.BeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wch
 * @CreateTime: 2023-03-14  20:33
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class Config {

    @Bean
    public BeanOne beanOne(){
        return new BeanOne();
    }

    @Bean
    public BeanTwo beanTwo(){
        return new BeanTwo();
    }
}
