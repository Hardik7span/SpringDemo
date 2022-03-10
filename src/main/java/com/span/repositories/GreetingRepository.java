package com.span.repositories;

import org.springframework.stereotype.Repository;


public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}