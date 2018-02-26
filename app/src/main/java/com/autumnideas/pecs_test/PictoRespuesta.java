package com.autumnideas.pecs_test;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jaimearavena on 15-12-17.
 */

public class PictoRespuesta {

    CardView layout_respuesta;
    ImageView imagen_respuesta;
    TextView texto_respuesta;
    Boolean estado;
    int image;

    public PictoRespuesta(CardView layout_respuesta, ImageView imagen_respuesta, TextView texto_respuesta, Boolean estado, int image) {
        this.layout_respuesta = layout_respuesta;
        this.imagen_respuesta = imagen_respuesta;
        this.texto_respuesta = texto_respuesta;
        this.estado = estado;
        this.image = image;
    }

    public CardView getLayout_respuesta() {
        return layout_respuesta;
    }

    public void setLayout_respuesta(CardView layout_respuesta) {
        this.layout_respuesta = layout_respuesta;
    }

    public ImageView getImagen_respuesta() {
        return imagen_respuesta;
    }

    public void setImagen_respuesta(ImageView imagen_respuesta) {
        this.imagen_respuesta = imagen_respuesta;
    }

    public TextView getTexto_respuesta() {
        return texto_respuesta;
    }

    public void setTexto_respuesta(TextView texto_respuesta) {
        this.texto_respuesta = texto_respuesta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
