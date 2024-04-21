package com.example.bibliogaitebeta.ClasesPropias;

public class Proyectos {

    private String nombre;
    private String url;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setUrl(String url) {
        this.url = url;
    }

    public Proyectos(String nombre, String url) {

        this.nombre = nombre;
        this.url = url;

    }

}
