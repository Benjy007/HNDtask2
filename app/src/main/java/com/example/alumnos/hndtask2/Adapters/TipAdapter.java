package com.example.alumnos.hndtask2.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.TipBean;

import java.util.List;

public class TipAdapter extends ArrayAdapter<TipBean> {
    private Context context;
    private int resource;
    private List<TipBean> tips;

    public TipAdapter(Context context, int resource, List<TipBean> tips) {
        super(context, resource, tips);

        this.context = context;
        this.resource = resource;
        this.tips = tips;
    }

    class ViewHolder{
        TextView txtItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        TipAdapter.ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.txtItem = (TextView) view.findViewById(R.id.txte);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        TipBean tipbean = tips.get(position);

        viewHolder.txtItem.setText(tipbean.getTitulo());
        return view;
    }
}
