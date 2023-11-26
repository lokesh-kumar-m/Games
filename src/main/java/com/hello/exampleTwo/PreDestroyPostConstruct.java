package com.hello.exampleTwo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left = null;
        right=null;
    }
}
@Component
class ExampleDepend{
    private ExampleTwoDepend exampletoDepend;
    public ExampleDepend(ExampleTwoDepend exampletoDepend){
        super();
        System.out.println("All dependencies are ready");
        this.exampletoDepend=exampletoDepend;
    }
    @PostConstruct
    public void initialize(){
        Node root=new Node(1);
        root=insert(root,4);
        root=insert(root,2);
        root=insert(root,6);
        root=insert(root,8);
        root=insert(root,0);
        int h=ExampleTwoDepend.getHeight(root);
        System.out.println(h);
    }
    private Node insert(Node root, int i) {
        if(root==null)return new Node(i);
        if(root.data>i)root.left=insert(root.left,i);
        if(root.data<i)root.right=insert(root.right,i);
        return root;
    }
    @PreDestroy
    private void cleanup(){
        System.out.println("terminating connections");
    }
}


@Component
class ExampleTwoDepend{
    protected static int getHeight(Node root) {
        if(root==null)return -1;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}

@Configuration
@ComponentScan
public class PreDestroyPostConstruct {

    public static void main(String[] ar){
        try(var context=new AnnotationConfigApplicationContext
                    (PreDestroyPostConstruct.class)){
                       // context.getBean(ExampleDepend.class).initialize();
                    Arrays.stream(context.getBeanDefinitionNames()).
                    forEach(System.out::println);
	    }
    }
}

/*
Predestroy is used to terminate all connections, removing a bean before terminating
 */