package com.example.darioalexanderpaz.datosconwebservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.darioalexanderpaz.datosconwebservices.api.Datos;
import com.example.darioalexanderpaz.datosconwebservices.modelos.Adaptador;
import com.example.darioalexanderpaz.datosconwebservices.modelos.Publicidad;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private RecyclerView view;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        view=(RecyclerView)findViewById(R.id.idRecV);
        view.setLayoutManager(new LinearLayoutManager(this));

        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").addConverterFactory(GsonConverterFactory.create()).build();
        obtenerDatos();
    }


    public void obtenerDatos() {

        Datos service = retrofit.create(Datos.class);
        final Call<List<Publicidad>> institucionCall = service.obtenerListaPublicidad();

        institucionCall.enqueue(new Callback<List<Publicidad>>() {
            @Override
            public void onResponse(Call<List<Publicidad>> call, Response<List<Publicidad>> response) {

                if (response.isSuccessful()) {
                    List institucion = response.body();
                    for (int i = 0; i < institucion.size(); i++) {
                        Publicidad ins = (Publicidad) institucion.get(i);
                        adaptador = new Adaptador(institucion);
                        view.setAdapter(adaptador);
                    }
                } else {

                    Toast notificacion = Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG);
                    notificacion.show();
                }

            }

            @Override
            public void onFailure(Call<List<Publicidad>> call, Throwable t) {

                Toast notificacion = Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG);
                notificacion.show();

            }
        });
    }

    public void acerca(View view) {
        Intent i = new Intent(this, MainActivityAcerca.class );
        startActivity(i);
    }

}
