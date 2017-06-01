package com.example.jaime.pecs2.Load;

/**
 * Created by anibal on 31-05-17.
 */

public class Pictograma {

    private Integer id; // ID pictograma
    private Integer id_categoria; // ID categoría
    private String nombre_pictograma; // Nombre pictograma
    private Integer url_pictograma; // Url pictograma
    private Integer estado; // Estado pictograma

    public Pictograma(Integer id, Integer id_categoria, String nombre_pictograma, int url_pictograma, int estado) {
        this.id = id;
        this.id_categoria = id_categoria;
        this.nombre_pictograma = nombre_pictograma;
        this.url_pictograma = url_pictograma;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_pictograma() {
        return nombre_pictograma;
    }

    public void setNombre_pictograma(String nombre_pictograma) {
        this.nombre_pictograma = nombre_pictograma;
    }

    public Integer getUrl_pictograma() {
        return url_pictograma;
    }

    public void setUrl_pictograma(Integer url_pictograma) {
        this.url_pictograma = url_pictograma;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

 }
