package com.idexx.labstation.springguide.configuration.annotationbased;

import javax.inject.Named;

@Named
class HelloBean
{
    void sayHello()
    {
        System.out.println("Hello, world!");
    }
}