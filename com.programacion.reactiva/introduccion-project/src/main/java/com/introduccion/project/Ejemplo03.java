package com.introduccion.project;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ejemplo03 {
    public static void main(String[] args) {
        Flux<String> flux = Flux.fromArray(new String[]{"DataEjemplo1","DataEjemplo2"});

        //flux.subscribe(System.out::println);
        flux.doOnNext(System.out::println).subscribe();
    }
}
