package com.example.bibliogaitebeta.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bibliogaitebeta.Adapter.AdapterResenhas;
import com.example.bibliogaitebeta.R;
import com.example.bibliogaitebeta.ClasesPropias.Resenha;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmento_Resenha#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Resenha extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerViewResenha;
    private AdapterResenhas adapterResenhas;
    private ArrayList<Resenha> listaResenha;

    public Fragmento_Resenha() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmento_resenha.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Resenha newInstance(String param1, String param2) {
        Fragmento_Resenha fragment = new Fragmento_Resenha();
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
        View view = inflater.inflate(R.layout.fragment_fragmento_resenha, container, false);
        // Configurar el RecyclerView y el GridLayoutManager
        // Crear una lista de proyectos
        listaResenha = new ArrayList<>();
        listaResenha.add(new Resenha("Resenha prueba"));
        listaResenha.add(new Resenha("Resenha prueba 2"));
        // Agregar más proyectos si es necesario

        // Configurar el RecyclerView y el GridLayoutManager
        recyclerViewResenha = view.findViewById(R.id.recyclerViewResenha);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        recyclerViewResenha.setLayoutManager(layoutManager);

        // Configurar el adaptador y asignarlo al RecyclerView
        adapterResenhas = new AdapterResenhas(listaResenha);
        recyclerViewResenha.setAdapter(adapterResenhas);
        return view;
    }
}