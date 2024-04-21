package com.example.bibliogaitebeta.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bibliogaitebeta.ClasesPropias.Proyectos;
import com.example.bibliogaitebeta.R;

public class ViewHolderProyecto extends RecyclerView.ViewHolder {
    private TextView textoTitulo;
    private ImageView imagen;

    public ViewHolderProyecto(View layout) {
        super(layout);
        textoTitulo = layout.findViewById(R.id.tituloProyecto);
        imagen = layout.findViewById(R.id.imagenProyecto);
    }

    public void mostrarProyecto(Proyectos proyecto){
        textoTitulo.setText(proyecto.getNombre());

    }
}