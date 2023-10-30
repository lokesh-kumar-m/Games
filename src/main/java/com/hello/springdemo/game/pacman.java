package com.hello.springdemo.game;

public class pacman implements GamingConsole
{

        public void up() {
            System.out.println("up");
        }
        public void down() {
            System.out.println("down");
        }
        public void left() {
            System.out.println("left");
        }
        public void right() {
            System.out.println("right");
        }
        public void eat() {
            System.out.println("eat");
        }
}
