package com.hello.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hello.springdemo.game.GamingConsole;
import com.hello.springdemo.game.GameRunner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
@ComponentScan("com.hello.springdemo.game") /*Java would get confused in finding the bean Components 
												Hence we need to give a location to find them */ 
public class AppLauncher { 
	public static void main(String[] args) {
	    
	    try(var context =
                new AnnotationConfigApplicationContext
                    (AppLauncher.class)){
	        context.getBean(GamingConsole.class).up(); 
	        context.getBean(GameRunner.class).run();
	    }
	   
	}

}
