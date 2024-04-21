package com.example.bibliogaitebeta.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bibliogaitebeta.R;
import com.example.bibliogaitebeta.ClasesPropias.Resenha;
import com.example.bibliogaitebeta.ViewHolder.ViewHolderResenha;

import java.util.ArrayList;

public class AdapterResenhas extends RecyclerView.Adapter<ViewHolderResenha> {
    private ArrayList<Resenha> listaResenhas;

    public AdapterResenhas(ArrayList<Resenha> listaResenhas) {
        this.listaResenhas = listaResenhas;
    }

    @NonNull
    @Override
    public ViewHolderResenha onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.proyectos, viewGroup, false);
        return new ViewHolderResenha(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderResenha viewHolder, int position) {
        Resenha resenha = listaResenhas.get(position);
        viewHolder.mostrarResenha(resenha);
    }

    @Override
    public int getItemCount() {
        return listaResenhas.size();
    }


}