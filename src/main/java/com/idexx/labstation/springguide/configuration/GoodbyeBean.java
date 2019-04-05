package com.idexx.labstation.springguide.configuration;

import javax.inject.Named;

@Named
class GoodbyeBean
{
    void sayGoodbye()
    {
        System.out.println("Goodbye, world!");
    }
}