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
import android.widget.ListView;

import com.example.alumnos.hndtask2.Actividades.PersonajesActivity;
import com.example.alumnos.hndtask2.Actividades.TipsActivity;
import com.example.alumnos.hndtask2.Adapters.TipAdapter;
import com.example.alumnos.hndtask2.Modelo;
import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.PersonajeBean;
import com.example.alumnos.hndtask2.beans.TipBean;

import java.util.ArrayList;

import static com.example.alumnos.hndtask2.R.string.personajes;

public class TipsFragment extends Fragment
        implements AdapterView.OnItemClickListener{

    private ListView lstTips;
    private ArrayList<TipBean> tips;
    public static final String TIP_KEY="TIP_KEY";

    public TipsFragment() {

    }

    public static TipsFragment newInstance(){
        return new TipsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tips, container, false);
        lstTips = (ListView) view.findViewById(R.id.lsttips);
        tips = Modelo.gettips();
        TipAdapter adapter = new TipAdapter(getActivity(), R.layout.item, tips);
        lstTips.setAdapter(adapter);
        lstTips.setOnItemClickListener(this);
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
        TipBean tipBean = tips.get(posicion);
        Intent intent = new Intent(getActivity(), TipsActivity.class);
        intent.putExtra(TIP_KEY, tipBean);

        startActivity(intent);
    }
}
