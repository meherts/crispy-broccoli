package com.idexx.labstation.springguide.configuration.javabased;

import javax.inject.Named;
import java.util.concurrent.TimeUnit;

/**
 * Using JSR 330 Standard Annotations
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-standard-annotations
 */
@Named
class Person
{
    private final HelloBean helloBean;
    private final GoodbyeBean goodbyeBean;

    Person(HelloBean helloBean, GoodbyeBean goodbyeBean)
    {
        this.helloBean = helloBean;
        this.goodbyeBean = goodbyeBean;
    }

    void speak() throws InterruptedException
    {
        this.helloBean.sayHello();
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        this.goodbyeBean.sayGoodbye();
    }
}