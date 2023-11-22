package com.hello.springdemo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ContraQualifier")//This is used to auto-wire a specific bean
public class Contra implements GamingConsole
{
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("back");
    }
    public void left() {
        System.out.println("shoot left");
    }
    public void right() {
        System.out.println("shoot right");
    }
}
