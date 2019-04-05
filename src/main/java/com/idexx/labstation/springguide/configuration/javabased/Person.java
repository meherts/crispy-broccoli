package com.idexx.labstation.springguide.configuration.javabased;

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
        Thread.sleep(1000);
        this.goodbyeBean.sayGoodbye();
    }
}