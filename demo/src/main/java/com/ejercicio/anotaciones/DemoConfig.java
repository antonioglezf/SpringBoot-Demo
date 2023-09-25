package com.ejercicio.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
  
@Configuration
public class DemoConfig {
	  @Bean(name = "jjwriter")
	    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public JJWriter getJJWriter() {
		return new JJWriter();
	}
}
