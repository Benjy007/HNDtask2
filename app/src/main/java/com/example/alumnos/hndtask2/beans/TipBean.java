package com.example.alumnos.hndtask2.beans;


import java.io.Serializable;

public class TipBean implements Serializable{
    private String  titulo,detalle;

    public TipBean(String titulo, String detalle) {
        this.titulo = titulo;
        this.detalle = detalle;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
