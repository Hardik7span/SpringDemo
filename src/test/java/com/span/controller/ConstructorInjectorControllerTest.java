package com.span.controller;

import com.span.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {
    ConstructorInjectorController constructorInjectorController;

    @BeforeEach
    void setUp() {
        constructorInjectorController=new ConstructorInjectorController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectorController.getGreeting());
    }
}