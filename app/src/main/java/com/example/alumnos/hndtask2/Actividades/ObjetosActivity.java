package com.example.alumnos.hndtask2.Actividades;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.ObjetoBean;
import com.example.alumnos.hndtask2.fragments.ObjetosFragment;

public class ObjetosActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imagen;
    private TextView nombre, descripcion;
    private Button btnCompartir;

    private String textoCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);

        ObjetoBean objetoBean = (ObjetoBean) getIntent().getSerializableExtra(ObjetosFragment.OBJETO_KEY);

        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        imagen = (ImageView) findViewById(R.id.image);

        nombre = (TextView) findViewById(R.id.txtnombre);

        descripcion = (TextView) findViewById(R.id.txtDescrip);

        btnCompartir.setOnClickListener(this);

        nombre.setText (objetoBean.getNombre());
        descripcion.setText (objetoBean.getDescripcion());

        textoCompartir = objetoBean.getDescripcion();

        imagen.setImageDrawable(ContextCompat.getDrawable(this,objetoBean.getImagen()));
    }

    @Override
    public void onClick(View view) {
        Intent intentCompartir = new Intent(Intent.ACTION_SEND);
        intentCompartir.setType("text/plain");
        intentCompartir.putExtra(Intent.EXTRA_TEXT,textoCompartir );
        startActivity(Intent.createChooser(intentCompartir, "Compartir en..."));
    }
}
