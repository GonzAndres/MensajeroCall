package com.example.mensajerocall.Controlador;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mensajerocall.R;

import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Contactos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Contactos extends Fragment {





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    ViewPager viewPager;

    public Contactos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Contactos.
     */
    // TODO: Rename and change types and number of parameters
    public static Contactos newInstance(String param1, String param2) {
        Contactos fragment = new Contactos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }


    ArrayList<String> ListDatos;
    RecyclerView recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        /*View vista = inflater.inflate(R.layout.fragment_contactos, container, false);

        ListDatos = new ArrayList<String>();

        Vector nombres = new Vector(12);
        nombres.addElement("Gonzalo");
        nombres.addElement("Ismael");
        nombres.addElement("Jose");
        nombres.addElement("Carmen");
        nombres.addElement("Jose");
        nombres.addElement("Maria");
        nombres.addElement("Nataly");
        nombres.addElement("Camilo");
        nombres.addElement("Andres");
        nombres.addElement("Fernando");
        nombres.addElement("Rocio");
        nombres.addElement("Ana");


        recycler=vista.findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        for (int i = 0; i <= 11; i++) {
            ListDatos.add(nombres.elementAt(i) + "");
        }

        AdaptadorDatos adapter = new AdaptadorDatos(ListDatos);
        recycler.setAdapter(adapter);

*/





        /*recycler = (RecyclerView) recycler.findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        ListDatos = new ArrayList<String>();

        for (int i = 0; i <= 50; i++) {
            ListDatos.add("Dato # " + i + " ");
        }

        AdaptadorDatos adapter = new AdaptadorDatos(ListDatos);
        recycler.setAdapter(adapter);*/

       // return vista;


        View rootView = inflater.inflate(R.layout.fragment_contactos, container, false);

        LinearLayoutCompat btn = (LinearLayoutCompat) rootView.findViewById(R.id.pruebadeboton);
        viewPager = (ViewPager) getActivity().findViewById(R.id.ViewPager);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });

        return rootView;
        //return inflater.inflate(R.layout.fragment_contactos, container, false);

    }






    }