package com.example.bibliogaitebeta.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bibliogaitebeta.Adapter.AdapterProyectos;
import com.example.bibliogaitebeta.ClasesPropias.Proyectos;
import com.example.bibliogaitebeta.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmento_Proyectos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Proyectos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerViewProyectos;
    private AdapterProyectos adapterProyectos;
    private ArrayList<Proyectos> listaProyectos;

    public Fragmento_Proyectos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmento_proyectos.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Proyectos newInstance(String param1, String param2) {
        Fragmento_Proyectos fragment = new Fragmento_Proyectos();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragmento_proyectos, container, false);
        // Configurar el RecyclerView y el GridLayoutManager
        // Crear una lista de proyectos
        listaProyectos = new ArrayList<>();
        listaProyectos.add(new Proyectos("Proyecto prueba", "urururur"));
        listaProyectos.add(new Proyectos("Proyecto prueba2", "urururur"));
        listaProyectos.add(new Proyectos("Proyecto prueba3", "urururur"));
        listaProyectos.add(new Proyectos("Proyecto prueba4", "urururur"));
        listaProyectos.add(new Proyectos("Proyecto prueba5", "urururur"));
        listaProyectos.add(new Proyectos("Proyecto prueba6", "urururur"));
        // Agregar más proyectos si es necesario

        // Configurar el RecyclerView y el GridLayoutManager
        recyclerViewProyectos = view.findViewById(R.id.recyclerViewProyectos);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        recyclerViewProyectos.setLayoutManager(layoutManager);

        // Configurar el adaptador y asignarlo al RecyclerView
        adapterProyectos = new AdapterProyectos(listaProyectos);
        recyclerViewProyectos.setAdapter(adapterProyectos);
        return view;
    }

}