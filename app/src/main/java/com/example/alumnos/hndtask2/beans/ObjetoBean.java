package com.example.alumnos.hndtask2.beans;


import java.io.Serializable;

public class ObjetoBean implements Serializable{
    private int imagen;
private String nombre, descripcion;


    public ObjetoBean(int imagen ,String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
