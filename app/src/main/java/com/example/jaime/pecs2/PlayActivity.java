package com.example.jaime.pecs2;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    private GridView gridView;
    private  GridviewAdapter gridViewAdapter;

    Integer[] cat1 = {
            R.drawable.cat1_abotonar,
            R.drawable.cat1_abrazar,
            R.drawable.cat1_acalorar,
            R.drawable.cat1_acalorar1,
            R.drawable.cat1_acampar,
            R.drawable.cat1_acariciar,
            R.drawable.cat1_acostarse_en_la_cama,
            R.drawable.cat1_adivinar,
            R.drawable.cat1_admirar,
            R.drawable.cat1_adornar,
            R.drawable.cat1_adornar1,
            R.drawable.cat1_adornar2,
            R.drawable.cat1_adornar3,
            R.drawable.cat1_adornar4,
            R.drawable.cat1_afirmar,
            R.drawable.cat1_agachar,
            R.drawable.cat1_agachar1,
            R.drawable.cat1_agachar2,
            R.drawable.cat1_agarrar,
            R.drawable.cat1_agarrar1,
            R.drawable.cat1_alborotar,
            R.drawable.cat1_alcanzar,
            R.drawable.cat1_alcanzar1,
            R.drawable.cat1_alegrar,
            R.drawable.cat1_alegrar1,
            R.drawable.cat1_alejar,
            R.drawable.cat1_alejar1,
            R.drawable.cat1_alejar2,
            R.drawable.cat1_alimentar,
            R.drawable.cat1_almorzar,
            R.drawable.cat1_almorzar1,
            R.drawable.cat1_almorzar2,
            R.drawable.cat1_apagar,
            R.drawable.cat1_apagar1,
            R.drawable.cat1_apagar_la_luz,
            R.drawable.cat1_apagar_la_television,
            R.drawable.cat1_apretar,
            R.drawable.cat1_aranar,
            R.drawable.cat1_aranar1,
            R.drawable.cat1_arreglar,
            R.drawable.cat1_arreglar1,
            R.drawable.cat1_aspirar,
            R.drawable.cat1_aspirar1,
            R.drawable.cat1_aterrizar,
            R.drawable.cat1_auxiliar,
            R.drawable.cat1_avergonzar,
            R.drawable.cat1_avergonzar1,
            R.drawable.cat1_ayudar,
            R.drawable.cat1_ayudar1,
            R.drawable.cat1_ayudar2,
            R.drawable.cat1_ayudar3,
            R.drawable.cat1_bajar_el_pantalon,
            R.drawable.cat1_banar,
            R.drawable.cat1_banar1,
            R.drawable.cat1_banar2,
            R.drawable.cat1_beber,
            R.drawable.cat1_beber1,
            R.drawable.cat1_beber2,
            R.drawable.cat1_casar,
            R.drawable.cat1_casarse,
            R.drawable.cat1_cocinar,
            R.drawable.cat1_consolar,
            R.drawable.cat1_cortar,
            R.drawable.cat1_cortar_el_pelo,
            R.drawable.cat1_cortar_el_pelo1,
            R.drawable.cat1_cortar_el_pelo2,
            R.drawable.cat1_cortar_pan,
            R.drawable.cat1_desear,
            R.drawable.cat1_despedirse,
            R.drawable.cat1_echar_jabon,
            R.drawable.cat1_encender,
            R.drawable.cat1_encender1,
            R.drawable.cat1_encender_la_luz,
            R.drawable.cat1_encender_la_television,
            R.drawable.cat1_enchufar,
            R.drawable.cat1_enjabonar,
            R.drawable.cat1_enjabonar1,
            R.drawable.cat1_enjabonar2,
            R.drawable.cat1_golpear_en_la_cabeza,
            R.drawable.cat1_hablar_por_telefono,
            R.drawable.cat1_hablar_por_telefono1,
            R.drawable.cat1_hacer_la_cama,
            R.drawable.cat1_jugar,
            R.drawable.cat1_jugar_a_la_ronda,
            R.drawable.cat1_jugar_a_la_ronda1,
            R.drawable.cat1_jugar_basquetbol,
            R.drawable.cat1_jugar_beisbol,
            R.drawable.cat1_jugar_billar,
            R.drawable.cat1_jugar_bolos,
            R.drawable.cat1_jugar_con_agua,
            R.drawable.cat1_jugar_con_el_computador,
            R.drawable.cat1_jugar_con_el_tablet,
            R.drawable.cat1_jugar_futbol,
            R.drawable.cat1_jugar_golf,
            R.drawable.cat1_jugar_handbol,
            R.drawable.cat1_jugar_hockey,
            R.drawable.cat1_jugar_rugby,
            R.drawable.cat1_jugar_tenis,
            R.drawable.cat1_jugar_voleibol,
            R.drawable.cat1_jugar_waterpolo,
            R.drawable.cat1_lavar_el_pelo,
            R.drawable.cat1_lavar_el_pelo1,
            R.drawable.cat1_lavar_el_pelo2,
            R.drawable.cat1_lavar_los_platos,
            R.drawable.cat1_levantarse_de_la_cama,
            R.drawable.cat1_limpiar_los_lentes,
            R.drawable.cat1_marcar_numero_telefonico,
            R.drawable.cat1_mirarse_al_espejo,
            R.drawable.cat1_navegar,
            R.drawable.cat1_pasear_al_perro,
            R.drawable.cat1_pasear_al_perro1,
            R.drawable.cat1_pasear_al_perro2,
            R.drawable.cat1_pelear,
            R.drawable.cat1_pelear,
            R.drawable.cat1_pesar,
            R.drawable.cat1_ponerse_la_chaqueta,
            R.drawable.cat1_rallar_queso,
            R.drawable.cat1_rascar,
            R.drawable.cat1_recolectar,
            R.drawable.cat1_regalar,
            R.drawable.cat1_regalar1,
            R.drawable.cat1_regalar2,
            R.drawable.cat1_remangarse,
            R.drawable.cat1_remar,
            R.drawable.cat1_remar1,
            R.drawable.cat1_restar,
            R.drawable.cat1_robar,
            R.drawable.cat1_sacarse_la_chaqueta,
            R.drawable.cat1_salpicar,
            R.drawable.cat1_saltar,
            R.drawable.cat1_saltar1,
            R.drawable.cat1_saltar_la_cuerda,
            R.drawable.cat1_saludar,
            R.drawable.cat1_saludar1,
            R.drawable.cat1_saludar2,
            R.drawable.cat1_saludar3,
            R.drawable.cat1_secar_el_pelo,
            R.drawable.cat1_secar_el_pelo2,
            R.drawable.cat1_secar_el_pelo3,
            R.drawable.cat1_secar_los_platos,
            R.drawable.cat1_servir,
            R.drawable.cat1_sonarse,
            R.drawable.cat1_sonarse1,
            R.drawable.cat1_sonarse2,
            R.drawable.cat1_subirse_el_pantalon,
            R.drawable.cat1_tachar,
            R.drawable.cat1_taladrar,
            R.drawable.cat1_talar,
            R.drawable.cat1_tocar_el_piano,
            R.drawable.cat1_tocar_la_guitarra,
            R.drawable.cat1_tomar_la_toalla,
            R.drawable.cat1_vivir,
            R.drawable.cat1_volar,
    };

    Integer[] cat2 = {
            R.drawable.cat1_rallar_queso,
            R.drawable.cat1_rascar,
            R.drawable.cat1_recolectar,
            R.drawable.cat1_regalar,
            R.drawable.cat1_regalar1,
            R.drawable.cat1_regalar2,
            R.drawable.cat1_remangarse,
            R.drawable.cat1_remar,
            R.drawable.cat1_remar1,
            R.drawable.cat1_restar,
            R.drawable.cat1_robar,
            R.drawable.cat1_sacarse_la_chaqueta,
            R.drawable.cat1_salpicar,
            R.drawable.cat1_saltar,
            R.drawable.cat1_saltar1,
            R.drawable.cat1_saltar_la_cuerda,
            R.drawable.cat1_saludar,
            R.drawable.cat1_saludar1,
            R.drawable.cat1_saludar2,
            R.drawable.cat1_saludar3,
            R.drawable.cat1_secar_el_pelo,
            R.drawable.cat1_secar_el_pelo2,
            R.drawable.cat1_secar_el_pelo3,
            R.drawable.cat1_secar_los_platos,
            R.drawable.cat1_servir,
            R.drawable.cat1_sonarse,
            R.drawable.cat1_sonarse1,
            R.drawable.cat1_sonarse2,
            R.drawable.cat1_subirse_el_pantalon,
            R.drawable.cat1_tachar,
            R.drawable.cat1_taladrar,
            R.drawable.cat1_talar,
            R.drawable.cat1_tocar_el_piano,
            R.drawable.cat1_tocar_la_guitarra,
            R.drawable.cat1_tomar_la_toalla,
            R.drawable.cat1_vivir,
            R.drawable.cat1_volar,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/chalkboard.ttf");

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
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, cat2);
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

    }
}
