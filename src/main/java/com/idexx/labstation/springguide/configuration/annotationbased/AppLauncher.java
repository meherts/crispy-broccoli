package com.idexx.labstation.springguide.configuration.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Instantiating the Spring Container
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-java-instantiating-container-contstructor
 */
public class AppLauncher
{
    public static void main(String[] args)
    {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.getBean(PersonBean.class).speak();
    }
}