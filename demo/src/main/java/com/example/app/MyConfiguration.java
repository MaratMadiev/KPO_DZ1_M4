package com.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Аннотация для указания класса конфигурации
public class MyConfiguration {

    @Bean // Аннотация для создания бина
    public AnotherBean anotherBean() {
        return new AnotherBean();
    }
}