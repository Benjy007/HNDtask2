package com.example.alumnos.hndtask2.beans;


import java.io.Serializable;

public class PersonajeBean implements Serializable{
    private String nombre, descripcion, caracteristicaspersonajes;
    private int imagen;

    public PersonajeBean( int imagen,String nombre, String descripcion, String caracteristicaspersonajes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicaspersonajes = caracteristicaspersonajes;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicaspersonajes() {
        return caracteristicaspersonajes;
    }

    public void setCaracteristicaspersonajes(String caracteristicas_del_personajes) {
        this.caracteristicaspersonajes = caracteristicas_del_personajes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
