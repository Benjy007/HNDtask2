package com.example.alumnos.hndtask2.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumnos.hndtask2.MainActivity;
import com.example.alumnos.hndtask2.Preferencias;
import com.example.alumnos.hndtask2.R;
import com.example.alumnos.hndtask2.beans.UsuarioBean;

public class  LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editUsuario, editPassword;
    private Button btn_entrar, btn_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editUsuario = (EditText) findViewById(R.id.editUsuario);
        editPassword = (EditText) findViewById(R.id.editPassword);

        btn_entrar = (Button) findViewById(R.id.btn_entrar);
        btn_registro = (Button) findViewById(R.id.btn_registro);

        btn_entrar.setOnClickListener(this);
        btn_registro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_entrar: //login
                //validar datos
                String usuario = editUsuario.getText().toString();
                String password = editPassword.getText().toString();
                if (usuario != null && password!= null && !usuario.isEmpty() && !password.isEmpty()) {
                    Preferencias preferencias = new Preferencias(LoginActivity.this);
                    UsuarioBean usuarioBean = preferencias.getUsuario();
                    if (usuarioBean.getUsuario() != null) {
                        if (usuario.equals(usuarioBean.getUsuario()) && password.equals(usuarioBean.getPassword())) {

                            preferencias.setLogin(true);
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(LoginActivity.this, "No existe el usuario", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Datos obligatorios", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_registro:
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
                break;
        }
    }
}
