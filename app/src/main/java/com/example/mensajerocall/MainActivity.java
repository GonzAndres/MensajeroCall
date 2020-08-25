package com.example.mensajerocall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mensajerocall.Controlador.PageController;
import com.example.mensajerocall.Controlador.Perfil;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3, tab4;
    PageController pageController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icononuevo2);


        tabLayout = findViewById(R.id.TabLayout);
        viewPager = findViewById(R.id.ViewPager);

        tab1 = findViewById(R.id.TabContactos);
        tab2 = findViewById(R.id.TabLlamadas);
        tab3 = findViewById(R.id.TabMensajes);
        tab4 = findViewById(R.id.TabPerfil);

        pageController = new PageController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageController);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pageController.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1) {
                    pageController.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2) {
                    pageController.notifyDataSetChanged();
                }
                if (tab.getPosition() == 3) {
                    pageController.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }

    public void Tomarfotografia(View view) {

        Intent tomarfotografia = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(tomarfotografia);


    }

    public void Abrirtecladoparallamar(View view) {

        Intent llamar = new Intent(Intent.ACTION_DIAL);
        startActivity(llamar);


    }

    public void Irperfil(View view) {
        viewPager.setCurrentItem(3);
    }

    public void Irmensaje(View view) {
        viewPager.setCurrentItem(2);
    }

    public void Onclickenviarmensajetoast(View view) {

        Toast notificacion = Toast.makeText(this, "Mensaje enviado", Toast.LENGTH_SHORT);
        notificacion.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menudeaction, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:

                finishAffinity();

                //Intent intent = new Intent(Intent.ACTION_MAIN);
                //intent.addCategory(Intent.CATEGORY_HOME);
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}


