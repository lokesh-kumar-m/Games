package com.hello.springdemo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //A way of telling spring to create Beans for us
            //An instance of the class will be managed by spring framework
@Primary  //In case of multiple beans the component with primary will be chosen as default
public class Mario implements GamingConsole
{
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Duck");
    }
    public void left() {
        System.out.println("back");
    }
    public void right() {
        System.out.println("forward");
    }
}
