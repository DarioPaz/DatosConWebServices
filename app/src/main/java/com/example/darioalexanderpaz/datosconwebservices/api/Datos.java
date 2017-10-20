package com.example.darioalexanderpaz.datosconwebservices.api;

import com.example.darioalexanderpaz.datosconwebservices.modelos.Publicidad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Dario Alexander Paz on 19/10/2017.
 */

public interface Datos {


    @GET("kwda-5t5r.json")
    Call<List<Publicidad>> obtenerListaPublicidad();

}

