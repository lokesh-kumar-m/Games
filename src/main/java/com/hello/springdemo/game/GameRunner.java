package com.hello.springdemo.game;

public class GameRunner
{
    //Mario game;
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
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
