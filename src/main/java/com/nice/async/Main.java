package com.nice.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 21/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nice.async");
        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.getClass());
        myService.doStuff(6);
        myService.doStuff(42);
        myService.doStuff(73);
    }
}
