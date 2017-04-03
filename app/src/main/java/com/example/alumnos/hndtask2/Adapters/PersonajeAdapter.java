package com.example.alumnos.hndtask2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.PersonajeBean;

import java.util.List;

public class    PersonajeAdapter extends ArrayAdapter<PersonajeBean> {
    private Context context;
    private int resource;
    private List<PersonajeBean> personajes;

    public PersonajeAdapter(Context context, int resource, List<PersonajeBean> personajes) {
        super(context, resource, personajes);

        this.context = context;
        this.resource = resource;
        this.personajes = personajes;
    }

    class ViewHolder{
        TextView txtItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        PersonajeAdapter.ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.txtItem = (TextView) view.findViewById(R.id.txte);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        PersonajeBean personajeBean = personajes.get(position);

        viewHolder.txtItem.setText(personajeBean.getNombre());
        return view;
    }
}
