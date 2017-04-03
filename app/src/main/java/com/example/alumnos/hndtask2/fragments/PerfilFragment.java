package com.example.alumnos.hndtask2.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alumnos.hndtask2.Preferencias;
import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.UsuarioBean;


public class PerfilFragment extends Fragment {
    private TextView txtNombre, txtApellidos, txtUsuario;
    public static PerfilFragment newInstance () {
        return new PerfilFragment();
    }
    private UsuarioBean usuarioBean;
    public PerfilFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        txtNombre = (TextView) view.findViewById(R.id.txtNombre);
        txtApellidos = (TextView) view.findViewById(R.id.txtApellidos);
        txtUsuario = (TextView) view.findViewById(R.id.txtUsuario);

        Preferencias preferencias = new Preferencias(getActivity());
        usuarioBean = preferencias.getUsuario();

        txtNombre.setText("Nombre: "+usuarioBean.getNombre());
        txtApellidos.setText("Apellidos: "+usuarioBean.getApellidos());
        txtUsuario.setText("Usuario: "+usuarioBean.getUsuario());
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


}
