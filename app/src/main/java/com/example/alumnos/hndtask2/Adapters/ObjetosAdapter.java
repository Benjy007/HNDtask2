package com.example.alumnos.hndtask2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.ObjetoBean;

import java.util.List;


public class ObjetosAdapter extends ArrayAdapter<ObjetoBean>{

    private Context context;
    private int resource;
    private List<ObjetoBean> objetos;

    public ObjetosAdapter(Context context, int resource, List<ObjetoBean> objetos) {
        super(context, resource, objetos);
        this.context=context;
        this.resource = resource;
        this.objetos=objetos;
    }

    class ViewHolder{
        TextView txtItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.txtItem = (TextView) view.findViewById(R.id.txte);


            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        ObjetoBean objetoBean = objetos.get(position);

        viewHolder.txtItem.setText(objetoBean.getNombre());
        return view;
    }
}
