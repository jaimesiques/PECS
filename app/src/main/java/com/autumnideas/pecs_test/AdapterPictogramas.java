package com.autumnideas.pecs_test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


/**
 * Created by jaimearavena on 03-01-18.
 */

public class AdapterPictogramas extends RecyclerView.Adapter<AdapterPictogramas.MyViewHolder> {

    private Context mContext;
    private List<Pictograma> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre;
        public ImageView imagen;

        public MyViewHolder(View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.card_pictograma_nombre);
            imagen= (ImageView) view.findViewById(R.id.card_pictograma_imagen);
        }
    }


    public AdapterPictogramas(Context mContext, List<Pictograma> cardList) {
        this.mContext = mContext;
        this.albumList = cardList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_pictograma, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Pictograma card = albumList.get(position);

        holder.nombre.setText(albumList.get(position).getNombre());

        // loading album cover using Glide library
        Glide.with(mContext).load(albumList.get(position).getImagen()).into(holder.imagen);

    }
    @Override
    public int getItemCount() {
        return albumList.size();
    }
}