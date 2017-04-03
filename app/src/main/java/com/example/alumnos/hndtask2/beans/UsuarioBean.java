package com.example.alumnos.hndtask2.beans;


import com.google.gson.Gson;

import java.io.Serializable;

public class UsuarioBean implements Serializable {

    private String nombre, apellidos, usuario, password;

    public UsuarioBean(String nombre, String apellidos, String usuario, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
    }

    public UsuarioBean() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toJson() {

        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static UsuarioBean fromJson(String json) {
        if (json != null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, UsuarioBean.class);
        } else {
            return new UsuarioBean();
        }
    }
}
