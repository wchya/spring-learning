package com.wch.springlearning.beanfactory.bean;


import org.springframework.beans.factory.annotation.Autowired;


/**
 * @Author: wch
 * @CreateTime: 2023-03-14  20:33
 * @Description: TODO
 * @Version: 1.0
 */
public class BeanOne {
    public BeanOne(){
        System.out.println("构造beanOne");
    }

    @Autowired
    private BeanTwo beanTwo;

    public BeanTwo getBeanTwo() {
        return beanTwo;
    }
}
