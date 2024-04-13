package com.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfiguration {
    @Bean
    @Conditional(MyConditional.class) // Бин будет создан только если условие верно
    public ConditionalBean conditionalBean() {
        return new ConditionalBean();
    }
}

