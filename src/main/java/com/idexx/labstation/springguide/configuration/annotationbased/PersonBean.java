package com.idexx.labstation.springguide.configuration.annotationbased;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Using JSR 330 Standard Annotations
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-standard-annotations
 */
@Named
class PersonBean
{
    private final HelloBean helloBean;
    private final GoodbyeBean goodbyeBean;

    @Inject
    PersonBean(HelloBean helloBean, GoodbyeBean goodbyeBean)
    {
        this.helloBean = helloBean;
        this.goodbyeBean = goodbyeBean;
    }

    void speak()
    {
        this.helloBean.sayHello();
        try { Thread.sleep(1000); } catch(InterruptedException ignored) { }
        this.goodbyeBean.sayGoodbye();
    }
}