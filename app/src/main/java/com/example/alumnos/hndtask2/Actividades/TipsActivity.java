package com.example.alumnos.hndtask2.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.TipBean;
import com.example.alumnos.hndtask2.fragments.TipsFragment;

public class TipsActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView titulo, detalle;
    private Button btnCompartir;
    private String textoCompartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        TipBean tipBean = (TipBean) getIntent().getSerializableExtra(TipsFragment.TIP_KEY);

        titulo = (TextView) findViewById(R.id.txtTitulo);

        detalle = (TextView) findViewById(R.id.txtDetalle);

        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);

        titulo.setText (tipBean.getTitulo());
        detalle.setText (tipBean.getDetalle());
        textoCompartir = tipBean.getDetalle();
    }

    @Override
    public void onClick(View view) {
        Intent intentCompartir = new Intent(Intent.ACTION_SEND);
        intentCompartir.setType("text/plain");
        intentCompartir.putExtra(Intent.EXTRA_TEXT,textoCompartir );
        startActivity(Intent.createChooser(intentCompartir, "Compartir en..."));
    }
}
