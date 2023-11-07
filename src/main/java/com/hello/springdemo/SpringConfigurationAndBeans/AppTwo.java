package com.hello.springdemo.SpringConfigurationAndBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hello.springdemo.game.Contra;
import com.hello.springdemo.game.Mario;
import com.hello.springdemo.game.GameRunner;
import com.hello.springdemo.game.pacman;

@SpringBootApplication
public class AppTwo {

	public static void main(String[] args) {
		//launching spring context with configuration class
	    try(var context=
	            new AnnotationConfigApplicationContext
	            (HelloConfiguration.class)){
	      //Configure the things we want sprint to manage
	        //HelloConfiguration-@Configuration
	        //name-@Bean
	        System.out.println("Name: "+context.getBean("name"));
	        System.out.println("Moves: " +context.getBean("moves"));
	        System.out.println("Age: "+context.getBean("rank"));
	        System.out.println("Levels: "+context.getBean("levels"));
	        System.out.println("Person: "+context.getBean("person"));
	        System.out.println("address: "+context.getBean("address"));
	        
	        for(String s:context.getBeanDefinitionNames()) {
	            System.out.println(s);
	        }
	    } 
	}

}
