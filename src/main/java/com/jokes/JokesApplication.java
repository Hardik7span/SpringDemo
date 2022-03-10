package com.jokes;

import com.span.SpringApplicationDemo;
import com.span.SpringDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class JokesApplication {
    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDemoApplication.class,args);
    }
}
