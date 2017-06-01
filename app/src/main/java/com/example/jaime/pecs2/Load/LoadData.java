package com.example.jaime.pecs2.Load;

import android.content.Context;
import android.util.Log;
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
        Resultado resultado1 = new Resultado(0,R.id.respuesta1);
        Resultado resultado2 = new Resultado(1,R.id.respuesta2);
        Resultado resultado3 = new Resultado(2,R.id.respuesta3);
        Resultado resultado4 = new Resultado(3,R.id.respuesta4);
        Resultado resultado5 = new Resultado(4,R.id.respuesta5);

        resultados.add(resultado1);
        resultados.add(resultado2);
        resultados.add(resultado3);
        resultados.add(resultado4);
        resultados.add(resultado5);
    }

    private void load_categories() {

        longitud_categorias = categorias.size();
        Categoria categoria1 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_1, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria2 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_2, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria3 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_3, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria4 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_4, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria5 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_5, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria6 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_6, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria7 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_7, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria8 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_8, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria9 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_9, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria10 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_10, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria11 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_11, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria12 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_12, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria13 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_13, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria14 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_14, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria15 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_15, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria16 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_16, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria17 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_17, 1);
        longitud_categorias = longitud_categorias + 1;
        Categoria categoria18 = new Categoria(longitud_categorias, "categoria " + String.valueOf(longitud_categorias), R.id.categoria_18, 1);

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
        Pictograma pictograma9 = new Pictograma(longitud_pictogramas, 1, "Letra i", R.drawable.cat1_i, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma10 = new Pictograma(longitud_pictogramas, 1, "Letra j", R.drawable.cat1_j, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma11 = new Pictograma(longitud_pictogramas, 1, "Letra k", R.drawable.cat1_k, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma12 = new Pictograma(longitud_pictogramas, 1, "Letra l", R.drawable.cat1_l, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma13 = new Pictograma(longitud_pictogramas, 1, "Letra m", R.drawable.cat1_m, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma14 = new Pictograma(longitud_pictogramas, 1, "Letra n", R.drawable.cat1_n, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma15 = new Pictograma(longitud_pictogramas, 1, "Letra ñ", R.drawable.cat1_na, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma16 = new Pictograma(longitud_pictogramas, 1, "Letra o", R.drawable.cat1_o, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma17 = new Pictograma(longitud_pictogramas, 1, "Letra p", R.drawable.cat1_p, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma18 = new Pictograma(longitud_pictogramas, 1, "Letra q", R.drawable.cat1_q, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma19 = new Pictograma(longitud_pictogramas, 1, "Letra r", R.drawable.cat1_r, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma20 = new Pictograma(longitud_pictogramas, 1, "Letra s", R.drawable.cat1_s, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma21 = new Pictograma(longitud_pictogramas, 1, "Letra t", R.drawable.cat1_t, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma22 = new Pictograma(longitud_pictogramas, 1, "Letra u", R.drawable.cat1_u, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma23 = new Pictograma(longitud_pictogramas, 1, "Letra v", R.drawable.cat1_v, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma24 = new Pictograma(longitud_pictogramas, 1, "Letra w", R.drawable.cat1_w, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma25 = new Pictograma(longitud_pictogramas, 1, "Letra x", R.drawable.cat1_x, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma26 = new Pictograma(longitud_pictogramas, 1, "Letra y", R.drawable.cat1_y, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma27 = new Pictograma(longitud_pictogramas, 1, "Letra z", R.drawable.cat1_z, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma28 = new Pictograma(longitud_pictogramas, 1, "Letra A", R.drawable.cat1_a_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma29 = new Pictograma(longitud_pictogramas, 1, "Letra B", R.drawable.cat1_b_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma30 = new Pictograma(longitud_pictogramas, 1, "Letra C", R.drawable.cat1_c_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma31 = new Pictograma(longitud_pictogramas, 1, "Letra D", R.drawable.cat1_d_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma32 = new Pictograma(longitud_pictogramas, 1, "Letra E", R.drawable.cat1_e_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma33 = new Pictograma(longitud_pictogramas, 1, "Letra F", R.drawable.cat1_f_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma34 = new Pictograma(longitud_pictogramas, 1, "Letra G", R.drawable.cat1_g_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma35 = new Pictograma(longitud_pictogramas, 1, "Letra H", R.drawable.cat1_h_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma36 = new Pictograma(longitud_pictogramas, 1, "Letra I", R.drawable.cat1_i_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma37 = new Pictograma(longitud_pictogramas, 1, "Letra J", R.drawable.cat1_j_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma38 = new Pictograma(longitud_pictogramas, 1, "Letra K", R.drawable.cat1_k_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma39 = new Pictograma(longitud_pictogramas, 1, "Letra M", R.drawable.cat1_m_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma40 = new Pictograma(longitud_pictogramas, 1, "Letra N", R.drawable.cat1_n_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma41 = new Pictograma(longitud_pictogramas, 1, "Letra Ñ", R.drawable.cat1_na_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma42 = new Pictograma(longitud_pictogramas, 1, "Letra O", R.drawable.cat1_o_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma43 = new Pictograma(longitud_pictogramas, 1, "Letra P", R.drawable.cat1_p_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma44 = new Pictograma(longitud_pictogramas, 1, "Letra Q", R.drawable.cat1_q_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma45 = new Pictograma(longitud_pictogramas, 1, "Letra R", R.drawable.cat1_r_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma46 = new Pictograma(longitud_pictogramas, 1, "Letra S", R.drawable.cat1_s_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma47 = new Pictograma(longitud_pictogramas, 1, "Letra T", R.drawable.cat1_t_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma48 = new Pictograma(longitud_pictogramas, 1, "Letra U", R.drawable.cat1_u_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma49 = new Pictograma(longitud_pictogramas, 1, "Letra V", R.drawable.cat1_v_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma50 = new Pictograma(longitud_pictogramas, 1, "Letra W", R.drawable.cat1_w_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma51 = new Pictograma(longitud_pictogramas, 1, "Letra X", R.drawable.cat1_x_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma52 = new Pictograma(longitud_pictogramas, 1, "Letra Y", R.drawable.cat1_y_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma53 = new Pictograma(longitud_pictogramas, 1, "Letra Z", R.drawable.cat1_z_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma54 = new Pictograma(longitud_pictogramas, 1, "Signo !", R.drawable.cat1_zadmiracion, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma55 = new Pictograma(longitud_pictogramas, 1, "Signo ¡", R.drawable.cat1_zadmiracion1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma56 = new Pictograma(longitud_pictogramas, 1, "Signo @", R.drawable.cat1_zarroba, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma57 = new Pictograma(longitud_pictogramas, 1, "Signo *", R.drawable.cat1_zasterisco, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma58 = new Pictograma(longitud_pictogramas, 1, "Signo ,", R.drawable.cat1_zcoma, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma59 = new Pictograma(longitud_pictogramas, 1, "Signo comillas", R.drawable.cat1_zcomillas, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma60 = new Pictograma(longitud_pictogramas, 1, "Signo :", R.drawable.cat1_zdos_puntos, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma61 = new Pictograma(longitud_pictogramas, 1, "Signo -", R.drawable.cat1_zguion, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma62 = new Pictograma(longitud_pictogramas, 1, "Signo ¿", R.drawable.cat1_zinterrogacion, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma63 = new Pictograma(longitud_pictogramas, 1, "Signo ?", R.drawable.cat1_zinterrogacion1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma64 = new Pictograma(longitud_pictogramas, 1, "Signo (", R.drawable.cat1_zparentesis, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma65 = new Pictograma(longitud_pictogramas, 1, "Signo )", R.drawable.cat1_zparentesis1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma66 = new Pictograma(longitud_pictogramas, 1, "Signo .", R.drawable.cat1_zpunto, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma67 = new Pictograma(longitud_pictogramas, 1, "Signo ;", R.drawable.cat1_zpunto_y_coma, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma68 = new Pictograma(longitud_pictogramas, 1, "Signo +", R.drawable.cat1_zsigno, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma69 = new Pictograma(longitud_pictogramas, 1, "Signo #", R.drawable.cat1_zsigno_almohadilla, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma70 = new Pictograma(longitud_pictogramas, 1, "Signo barra", R.drawable.cat1_zsigno_barra, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma71 = new Pictograma(longitud_pictogramas, 1, "Signo barra1", R.drawable.cat1_zsigno_barra_1, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma72 = new Pictograma(longitud_pictogramas, 1, "Signo $", R.drawable.cat1_zsigno_dolar, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma73 = new Pictograma(longitud_pictogramas, 1, "Signo =", R.drawable.cat1_zsigno_igual, 1);
        longitud_pictogramas = longitud_pictogramas + 1;
        Pictograma pictograma74 = new Pictograma(longitud_pictogramas, 1, "Signo %", R.drawable.cat1_ztanto_por_ciento, 1);
        longitud_pictogramas = longitud_pictogramas + 1;

        categorias.get(0).getPictogramas().add(pictograma1);
        categorias.get(0).getPictogramas().add(pictograma2);
        categorias.get(0).getPictogramas().add(pictograma3);
        categorias.get(0).getPictogramas().add(pictograma4);
        categorias.get(0).getPictogramas().add(pictograma5);
        categorias.get(0).getPictogramas().add(pictograma6);
        categorias.get(0).getPictogramas().add(pictograma7);
        categorias.get(0).getPictogramas().add(pictograma8);
        categorias.get(0).getPictogramas().add(pictograma9);
        categorias.get(0).getPictogramas().add(pictograma10);
        categorias.get(0).getPictogramas().add(pictograma11);
        categorias.get(0).getPictogramas().add(pictograma12);
        categorias.get(0).getPictogramas().add(pictograma13);




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
        Integer contador = 0;
        boolean flag = false;

        while(!flag && contador <5){
            if(contador == 0){
                if(!LoadData.getInstance().resultados.get(contador).isActivado()){
                    flag = true;
                }else{
                    contador++;
                }
            }else{
                if(!LoadData.getInstance().resultados.get(contador).isActivado()){
                    flag = true;
                }else{
                    contador++;
                }
            }
        }
        return contador;
    }

    public Resultado getResultadoById(Integer id){
        Integer longitud_resultados = this.resultados.size();
        Resultado resultado = this.resultados.get(0);

        for(int i=0; i < longitud_resultados; i ++){
//            Log.v("id_resultados_array", String.valueOf(this.resultados.get(i).getUrl_resultado()));
//            Log.v("id_resultados_id", String.valueOf(id));
            if(this.resultados.get(i).getUrl_resultado().equals(id) ){
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
