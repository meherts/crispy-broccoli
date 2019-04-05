package com.idexx.labstation.springguide.configuration.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Java-based Container Configuration
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-java
 */
@Configuration
@ComponentScan(basePackages = "com.idexx.labstation.springguide.configuration.javabased") //  loads Person bean
public class AppConfig
{
    @Bean
    public HelloBean helloBean()
    {
        return new HelloBean();
    }

    @Bean
    public GoodbyeBean goodbyeBean()
    {
        return new GoodbyeBean();
    }
}
