package com.example.darioalexanderpaz.datosconwebservices.modelos;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.darioalexanderpaz.datosconwebservices.R;

import java.util.List;

/**
 * Created by Dario Alexander Paz on 19/10/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView direccion, propietario, anunciante, tipoElemento;
        private CardView card;


        public ViewHolder(View itemView) {
            super(itemView);

            direccion = (TextView) itemView.findViewById(R.id.direc);
            propietario = (TextView) itemView.findViewById(R.id.prop);
            anunciante = (TextView) itemView.findViewById(R.id.anun);
            tipoElemento = (TextView) itemView.findViewById(R.id.elemt);

            card=(CardView)itemView.findViewById(R.id.card);
        }
    }

    public List<Publicidad> lista;

    public Adaptador(List<Publicidad> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.direccion.setText(lista.get(position).getDireccion());
        holder.propietario.setText(lista.get(position).getPropietario());
        holder.anunciante.setText(lista.get(position).getAnunciante());
        holder.tipoElemento.setText(lista.get(position).getTipoElemento());

        //EFECTOS BounceIn FadeIn FlipInX RotateIn SlideInLeft ZoomIn
        YoYo.with(Techniques.DropOut).playOn(holder.card);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
