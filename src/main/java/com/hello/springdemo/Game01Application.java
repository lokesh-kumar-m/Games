package com.hello.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hello.springdemo.game.GamingConsole;
import com.hello.springdemo.game.GameRunner;

@SpringBootApplication
public class Game01Application {

	public static void main(String[] args) {
	    
	    try(var context =
                new AnnotationConfigApplicationContext
                    (GameConfiguration.class)){
	        context.getBean(GamingConsole.class).up(); 
	        context.getBean(GameRunner.class).run();
	    }
	   
	}

}
