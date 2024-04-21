package com.example.bibliogaitebeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Prueba", "Prueba commit");
    }

    public void botonLoginPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_pagina_login_to_fragmento_inicio);
    }
    //PAGINA BANCO DE ARCHIVOS
    public void botonVerTodosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_fragmento_banco2);
    }
    public void botonVolverPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_banco2_to_fragmento_inicio);
    }

    public void botonCasaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_banco2_to_fragmento_inicio);
    }

    //PAGINA RESERVAS
    public void botonVolverReservaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_Reserva_Libros_to_fragmento_inicio);
    }

    public void botonReservarLibrosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_fragmento_Reserva_Libros);
    }

    public void botonCasaLibrosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_Reserva_Libros_to_fragmento_inicio);
    }
    //PAGINA RESERVAR SALA

    public void botonReservarSalaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_fragmento_reserva_sala);
    }

    public void botonCasaSalaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_reserva_sala_to_fragmento_inicio);
    }

    public void botonVolverSalaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_reserva_sala_to_fragmento_inicio);
    }

    //PAGINA PROYECTOS
    public void botonProyectosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_banco2_to_fragmento_proyectos);
    }

    public void botonProyectos2Pulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_fragmento_proyectos);
    }

    public void botonCasaProyectosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_proyectos_to_fragmento_inicio);
    }

    public void botonVolverProyectosPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_proyectos_to_fragmento_banco2);
    }

    //PAGINA RESEÑAS
    public void botonResenhaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_fragmento_resenha2);
    }

    public void botonCasaResenhaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_resenha_to_fragmento_inicio2);
    }

    public void botonVolverResenhaPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_resenha_to_fragmento_inicio2);
    }
    //PAGINA ANHADIR RESEÑA
    public void botonResenhaAnhadirPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_resenha_to_fragment_anhadir_resenha2);
    }

    public void botonCasaResenhaAnhadirPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragment_anhadir_resenha_to_fragmento_inicio2);
    }

    public void botonVolverResenhaAnhadirPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragment_anhadir_resenha_to_fragmento_resenha2);
    }

    //AJUSTES

    public void botonAjustesPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_fragmento_inicio_to_framento_ajustes);
    }

    public void botonVolverAjustesPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_framento_ajustes_to_fragmento_inicio);
    }

    public void botonCerrarSesionPulsado(View view){
        NavController controlador = Navigation.findNavController(view);
        controlador.navigate(R.id.action_framento_ajustes_to_pagina_login);
    }
}
