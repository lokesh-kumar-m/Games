package com.hello.springdemo.game;

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
