package com.example.jaime.pecs2;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayActivity extends AppCompatActivity {

    private GridView gridView;
    private GridviewAdapter gridViewAdapter;

    Integer[] cat1 = {
            R.drawable.cat1_1alfabeto,
            R.drawable.cat1_a,
            R.drawable.cat1_a_1,
            R.drawable.cat1_b,
            R.drawable.cat1_b_1,
            R.drawable.cat1_c,
            R.drawable.cat1_c_1,
            R.drawable.cat1_d,
            R.drawable.cat1_d_1,
            R.drawable.cat1_e,
            R.drawable.cat1_e_1,
            R.drawable.cat1_f,
            R.drawable.cat1_f_1,
            R.drawable.cat1_g,
            R.drawable.cat1_g_1,
            R.drawable.cat1_h,
            R.drawable.cat1_h_1,
            R.drawable.cat1_i,
            R.drawable.cat1_i_1,
            R.drawable.cat1_j,
            R.drawable.cat1_j_1,
            R.drawable.cat1_k,
            R.drawable.cat1_k_1,
            R.drawable.cat1_l,
            R.drawable.cat1_l_1,
            R.drawable.cat1_m,
            R.drawable.cat1_m_1,
            R.drawable.cat1_n,
            R.drawable.cat1_n_1,
            R.drawable.cat1_na,
            R.drawable.cat1_na_1,
            R.drawable.cat1_o,
            R.drawable.cat1_o_1,
            R.drawable.cat1_p,
            R.drawable.cat1_p_1,
            R.drawable.cat1_q,
            R.drawable.cat1_q_1,
            R.drawable.cat1_r,
            R.drawable.cat1_r_1,
            R.drawable.cat1_s,
            R.drawable.cat1_s_1,
            R.drawable.cat1_t,
            R.drawable.cat1_t_1,
            R.drawable.cat1_u,
            R.drawable.cat1_u_1,
            R.drawable.cat1_v,
            R.drawable.cat1_v_1,
            R.drawable.cat1_w,
            R.drawable.cat1_w_1,
            R.drawable.cat1_x,
            R.drawable.cat1_x_1,
            R.drawable.cat1_y,
            R.drawable.cat1_y_1,
            R.drawable.cat1_z,
            R.drawable.cat1_z_1,
            R.drawable.cat1_zadmiracion,
            R.drawable.cat1_zadmiracion1,
            R.drawable.cat1_zarroba,
            R.drawable.cat1_zasterisco,
            R.drawable.cat1_zcoma,
            R.drawable.cat1_zcomillas,
            R.drawable.cat1_zdos_puntos,
            R.drawable.cat1_zguion,
            R.drawable.cat1_zinterrogacion,
            R.drawable.cat1_zinterrogacion1,
            R.drawable.cat1_zparentesis,
            R.drawable.cat1_zparentesis1,
            R.drawable.cat1_zpunto,
            R.drawable.cat1_zpunto_y_coma,
            R.drawable.cat1_zsigno,
            R.drawable.cat1_zsigno_almohadilla,
            R.drawable.cat1_zsigno_barra,
            R.drawable.cat1_zsigno_barra_1,
            R.drawable.cat1_zsigno_dolar,
            R.drawable.cat1_zsigno_igual,
            R.drawable.cat1_ztanto_por_ciento,
    };

    Integer[] cat2 = {
            R.drawable.cat2_abotonar,
            R.drawable.cat2_abrazar,
            R.drawable.cat2_acalorar,
            R.drawable.cat2_acalorar1,
            R.drawable.cat2_acampar,
            R.drawable.cat2_acariciar,
            R.drawable.cat2_acostarse_en_la_cama,
            R.drawable.cat2_adivinar,
            R.drawable.cat2_admirar,
            R.drawable.cat2_adornar,
            R.drawable.cat2_adornar1,
            R.drawable.cat2_adornar2,
            R.drawable.cat2_adornar3,
            R.drawable.cat2_adornar4,
            R.drawable.cat2_afirmar,
            R.drawable.cat2_agachar,
            R.drawable.cat2_agachar1,
            R.drawable.cat2_agachar2,
            R.drawable.cat2_agarrar,
            R.drawable.cat2_agarrar1,
            R.drawable.cat2_alborotar,
            R.drawable.cat2_alcanzar,
            R.drawable.cat2_alcanzar1,
            R.drawable.cat2_alegrar,
            R.drawable.cat2_alegrar1,
            R.drawable.cat2_alejar,
            R.drawable.cat2_alejar1,
            R.drawable.cat2_alejar2,
            R.drawable.cat2_alimentar,
            R.drawable.cat2_almorzar,
            R.drawable.cat2_almorzar1,
            R.drawable.cat2_almorzar2,
            R.drawable.cat2_apagar,
            R.drawable.cat2_apagar1,
            R.drawable.cat2_apagar_la_luz,
            R.drawable.cat2_apagar_la_television,
            R.drawable.cat2_apretar,
            R.drawable.cat2_aranar,
            R.drawable.cat2_aranar1,
            R.drawable.cat2_arreglar,
            R.drawable.cat2_arreglar1,
            R.drawable.cat2_aspirar,
            R.drawable.cat2_aspirar1,
            R.drawable.cat2_aterrizar,
            R.drawable.cat2_auxiliar,
            R.drawable.cat2_avergonzar,
            R.drawable.cat2_avergonzar1,
            R.drawable.cat2_ayudar,
            R.drawable.cat2_ayudar1,
            R.drawable.cat2_ayudar2,
            R.drawable.cat2_ayudar3,
            R.drawable.cat2_bajar_el_pantalon,
            R.drawable.cat2_banar,
            R.drawable.cat2_banar1,
            R.drawable.cat2_banar2,
            R.drawable.cat2_beber,
            R.drawable.cat2_beber1,
            R.drawable.cat2_beber2,
            R.drawable.cat2_casar,
            R.drawable.cat2_casarse,
            R.drawable.cat2_cocinar,
            R.drawable.cat2_consolar,
            R.drawable.cat2_cortar,
            R.drawable.cat2_cortar_el_pelo,
            R.drawable.cat2_cortar_el_pelo1,
            R.drawable.cat2_cortar_el_pelo2,
            R.drawable.cat2_cortar_pan,
            R.drawable.cat2_desear,
            R.drawable.cat2_despedirse,
            R.drawable.cat2_echar_jabon,
            R.drawable.cat2_encender,
            R.drawable.cat2_encender1,
            R.drawable.cat2_encender_la_luz,
            R.drawable.cat2_encender_la_television,
            R.drawable.cat2_enchufar,
            R.drawable.cat2_enjabonar,
            R.drawable.cat2_enjabonar1,
            R.drawable.cat2_enjabonar2,
            R.drawable.cat2_golpear_en_la_cabeza,
            R.drawable.cat2_hablar_por_telefono,
            R.drawable.cat2_hablar_por_telefono1,
            R.drawable.cat2_hacer_la_cama,
            R.drawable.cat2_jugar,
            R.drawable.cat2_jugar_a_la_ronda,
            R.drawable.cat2_jugar_a_la_ronda1,
            R.drawable.cat2_jugar_basquetbol,
            R.drawable.cat2_jugar_beisbol,
            R.drawable.cat2_jugar_billar,
            R.drawable.cat2_jugar_bolos,
            R.drawable.cat2_jugar_con_agua,
            R.drawable.cat2_jugar_con_el_computador,
            R.drawable.cat2_jugar_con_el_tablet,
            R.drawable.cat2_jugar_futbol,
            R.drawable.cat2_jugar_golf,
            R.drawable.cat2_jugar_handbol,
            R.drawable.cat2_jugar_hockey,
            R.drawable.cat2_jugar_rugby,
            R.drawable.cat2_jugar_tenis,
            R.drawable.cat2_jugar_voleibol,
            R.drawable.cat2_jugar_waterpolo,
            R.drawable.cat2_lavar_el_pelo,
            R.drawable.cat2_lavar_el_pelo1,
            R.drawable.cat2_lavar_el_pelo2,
            R.drawable.cat2_lavar_los_platos,
            R.drawable.cat2_levantarse_de_la_cama,
            R.drawable.cat2_limpiar_los_lentes,
            R.drawable.cat2_marcar_numero_telefonico,
            R.drawable.cat2_mirarse_al_espejo,
            R.drawable.cat2_navegar,
            R.drawable.cat2_pasear_al_perro,
            R.drawable.cat2_pasear_al_perro1,
            R.drawable.cat2_pasear_al_perro2,
            R.drawable.cat2_pelear,
            R.drawable.cat2_pelear,
            R.drawable.cat2_pesar,
            R.drawable.cat2_ponerse_la_chaqueta,
            R.drawable.cat2_rallar_queso,
            R.drawable.cat2_rascar,
            R.drawable.cat2_recolectar,
            R.drawable.cat2_regalar,
            R.drawable.cat2_regalar1,
            R.drawable.cat2_regalar2,
            R.drawable.cat2_remangarse,
            R.drawable.cat2_remar,
            R.drawable.cat2_remar1,
            R.drawable.cat2_restar,
            R.drawable.cat2_robar,
            R.drawable.cat2_sacarse_la_chaqueta,
            R.drawable.cat2_salpicar,
            R.drawable.cat2_saltar,
            R.drawable.cat2_saltar1,
            R.drawable.cat2_saltar_la_cuerda,
            R.drawable.cat2_saludar,
            R.drawable.cat2_saludar1,
            R.drawable.cat2_saludar2,
            R.drawable.cat2_saludar3,
            R.drawable.cat2_secar_el_pelo,
            R.drawable.cat2_secar_el_pelo2,
            R.drawable.cat2_secar_el_pelo3,
            R.drawable.cat2_secar_los_platos,
            R.drawable.cat2_servir,
            R.drawable.cat2_sonarse,
            R.drawable.cat2_sonarse1,
            R.drawable.cat2_sonarse2,
            R.drawable.cat2_subirse_el_pantalon,
            R.drawable.cat2_tachar,
            R.drawable.cat2_taladrar,
            R.drawable.cat2_talar,
            R.drawable.cat2_tocar_el_piano,
            R.drawable.cat2_tocar_la_guitarra,
            R.drawable.cat2_tomar_la_toalla,
            R.drawable.cat2_vivir,
            R.drawable.cat2_volar,
    };

    Integer[] cat3 = {
            R.drawable.cat3_aceite,
            R.drawable.cat3_aceite_de_oliva,
            R.drawable.cat3_aceituna_negra,
            R.drawable.cat3_aceituna_verde,
            R.drawable.cat3_acelga,
            R.drawable.cat3_ajo,
            R.drawable.cat3_albondigas,
            R.drawable.cat3_alcachofa,
            R.drawable.cat3_alcohol,
            R.drawable.cat3_alimentos,
            R.drawable.cat3_almeja,
            R.drawable.cat3_apio,
            R.drawable.cat3_arandanos,
            R.drawable.cat3_azucar,
            R.drawable.cat3_azucar_morena,
            R.drawable.cat3_bebida,
            R.drawable.cat3_bebida1,
            R.drawable.cat3_bebida_en_lata,
            R.drawable.cat3_berries,
            R.drawable.cat3_betarraga,
            R.drawable.cat3_brocoli,
            R.drawable.cat3_cabritas,
            R.drawable.cat3_cafe,
            R.drawable.cat3_cebollin,
            R.drawable.cat3_cerdo,
            R.drawable.cat3_coliflor,
            R.drawable.cat3_comida_de_gato,
            R.drawable.cat3_comida_de_perro,
            R.drawable.cat3_conejo,
            R.drawable.cat3_cubo_de_hielo,
            R.drawable.cat3_durazno,
            R.drawable.cat3_ensalada,
            R.drawable.cat3_espinaca,
            R.drawable.cat3_frutilla,
            R.drawable.cat3_guinda,
            R.drawable.cat3_guindas,
            R.drawable.cat3_hamburguesa_papas_fritas,
            R.drawable.cat3_higos,
            R.drawable.cat3_hongo,
            R.drawable.cat3_huevo_frito_papas_fritas,
            R.drawable.cat3_jamon,
            R.drawable.cat3_jugo_de_durazno,
            R.drawable.cat3_jugo_de_manzana,
            R.drawable.cat3_jugo_de_naranja,
            R.drawable.cat3_jugo_de_pina,
            R.drawable.cat3_jugo_de_tomate,
            R.drawable.cat3_ketchup,
            R.drawable.cat3_kiwi,
            R.drawable.cat3_lechuga,
            R.drawable.cat3_limon,
            R.drawable.cat3_limon1,
            R.drawable.cat3_limonada,
            R.drawable.cat3_mango,
            R.drawable.cat3_manzana,
            R.drawable.cat3_manzana1,
            R.drawable.cat3_manzana2,
            R.drawable.cat3_maracuya,
            R.drawable.cat3_mayonesa,
            R.drawable.cat3_melon,
            R.drawable.cat3_naranja,
            R.drawable.cat3_naranja1,
            R.drawable.cat3_naranjada,
            R.drawable.cat3_pan,
            R.drawable.cat3_pan_de_molde,
            R.drawable.cat3_pan_tostado,
            R.drawable.cat3_papa,
            R.drawable.cat3_papas_fritas,
            R.drawable.cat3_papas_fritas1,
            R.drawable.cat3_pera,
            R.drawable.cat3_pimenton_rojo,
            R.drawable.cat3_pimenton_verde,
            R.drawable.cat3_pimienta,
            R.drawable.cat3_pina,
            R.drawable.cat3_platano,
            R.drawable.cat3_pollo_papas_fritas,
            R.drawable.cat3_queso,
            R.drawable.cat3_queso_rallado,
            R.drawable.cat3_rabanos,
            R.drawable.cat3_repollo_brusela,
            R.drawable.cat3_sal,
            R.drawable.cat3_salchicha,
            R.drawable.cat3_salmon,
            R.drawable.cat3_sandia,
            R.drawable.cat3_sandwich,
            R.drawable.cat3_sopa,
            R.drawable.cat3_sopa_de_carne,
            R.drawable.cat3_sopa_de_mariscos,
            R.drawable.cat3_sopa_de_pescado,
            R.drawable.cat3_sopa_de_pollo,
            R.drawable.cat3_tallarines,
            R.drawable.cat3_tocino,
            R.drawable.cat3_uvas,
            R.drawable.cat3_yogurth,
            R.drawable.cat3_zanahoria,
    };

    Integer[] cat4 = {



    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --------------------------------------
        //INICIO CATEGORIAS
        // --------------------------------------

        gridView = (GridView) findViewById(R.id.grid_pictogramas);
        gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat1);

        gridView.setAdapter(gridViewAdapter);

        ImageView image1 = (ImageView) findViewById(R.id.categoria_1);
        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat1);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image2 = (ImageView) findViewById(R.id.categoria_2);
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image3 = (ImageView) findViewById(R.id.categoria_3);
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat3);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image4 = (ImageView) findViewById(R.id.categoria_4);
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image5 = (ImageView) findViewById(R.id.categoria_5);
        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image6 = (ImageView) findViewById(R.id.categoria_6);
        image6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });


        ImageView image7 = (ImageView) findViewById(R.id.categoria_7);
        image7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });


        ImageView image8 = (ImageView) findViewById(R.id.categoria_8);
        image8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
                gridView.setAdapter(gridViewAdapter);
            }

        });

        // --------------------------------------
        // FIN CATEGORIAS
        // --------------------------------------

        final GridView gv = (GridView) findViewById(R.id.grid_respuestas);

        Integer[] resp = {
        };

        // Populate a List from Array elements
        final List<Integer> plantsList = new ArrayList<Integer>(Arrays.asList(resp));

        // Create a new ArrayAdapter
        final ArrayAdapter<Integer> gridViewArrayAdapter = new ArrayAdapter<Integer>
                (this,android.R.layout.simple_list_item_1, plantsList);

        // Data bind GridView with ArrayAdapter (String Array elements)
        gv.setAdapter(gridViewArrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(PlayActivity.this, "" + id, Toast.LENGTH_SHORT).show();
                plantsList.add(R.drawable.cat2_abotonar);
                gridView.setAdapter(gridViewAdapter);
                gv.setAdapter(gridViewAdapter);
            }
        });
    }
}
