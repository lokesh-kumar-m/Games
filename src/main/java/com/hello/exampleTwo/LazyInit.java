package com.hello.exampleTwo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class Temp1{

}
/* By default spring uses Eager initialization. @Lazy can be used to lazily 
initialize spring beans. i.e the bean is initialized just before it is being
used by the program. In the below exmple first Start is printed, next as we 
are using Temp2 bean it is initialized, so "initialization.." prints and
finally "initialization sucessfull" is printed. If we remove line 43 only 
"Start" is printed .

Eager initialization is preferred, because if there are any errors in the
application we can identify them at application statup. 
*/
@Component
@Lazy
class Temp2{
	private Temp1 temp1;
	public Temp2(Temp1 temp1){
		System.out.println("initialization..");
		this.temp1=temp1;
	}
	public void initString(){
		System.out.println("Initialization Sucessfull");
	}
}


@Configuration
@ComponentScan 
public class LazyInit { 
	public static void main(String[] args) {
	    
	    try(var context =
                new AnnotationConfigApplicationContext
                    (LazyInit.class)){
					System.out.println("Start");
					context.getBean(Temp2.class).initString();
	    }
	}

}
