package com.autumnideas.pecs_test;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jaimearavena on 26-02-18.
 */

public class Tirafrase {

    ImageView imagen;
    TextView nombre;
    Boolean status = false;


    public Tirafrase(ImageView imagen, TextView nombre, Boolean status) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.status = status;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
