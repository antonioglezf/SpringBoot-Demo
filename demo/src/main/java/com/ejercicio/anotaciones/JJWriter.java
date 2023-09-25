package com.ejercicio.anotaciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class JJWriter {
	private String content = "default";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
