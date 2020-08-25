package com.example.mensajerocall;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Quitar el Action Bar
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

    }


    public void IniciarSesion (View view){

        Intent iniciarsesion = new Intent(this, MainActivity.class);
        startActivity(iniciarsesion);

    }

    public void Registrarse (View view){
        Intent registrarse = new Intent(this, RegisterActivity.class);
        startActivity(registrarse);
    }







}