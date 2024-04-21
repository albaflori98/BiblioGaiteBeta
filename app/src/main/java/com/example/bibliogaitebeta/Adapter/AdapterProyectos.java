package com.example.bibliogaitebeta.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bibliogaitebeta.ClasesPropias.Proyectos;
import com.example.bibliogaitebeta.R;
import com.example.bibliogaitebeta.ViewHolder.ViewHolderProyecto;

import java.util.ArrayList;

public class AdapterProyectos extends RecyclerView.Adapter<ViewHolderProyecto> {
    private ArrayList<Proyectos> listaProyectos;

    public AdapterProyectos(ArrayList<Proyectos> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    @NonNull
    @Override
    public ViewHolderProyecto onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.proyectos, viewGroup, false);
        return new ViewHolderProyecto(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProyecto viewHolder, int position) {
        Proyectos proyecto = listaProyectos.get(position);
        viewHolder.mostrarProyecto(proyecto);
    }

    @Override
    public int getItemCount() {
        return listaProyectos.size();
    }


}