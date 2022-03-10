package com.span.controller;

import com.span.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18N {
    private final GreetingService greetingService;

    public I18N(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        System.out.println(greetingService.sayGreeting());
        return "Hello";
    }
}
