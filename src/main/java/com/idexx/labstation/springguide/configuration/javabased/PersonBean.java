package com.idexx.labstation.springguide.configuration.javabased;

class PersonBean
{
    private final HelloBean helloBean;
    private final GoodbyeBean goodbyeBean;

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