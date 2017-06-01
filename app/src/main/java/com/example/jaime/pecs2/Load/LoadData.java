package com.example.jaime.pecs2.Load;

import android.content.Context;
import android.widget.GridView;

import com.example.jaime.pecs2.PlayActivity;
import com.example.jaime.pecs2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anibal on 31-05-17.
 */

public class LoadData {

    public Integer longitud_categorias;
    public Integer longitud_pictogramas;
    public ArrayList<Categoria> categorias;
    public ArrayList<Resultado> resultados;

    //Variable para Patrón Singletón
    private static LoadData instance;

    public LoadData(){
        categorias = new ArrayList<Categoria>();
        init();
    }

    //Método para patrón Singletón
    public static LoadData getInstance() {
        if (instance == null) instance = new LoadData();
        return instance;
    }

    private void init() {

        load_resultados();

        load_categories();

        load_pictogramas();

    }

    private void load_resultados() {
        resultados = new ArrayList<Resultado>();
        Resultado resultado1 = new Resultado(1,R.id.respuesta1);
        Resultado resultado2 = new Resultado(2,R.id.respuesta2);
        Resultado resultado3 = new Resultado(3,R.id.respuesta3);
        Resultado resultado4 = new Resultado(4,R.id.respuesta4);
        Resultado resultado5 = new Resultado(5,R.id.respuesta5);

        resultados.add(resultado1);
        resultados.add(resultado2);
        resultados.add(resultado3);
        resultados.add(resultado4);
        resultados.add(resultado5);
    }

    private void load_categories() {

        longitud_categorias = categorias.size();
        Categoria categoria1 = new Categoria(longitud_categorias, "categoria1 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria2 = new Categoria(longitud_categorias, "categoria2 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria3 = new Categoria(longitud_categorias, "categoria3 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria4 = new Categoria(longitud_categorias, "categoria4 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria5 = new Categoria(longitud_categorias, "categoria5 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria6 = new Categoria(longitud_categorias, "categoria6 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria7 = new Categoria(longitud_categorias, "categoria7 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria8 = new Categoria(longitud_categorias, "categoria8 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria9 = new Categoria(longitud_categorias, "categoria9 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria10 = new Categoria(longitud_categorias, "categoria10 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria11 = new Categoria(longitud_categorias, "categoria11 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria12 = new Categoria(longitud_categorias, "categoria12 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria13 = new Categoria(longitud_categorias, "categoria13 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria14 = new Categoria(longitud_categorias, "categoria14 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria15 = new Categoria(longitud_categorias, "categoria15 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria16 = new Categoria(longitud_categorias, "categoria16 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria17 = new Categoria(longitud_categorias, "categoria17 " + String.valueOf(longitud_categorias), 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria18 = new Categoria(longitud_categorias, "categoria18 " + String.valueOf(longitud_categorias), 1);

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);
        categorias.add(categoria7);
        categorias.add(categoria8);
        categorias.add(categoria9);
        categorias.add(categoria10);
        categorias.add(categoria11);
        categorias.add(categoria12);
        categorias.add(categoria13);
        categorias.add(categoria14);
        categorias.add(categoria15);
        categorias.add(categoria16);
        categorias.add(categoria17);
        categorias.add(categoria18);
    }

    private void load_pictogramas(){

        //Correspondiente a los pictogramas de la categoria 1
        longitud_pictogramas = categorias.get(0).getPictogramas().size();

        //Categoría 1
        Pictograma pictograma1 = new Pictograma(longitud_pictogramas, 1, "Letra a", R.drawable.cat1_a, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma2 = new Pictograma(longitud_pictogramas, 1, "Letra b", R.drawable.cat1_b, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma3 = new Pictograma(longitud_pictogramas, 1, "Letra c", R.drawable.cat1_c, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma4 = new Pictograma(longitud_pictogramas, 1, "Letra d", R.drawable.cat1_d, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma5 = new Pictograma(longitud_pictogramas, 1, "letra e", R.drawable.cat1_e, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma6 = new Pictograma(longitud_pictogramas, 1, "Letra f", R.drawable.cat1_f, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma7 = new Pictograma(longitud_pictogramas, 1, "Letra g", R.drawable.cat1_g, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma8 = new Pictograma(longitud_pictogramas, 1, "Letra h", R.drawable.cat1_h, 1);
        longitud_pictogramas = longitud_pictogramas + 1;

        categorias.get(0).getPictogramas().add(pictograma1);
        categorias.get(0).getPictogramas().add(pictograma2);
        categorias.get(0).getPictogramas().add(pictograma3);
        categorias.get(0).getPictogramas().add(pictograma4);
        categorias.get(0).getPictogramas().add(pictograma5);
        categorias.get(0).getPictogramas().add(pictograma6);
        categorias.get(0).getPictogramas().add(pictograma7);
        categorias.get(0).getPictogramas().add(pictograma8);

        //Activamos la categoría 1 solamente
        categorias.get(0).activar();

        //Correspondiente a los pictogramas de la categoria 1
        longitud_pictogramas = categorias.get(1).getPictogramas().size();

        //Categoría 1
        pictograma1 = new Pictograma(longitud_pictogramas, 2, "Abotonar", R.drawable.cat2_abotonar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma2 = new Pictograma(longitud_pictogramas, 2, "Abrazar", R.drawable.cat2_abrazar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma3 = new Pictograma(longitud_pictogramas, 2, "Acalorar", R.drawable.cat2_acalorar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma4 = new Pictograma(longitud_pictogramas, 2, "Acalorar_1", R.drawable.cat2_acalorar1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma5 = new Pictograma(longitud_pictogramas, 2, "Acampar", R.drawable.cat2_acampar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma6 = new Pictograma(longitud_pictogramas, 2, "Acariciar", R.drawable.cat2_acariciar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma7 = new Pictograma(longitud_pictogramas, 2, "Acostarse en la cama", R.drawable.cat2_acostarse_en_la_cama, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        pictograma8 = new Pictograma(longitud_pictogramas, 2, "Adivinar", R.drawable.cat2_adivinar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;

        categorias.get(1).getPictogramas().add(pictograma1);
        categorias.get(1).getPictogramas().add(pictograma2);
        categorias.get(1).getPictogramas().add(pictograma3);
        categorias.get(1).getPictogramas().add(pictograma4);
        categorias.get(1).getPictogramas().add(pictograma5);
        categorias.get(1).getPictogramas().add(pictograma6);
        categorias.get(1).getPictogramas().add(pictograma7);
        categorias.get(1).getPictogramas().add(pictograma8);
    }

    public Integer getCategoriaActivada(){
        Integer longitud_categorias = this.categorias.size();
        Integer activado = 0;

        for(int i = 0; i < longitud_categorias; i ++){
            if(this.categorias.get(i).isActivo()){
                activado = i;
            }
        }

        return activado;
    }

    public Integer getSiguienteEspacio(){
        Integer longitud_resultados = this.resultados.size();
        Integer posicion = 0;

        for(int i=0; i < longitud_resultados; i ++){
            if(this.resultados.get(i).isActivado()){
                posicion = i;
                posicion ++;
            }
        }

        return posicion;
    }

    public Resultado getResultadoById(Integer id){
        Integer longitud_resultados = this.resultados.size();
        Resultado resultado = this.resultados.get(0);

        for(int i=0; i < longitud_resultados; i ++){
            if(this.resultados.get(i).getId() == id){
                resultado = this.resultados.get(i);
            }
        }
        return resultado;
    }

    public void activateCategoria(Integer id){
        Integer longitud_categorias = this.categorias.size();

        for(int i = 0; i < longitud_categorias; i ++){
            this.categorias.get(i).setActivo(false);
        }
        this.categorias.get(id).setActivo(true);
    }

}
