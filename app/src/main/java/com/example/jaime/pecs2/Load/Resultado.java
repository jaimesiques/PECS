package com.example.jaime.pecs2.Load;

import com.example.jaime.pecs2.R;

/**
 * Created by anibal on 01-06-17.
 */

public class Resultado {

    private Integer id;
    private Integer url_resultado;
    private Integer url_imagen;
    private boolean activado;

    public Resultado(Integer id, Integer url_resultado){
        this.id = id;
        this.url_resultado = url_resultado;
        this.url_imagen = R.drawable.cuadrito;
        this.activado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrl_resultado() {
        return url_resultado;
    }

    public void setUrl_resultado(Integer url_resultado) {
        this.url_resultado = url_resultado;
    }

    public Integer getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(Integer url_imagen) {
        this.url_imagen = url_imagen;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

}
