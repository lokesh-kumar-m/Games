package com.hello.springdemo.game;

public class gameRunner
{
    //Mario game;
    private GamingConsole game;

    public gameRunner(GamingConsole game) {
        this.game=game;
    }
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Runnig game"+game);
        game.up();
        game.left();
        game.right();
        game.down();
    }
    
}
