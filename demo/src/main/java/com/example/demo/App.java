package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ejercicio.anotaciones.DemoConfig;
import com.ejercicio.anotaciones.JJWriter;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(DemoConfig.class);
        JJWriter writer1 = context.getBean("jjwriter", JJWriter.class);
        System.out.println("new writer1 content="+writer1.getContent());
        System.out.println("setting writer1 content as: New Content");
        writer1.setContent("New Content");
        System.out.println("writer1 content="+writer1.getContent());
        
        JJWriter writer2 = context.getBean("jjwriter", JJWriter.class);
        System.out.println("new writer2 content="+writer2.getContent());
        System.out.println("setting writer1 content as: New Content 2");
        writer2.setContent("New Content 2");
        System.out.println("writer2 content="+writer2.getContent());
        
        System.out.println("writer1 content="+writer1.getContent());
	}
}
