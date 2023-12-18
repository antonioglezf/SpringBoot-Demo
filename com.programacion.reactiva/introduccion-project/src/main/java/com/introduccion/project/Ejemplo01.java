package com.introduccion.project;

import reactor.core.publisher.Mono;

public class Ejemplo01 {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hola");
        mono.subscribe(
                data -> System.out.println(data), // onNext
                err -> System.out.println(err), // onError
                () -> System.out.println("Completado!!") //onComplete
        );
    }
}
