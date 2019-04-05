package com.idexx.labstation.springguide.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppLauncher
{
    public static void main(String[] args)
    {
        //  https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-java-instantiating-container-contstructor
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.getBean(HelloBean.class).sayHello();
    }
}