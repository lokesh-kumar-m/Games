package com.hello.springdemo.SpringConfigurationAndBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String  name, int age, Address address ) {};
record Address(String line,String city) {};
@Configuration
//anything that is managed by spring is called spring beans
//in case of multiple beans with same name, use @Primary 
//0  to resolve multiple candidate beans error  
public class HelloConfiguration
{
    @Bean
    protected String name() {
        return "Mario";
    }
    @Bean 
    protected int moves() {
        return 5;
    }
    @Bean
    protected String rank() {
        return "Oldest";
    }
    @Bean
    protected int levels() {
        return 20;
    }
    @Bean
    protected Person person() {
        Person p=new Person("Mario Brother",1, new Address("Little Mario","@Mario"));
        
        return p;
    }
    @Bean  //name of the bean Bean(name="addr"); --> Bean with name addr
    protected Address address() {
        Address a=new Address("Brothers","Home");
        return a;
    }
    //Creating a new Bean with existing beans 
    @Bean
    protected Person personB() {
      Person p=new Person(name(),moves(),address());
      return p;
    }
    
    
}
