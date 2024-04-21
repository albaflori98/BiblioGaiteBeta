package com.example.bibliogaitebeta.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bibliogaitebeta.R;
import com.example.bibliogaitebeta.ClasesPropias.Resenha;

public class ViewHolderResenha extends RecyclerView.ViewHolder {
    private TextView textoTitulo;

    public ViewHolderResenha(View layout) {
        super(layout);
        textoTitulo = layout.findViewById(R.id.tituloProyecto);
    }

    public void mostrarResenha(Resenha resenha){
        textoTitulo.setText(resenha.getNombre());

    }
}
