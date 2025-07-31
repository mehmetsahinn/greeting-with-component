package org.example.app;

import org.example.renderer.GreetingRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "org.example")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
        renderer1.render();

        GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
        renderer2.render();

    }
}