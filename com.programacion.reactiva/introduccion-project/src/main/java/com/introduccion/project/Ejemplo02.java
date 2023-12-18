package com.introduccion.project;

import reactor.core.publisher.Mono;

public class Ejemplo02 {
    public static void main(String[] args) {

        // Supplier es un provedor sin que le pases un parámetro
        Mono<String> mono = Mono.fromSupplier(() -> {
            throw new RuntimeException("Excepcion ocurrida!");
        });

        mono.subscribe(
                data -> System.out.println(data), // onNext
                err -> System.out.println(err), // onError
                () -> System.out.println("Completado!!") //onComplete
        );
    }
}
