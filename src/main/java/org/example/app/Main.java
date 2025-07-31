package org.example.app;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}