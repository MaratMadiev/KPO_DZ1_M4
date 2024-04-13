package com.example.app;

import org.springframework.stereotype.Component;

@Component // Аннотация для объявления компонента
public class MyComponentBean {
    public void doSomething() {
        System.out.println("Doing something in MyComponentBean");
    }
}