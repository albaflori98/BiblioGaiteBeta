package com.example.bibliogaitebeta.Fragmentos;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bibliogaitebeta.PaginaLoginViewModel;
import com.example.bibliogaitebeta.R;

public class Fragmento_Pagina_Login extends Fragment {

    private PaginaLoginViewModel mViewModel;

    public static Fragmento_Pagina_Login newInstance() {
        return new Fragmento_Pagina_Login();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pagina_login, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PaginaLoginViewModel.class);
        // TODO: Use the ViewModel
    }

}