package com.hello.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan /*Java would get confused in finding the bean Components 
												Hence we need to give a location to find them */ 
public class ExampleService { 
	public static void main(String[] args) {
	    
	    try(var context =
                new AnnotationConfigApplicationContext
                    (ExampleService.class)){
	       int temp=context.getBean(CalculateService.class).findMax();
						System.out.println(temp);
	    }
	}

}
