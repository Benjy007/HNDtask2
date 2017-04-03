package com.example.alumnos.hndtask2.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alumnos.hndtask2.Actividades.PersonajesActivity;
import com.example.alumnos.hndtask2.Adapters.PersonajeAdapter;
import com.example.alumnos.hndtask2.Modelo;
import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.PersonajeBean;

import java.util.ArrayList;


public class PersonajesFragment extends Fragment
        implements AdapterView.OnItemClickListener{

    private ListView lstPersonajes;
    private ArrayList<PersonajeBean> personajes;
    public static final String PERSONAJE_KEY="PERSONAJE_KEY";

    public PersonajesFragment() {

    }

    public static PersonajesFragment newInstance(){
        return new PersonajesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personajes, container, false);
        lstPersonajes = (ListView) view.findViewById(R.id.lstpersonajes);
        personajes = Modelo.getpersonajes();
        PersonajeAdapter adapter = new PersonajeAdapter(getActivity(), R.layout.item, personajes);
        lstPersonajes.setAdapter(adapter);
        lstPersonajes.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        PersonajeBean personajeBean = personajes.get(posicion);
        Intent intent = new Intent(getActivity(), PersonajesActivity.class);
        intent.putExtra(PERSONAJE_KEY, personajeBean);

        startActivity(intent);
    }
}
