package com.hello.exampleTwo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class ExampleClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class prototypeClass{

}

@Configuration
@ComponentScan
public class Scopes {
    public static void main(String[] ar){
        try(var context=new AnnotationConfigApplicationContext
                    (Scopes.class)){
                    for(int i=0;i<3;i++)
					System.out.println(context.getBean(ExampleClass.class));  
                    /*
                    The instance of Normal class are same, By default all beans are singleton
                    One object container per IoC containter 
                    Stateless beans: if it is a genic bean.
                    */ 


					for(int i=0;i<3;i++)
					System.out.println(context.getBean(prototypeClass.class));
                    /*
                    Each time a new instance is created in case of prototype
                    Stateful beans 
                    */
	    }
    }
}

/*
 * Java Singleton: One object instance per JVM.
 * Sprint Singleton: In spring, it is refferd as one object instance per Spring IoC container.
 * If we run a program that contains only one spring IoC container, then java singleton 
 * and spring singleton might be the same.
 */