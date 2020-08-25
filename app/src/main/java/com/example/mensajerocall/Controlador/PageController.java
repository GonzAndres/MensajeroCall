package com.example.mensajerocall.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageController extends FragmentPagerAdapter {

    int numoftabs;

    public PageController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Contactos();
            case 1:
                return new Llamadas();
            case 2:
                return new Mensajes();
            case 3:
                return new Perfil();
            default:
                return null;
        }




    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
