package com.example.alumnos.hndtask2.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumnos.hndtask2.Actividades.PersonajesActivity;
import com.example.alumnos.hndtask2.R;

public class DescripcionFragment extends Fragment implements  View.OnClickListener {


    private Button btnCompartir;
    private TextView txtDescrip;
    public static DescripcionFragment newInstance () {
        return new DescripcionFragment();
    }
    String descripcion;
    public DescripcionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descripcion, container, false);
        btnCompartir = (Button) view.findViewById(R.id.btnCompartir);
        txtDescrip = (TextView) view.findViewById(R.id.txtDescrip);

        descripcion = "Juego de naves con diferentes niveles y mapas y mas sorpresas";

        txtDescrip.setText(descripcion);
        btnCompartir.setOnClickListener(this);
        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }




    @Override
    public void onClick(View view) {
        Intent intentCompartir = new Intent(Intent.ACTION_SEND);
        intentCompartir.setType("text/plain");
        intentCompartir.putExtra(Intent.EXTRA_TEXT, descripcion);
        startActivity(Intent.createChooser(intentCompartir, "Compartir en..."));

    }
}
