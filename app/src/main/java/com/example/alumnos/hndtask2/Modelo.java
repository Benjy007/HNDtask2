package com.example.alumnos.hndtask2;


import com.example.alumnos.hndtask2.beans.ObjetoBean;
import com.example.alumnos.hndtask2.beans.PersonajeBean;
import com.example.alumnos.hndtask2.beans.TipBean;

import java.util.ArrayList;

public class Modelo {
    public static ArrayList<PersonajeBean> getpersonajes(){

        ArrayList<PersonajeBean> personajes = new ArrayList<>();

        personajes.add(new PersonajeBean(R.drawable.caza , "Peter","Nave Principal" ,"Velocidad, Buenas Maniobras"));
        personajes.add(new PersonajeBean(R.drawable.imperia, "Raig","Enemigo" ,"Velocidad, Armas"));
        personajes.add(new PersonajeBean(R.drawable.boss, "Jordi","Boss" ,"Mucha Vida, Arma Potente"));

        return personajes;

    }
    public static ArrayList<ObjetoBean> getobjetos(){

        ArrayList<ObjetoBean> objetos = new ArrayList<>();

        objetos.add(new ObjetoBean(R.drawable.piedra, "Piedra","Objeto Duro"));
        objetos.add(new ObjetoBean(R.drawable.municion, "Municion","Para recargar"));
        objetos.add(new ObjetoBean(R.drawable.caja , "Cajas","Objeto Del Mapa"));

        return objetos;

    }

    public static ArrayList<TipBean> gettips(){

        ArrayList<TipBean> tips = new ArrayList<>();

        tips.add(new TipBean("Volar Mas Rapido", "W P R T Y Z Intro" ));
        tips.add(new TipBean("Mas Municion", "U X B N D L Intro" ));
        tips.add(new TipBean("Inmune", "F J D B P M Intro"));

        return tips;

    }
}
