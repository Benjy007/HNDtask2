package com.example.alumnos.hndtask2;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.alumnos.hndtask2.beans.UsuarioBean;


public class Preferencias {
    private Context context;
    private final String PREFERENCIAS = "preferencias";
    private final String LOGIN = "login";
    private final String USUARIO = "usuario";

    public Preferencias(Context context) {
        this.context = context;
    }

    public void setUsuario(UsuarioBean usuario){
        String usuarioJson = usuario.toJson();

        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(USUARIO, usuarioJson);
        editor.commit();
    }

    public UsuarioBean getUsuario(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);

        String usuarioJson = sharedPreferences.getString(USUARIO,"");
        return UsuarioBean.fromJson(usuarioJson);

    }

    public void setLogin(boolean login){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(LOGIN,login);

        editor.commit();
    }

    public boolean isLogin(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);

        return sharedPreferences.getBoolean(LOGIN, false);
    }
}
