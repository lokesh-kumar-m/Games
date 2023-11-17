package com.hello.springdemo.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner
{
    //Mario game;
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game=game;
    }
    public void run()
    {
        game.up();
        game.left();
        game.right();
        game.down();
    }
    
}
