package com.hello.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hello.springdemo.game.GamingConsole;
import com.hello.springdemo.game.pacman;
import com.hello.springdemo.game.GameRunner;

@Configuration
public class GameConfiguration
{
    @Bean
    protected GamingConsole game() {
        pacman g=new pacman();
        return g;
    }
    
    @Bean
    protected GameRunner gameRunner(GamingConsole game) {
       GameRunner runner=new GameRunner(game);
       return runner;
    } 
}
