package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory-config.xml");

		// Obtener e inicializar el bean
		HelloApplicationContext hello = (HelloApplicationContext) context.getBean("helloApplicationContext");
		hello.setMsg("¡Este es un objeto A!");

		// Mostrar el valor actualizado
		hello.getMsg();

		// Obtener otra instancia del mismo bean y mostrar el valor nuevamente
		HelloApplicationContext helloDos = (HelloApplicationContext) context.getBean("helloApplicationContext");
		helloDos.getMsg();
	}
}
