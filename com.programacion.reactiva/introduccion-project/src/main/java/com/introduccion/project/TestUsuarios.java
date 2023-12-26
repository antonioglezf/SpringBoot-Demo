package com.introduccion.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;


public class TestUsuarios {
    private static final Logger log = LoggerFactory.getLogger(TestUsuarios.class);

    public static void main(String[] args) {
        Flux<String> nombres = Flux.just(new String[]{"Juan", "María", "Carlos"});
        //Flux<String> nombres = Flux.fromArray(new String[]{"Juan", "María", "Carlos"});
        Flux<Usuario> usuarios = nombres.map(nombre -> new Usuario(nombre,nombre.split().toUpperC));
    }
}
