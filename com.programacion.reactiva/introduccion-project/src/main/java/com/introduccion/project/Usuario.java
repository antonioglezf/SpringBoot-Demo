package com.introduccion.project;

import reactor.core.publisher.Flux;

public class Usuario {


    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Flux<String> flux = Flux.fromArray(new String[]{"DataEjemplo1", "DataEjemplo2"});

        //flux.subscribe(System.out::println);
        flux.doOnNext(System.out::println).subscribe();

    }
}
