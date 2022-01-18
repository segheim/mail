package com.epam.esm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFirstBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        FirstBean firstBean = context.getBean("firstBean", FirstBean.class);
        System.out.println(firstBean.getName());
        context.close();
    }
}
