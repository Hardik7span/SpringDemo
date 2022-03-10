package com.span;

import com.span.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.services"})
public class SpringApplicationDemo {
    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDemoApplication.class, args);
        MyController myController= (MyController) ctx.getBean("myController");

        String greeting=myController.sayHello();

        System.out.println(greeting);

        System.out.println("Property based controller");

        PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("Setter based controller");

        SetterBasedController setterBasedController=(SetterBasedController) ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());


        System.out.println("Constructor based controller");

        ConstructorInjectorController constructorInjectorController=(ConstructorInjectorController) ctx.getBean("constructorInjectorController");
        System.out.println(constructorInjectorController.getGreeting());

        System.out.println("i18N controller");

        I18N i18N=(I18N) ctx.getBean("i18N");

        System.out.println(i18N.sayGreeting());
    }
}
