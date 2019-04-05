package com.idexx.labstation.springguide.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java-based Container Configuration
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-java
 */
@Configuration
public class AppConfig
{
    @Bean
    public HelloBean helloBean()
    {
        return new HelloBean();
    }
}
