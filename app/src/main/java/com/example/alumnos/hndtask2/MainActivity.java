package com.example.alumnos.hndtask2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.alumnos.hndtask2.Actividades.LoginActivity;
import com.example.alumnos.hndtask2.fragments.AjustesFragment;
import com.example.alumnos.hndtask2.fragments.DescripcionFragment;
import com.example.alumnos.hndtask2.fragments.ObjetosFragment;
import com.example.alumnos.hndtask2.fragments.PerfilFragment;
import com.example.alumnos.hndtask2.fragments.PersonajesFragment;
import com.example.alumnos.hndtask2.fragments.TipsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navView;
    private FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();


drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navView = (NavigationView) findViewById(R.id.navView);

        navView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }
     @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_ajustes:
                AjustesFragment fragmentajuestes = AjustesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, fragmentajuestes).commit();
               break;
           case R.id.item_descripcion_del_juego:
               DescripcionFragment fragmentdescripcion =DescripcionFragment.newInstance();
               fm.beginTransaction().replace(R.id.container, fragmentdescripcion).commit();
               break;
           case R.id.item_objetos_del_mapa:
               ObjetosFragment fragmentajustes = ObjetosFragment.newInstance();
               fm.beginTransaction().replace(R.id.container, fragmentajustes).commit();
               break;

            case R.id.item_perfil:
                PerfilFragment fragmentperfil = PerfilFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, fragmentperfil).commit();
                break;

            case R.id.item_personajes:
                PersonajesFragment fragmentpersonajes = PersonajesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, fragmentpersonajes).commit();
                break;

            case R.id.item_tips_sobre_el_juego:
                TipsFragment fragmenttips = TipsFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, fragmenttips).commit();
                break;

            case R.id.item_salir:
                Preferencias preferencias = new Preferencias(MainActivity.this);
                preferencias.setLogin(false);
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawerLayout.closeDrawers();
        return true;
    }
}
