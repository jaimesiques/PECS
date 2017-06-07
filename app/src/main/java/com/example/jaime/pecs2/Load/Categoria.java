package com.example.jaime.pecs2.Load;

import java.util.ArrayList;
import java.util.Arrays;

public class Categoria {

    private Integer id; //Id categoría
    private String nombre_categoria; //Nombre de la categoría
    private Integer url_categoria;
    private Integer estado; // Estado Categoría
    private ArrayList<Pictograma> pictogramas;
    private boolean activo;

    public Categoria(Integer id, String nombre_categoria, Integer url_categoria, Integer estado) {
        this.id = id;
        this.nombre_categoria = nombre_categoria;
        this.url_categoria = url_categoria;
        this.estado = estado;
        this.pictogramas = new ArrayList<Pictograma>();
        this.activo = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public ArrayList<Pictograma> getPictogramas() {
        return pictogramas;
    }

    public void setPictogramas(ArrayList<Pictograma> pictogramas) {
        this.pictogramas = pictogramas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer[] getUrls(){
        Integer[] items = new Integer[]{};
        Integer value;
        Integer longitud_pictogramas = this.getPictogramas().size();

        for( int  i = 0; i < longitud_pictogramas; i ++){
            value = this.getPictogramas().get(i).getUrl_pictograma();
            items = addElement(items, value);
        }
        return items;
    }

    static Integer[] addElement(Integer[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

    public void activar(){
        this.activo = true;
    }

    public void desactivar(){
        this.activo = false;
    }

    public Integer getUrl_categoria() {
        return url_categoria;
    }

    public void setUrl_categoria(Integer url_categoria) {
        this.url_categoria = url_categoria;
    }

}
