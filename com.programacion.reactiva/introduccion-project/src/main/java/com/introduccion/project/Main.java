package com.introduccion.project;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> elementosFromMono = new ArrayList<Integer>();
        List<Integer> elementosFromFlux = new ArrayList<Integer>();
        // Creamos un Mono
        Mono<Integer> mono = Mono.just(121);

        // Creamos un Flux
        Flux<Integer> flux = Flux.just(12,14,9,11,19,20,23);

        // Cómo mostramos los datos de mono
        // Necesitamos subscribirnos para ver los elementos

        // Nos suscribimos al mono

        mono.subscribe(elementosFromMono::add);
        flux.subscribe(elementosFromFlux::add);

        System.out.println(elementosFromMono);
        System.out.println(elementosFromFlux);

    }
}