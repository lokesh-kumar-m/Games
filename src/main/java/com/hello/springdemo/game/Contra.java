package com.hello.springdemo.game;

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
