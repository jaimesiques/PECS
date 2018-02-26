package com.autumnideas.pecs_test;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterPictogramas adapter;

    private ArrayList<Pictograma> pictoList_pictos;
    private ArrayList<PictoRespuesta> pictoRespuestas_layouts;

    private ArrayList<PictoRespuesta> respuestaTirafrase;

    private Pictograma pictograma;
    private Pictograma pictograma_resultados;
    private PictoRespuesta pictoRespuesta;

    private ImageView delete_answers_button, tirafrase_button;

    private ArrayList<Pictograma> categoria0;
    private ArrayList<Pictograma> categoria1;
    private ArrayList<Pictograma> categoria2;
    private ArrayList<Pictograma> categoria3;
    private ArrayList<Pictograma> categoria4;
    private ArrayList<Pictograma> categoria5;
    private ArrayList<Pictograma> categoria6;
    private ArrayList<Pictograma> categoria7;
    private ArrayList<Pictograma> categoria8;
    private ArrayList<Pictograma> categoria9;
    private ArrayList<Pictograma> categoria10;
    private ArrayList<Pictograma> categoria11;
    private ArrayList<Pictograma> categoria12;
    private ArrayList<Pictograma> categoria13;
    private ArrayList<Pictograma> categoria14;
    private ArrayList<Pictograma> categoria15;
    private ArrayList<Pictograma> categoria16;
    private ArrayList<Pictograma> categoria17;
    private ArrayList<Pictograma> categoria18;
    private ArrayList<Pictograma> categoria19;
    private ArrayList<Pictograma> categoria20;
    private ArrayList<Pictograma> categoria21;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Instancio Elementos de Respuestas
        ConstraintLayout LL_respuesta1 = findViewById(R.id.LL_respuesta1);
        final CardView card_respuesta1 = findViewById(R.id.CV_respuesta1);
        final ImageView picto_respuesta1 = findViewById(R.id.picto_respuesta1);
        final TextView texto_respuesta1 = findViewById(R.id.texto_respuesta1);

        ConstraintLayout LL_respuesta2 = findViewById(R.id.LL_respuesta2);
        final CardView card_respuesta2 = findViewById(R.id.CV_respuesta2);
        final ImageView picto_respuesta2 = findViewById(R.id.picto_respuesta2);
        final TextView texto_respuesta2 = findViewById(R.id.texto_respuesta2);

        ConstraintLayout LL_respuesta3 = findViewById(R.id.LL_respuesta3);
        final CardView card_respuesta3 = findViewById(R.id.CV_respuesta3);
        final ImageView picto_respuesta3 = findViewById(R.id.picto_respuesta3);
        final TextView texto_respuesta3 = findViewById(R.id.texto_respuesta3);

        ConstraintLayout LL_respuesta4 = findViewById(R.id.LL_respuesta4);
        final CardView card_respuesta4 = findViewById(R.id.CV_respuesta4);
        final ImageView picto_respuesta4 = findViewById(R.id.picto_respuesta4);
        final TextView texto_respuesta4 = findViewById(R.id.texto_respuesta4);

        ConstraintLayout LL_respuesta5 = findViewById(R.id.LL_respuesta5);
        final CardView card_respuesta5 = findViewById(R.id.CV_respuesta5);
        final ImageView picto_respuesta5 = findViewById(R.id.picto_respuesta5);
        final TextView texto_respuesta5 = findViewById(R.id.texto_respuesta5);

        ConstraintLayout LL_respuesta6 = findViewById(R.id.LL_respuesta6);
        final CardView card_respuesta6 = findViewById(R.id.CV_respuesta6);
        final ImageView picto_respuesta6 = findViewById(R.id.picto_respuesta6);
        final TextView texto_respuesta6 = findViewById(R.id.texto_respuesta6);
        //endregion

        //region Instancio ArrayLists de seleccion
        pictoList_pictos = new ArrayList<Pictograma>();
        pictoRespuestas_layouts = new ArrayList<PictoRespuesta>();
        respuestaTirafrase = new ArrayList<PictoRespuesta>();

        //endregion

        //region Instancio categorías
        categoria0 = new ArrayList<Pictograma>(); // 0- FAVORITOS
        categoria1 = new ArrayList<Pictograma>(); // 1- ABECEDARIO
        categoria2 = new ArrayList<Pictograma>(); // 2- ACCIONES
        categoria3 = new ArrayList<Pictograma>(); // 3- ALIMENTOS
        categoria4 = new ArrayList<Pictograma>(); // 4- ANIMALES
        categoria5 = new ArrayList<Pictograma>(); // 5- CASA
        categoria6 = new ArrayList<Pictograma>(); // 6- COLORES
        categoria7 = new ArrayList<Pictograma>(); // 7- CUERPO
        categoria8 = new ArrayList<Pictograma>(); // 8- DEPORTES
        categoria9 = new ArrayList<Pictograma>(); // 9- FORMAS
        categoria10 = new ArrayList<Pictograma>(); // 10- INSTRUMENTOS
        categoria11 = new ArrayList<Pictograma>(); // 11- JUGUETES
        categoria12 = new ArrayList<Pictograma>(); // 12- LUGARES
        categoria13 = new ArrayList<Pictograma>(); // 13- NATURALEZA
        categoria14 = new ArrayList<Pictograma>(); // 14- NUMEROS
        categoria15 = new ArrayList<Pictograma>(); // 15- OBJETOS
        categoria16 = new ArrayList<Pictograma>(); // 16- PAISES
        categoria17 = new ArrayList<Pictograma>(); // 17- PERSONAS
        categoria18 = new ArrayList<Pictograma>(); // 18- VESTIMENTA
        categoria19 = new ArrayList<Pictograma>(); // 19- SENTIMIENTOS
        categoria20 = new ArrayList<Pictograma>(); // 20- SEÑALETICA
        categoria21 = new ArrayList<Pictograma>(); // 21- VEHICULOS
        //endregion

        //region Instancio los layouts de RESPUESTAS
        pictoRespuesta = new PictoRespuesta(card_respuesta1, picto_respuesta1, texto_respuesta1, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        pictoRespuesta = new PictoRespuesta(card_respuesta2, picto_respuesta2, texto_respuesta2, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        pictoRespuesta = new PictoRespuesta(card_respuesta3, picto_respuesta3, texto_respuesta3, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        pictoRespuesta = new PictoRespuesta(card_respuesta4, picto_respuesta4, texto_respuesta4, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        pictoRespuesta = new PictoRespuesta(card_respuesta5, picto_respuesta5, texto_respuesta5, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        pictoRespuesta = new PictoRespuesta(card_respuesta6, picto_respuesta6, texto_respuesta6, false, 0);
        pictoRespuestas_layouts.add(pictoRespuesta);
        //endregion

        //region RecyclerView

        recyclerView = findViewById(R.id.recycler_pictogramas);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 5);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(5, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new AdapterPictogramas(MainActivity.this,categoria2);
        recyclerView.setAdapter(adapter);
        pictoList_pictos = categoria2;

        //endregion

        //region click RecyclerView
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(MainActivity.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        //Acción click corto
                        pictograma = new Pictograma(pictoList_pictos.get(position).getId(), pictoList_pictos.get(position).getNombre(), pictoList_pictos.get(position).getImagen());
                        fillAnswers(pictoRespuestas_layouts, pictograma);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        //Acción click largo
                    }
                })
        );
        //endregion

        //region Carga de CATEGORIAS
        cargarPictogramas_categoria0(categoria0);
        cargarPictogramas_categoria1(categoria1);
        cargarPictogramas_categoria2(categoria2);
        cargarPictogramas_categoria3(categoria3);
        cargarPictogramas_categoria4(categoria4);
        cargarPictogramas_categoria5(categoria5);
        cargarPictogramas_categoria6(categoria6);
        cargarPictogramas_categoria7(categoria7);
        cargarPictogramas_categoria8(categoria8);
        cargarPictogramas_categoria9(categoria9);
        cargarPictogramas_categoria10(categoria10);
        cargarPictogramas_categoria11(categoria11);
        cargarPictogramas_categoria12(categoria12);
        cargarPictogramas_categoria13(categoria13);
        cargarPictogramas_categoria14(categoria14);
        cargarPictogramas_categoria15(categoria15);
        cargarPictogramas_categoria16(categoria16);
        cargarPictogramas_categoria17(categoria17);
        cargarPictogramas_categoria18(categoria18);
        cargarPictogramas_categoria19(categoria19);
        cargarPictogramas_categoria20(categoria20);
        cargarPictogramas_categoria21(categoria21);
        //endregion

        //region Boton eliminar respuestas

        delete_answers_button = findViewById(R.id.delete_answers_button);

        delete_answers_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete_answers(picto_respuesta1, picto_respuesta2, picto_respuesta3, picto_respuesta4, picto_respuesta5, picto_respuesta6, texto_respuesta1, texto_respuesta2, texto_respuesta3, texto_respuesta4, texto_respuesta5, texto_respuesta6);
            }
        });

        //endregion

        //region Boton Tirafrase

        tirafrase_button = findViewById(R.id.tirafrase_button);
        tirafrase_button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                armarTirafrase();

            }
        });

        //endregion

        //region Acciones Layouts
        picto_respuesta1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta1.setImageResource(0);
                texto_respuesta1.setText("");
                pictoRespuestas_layouts.get(0).setEstado(false);

            }
        });

        picto_respuesta2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta2.setImageResource(0);
                texto_respuesta2.setText("");
                pictoRespuestas_layouts.get(1).setEstado(false);
            }
        });

        picto_respuesta3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta3.setImageResource(0);
                texto_respuesta3.setText("");
                pictoRespuestas_layouts.get(2).setEstado(false);

            }
        });
        picto_respuesta4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta4.setImageResource(0);
                texto_respuesta4.setText("");
                pictoRespuestas_layouts.get(3).setEstado(false);

            }
        });
        picto_respuesta5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta5.setImageResource(0);
                texto_respuesta5.setText("");
                pictoRespuestas_layouts.get(4).setEstado(false);

            }
        });

        picto_respuesta6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                picto_respuesta6.setImageResource(0);
                texto_respuesta6.setText("");
                pictoRespuestas_layouts.get(5).setEstado(false);

            }
        });
        //endregion

        //region BOTONES CATEGORÍAS
        // Boton Categoría 0 - FAVORITOS
        final ImageView button0 = findViewById(R.id.button_cat0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria0);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria0;
            }
        });

        //Boton Categoría 1 - ABECEDARIO
        final ImageView button1 = findViewById(R.id.button_cat1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria1);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria1;
            }
        });

        //Boton Categoría 2 - ACCIONES
        final ImageView button2 = findViewById(R.id.button_cat2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria2);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria2;
            }
        });

        //Boton Categoría 3 - ALIMENTOS
        final ImageView button3 = findViewById(R.id.button_cat3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria3);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria3;
            }
        });

        //Boton Categoría 4 - ANIMALES
        final ImageView button4 = findViewById(R.id.button_cat4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria4);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria4;
            }
        });

        //Boton Categoría 5 - CASA
        final ImageView button5 = findViewById(R.id.button_cat5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria5);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria5;
            }
        });

        //Boton Categoría 6 - COLORES
        final ImageView button6 = findViewById(R.id.button_cat6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria6);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria6;
            }
        });

        //Boton Categoría 7 - CUERPO
        final ImageView button7 = findViewById(R.id.button_cat7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria7);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria7;
            }
        });

        //Boton Categoría 8 - DEPORTES
        final ImageView button8 = findViewById(R.id.button_cat8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria8);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria8;
            }
        });

        //Boton Categoría 9 - FORMAS
        final ImageView button9 = findViewById(R.id.button_cat9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria9);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria9;
            }
        });

        //Boton Categoría 10 - INSTRUMENTOS
        final ImageView button10 = findViewById(R.id.button_cat10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria10);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria10;
            }
        });

        //Boton Categoría 11 - JUGUETERIA
        final ImageView button11 = findViewById(R.id.button_cat11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria11);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria11;
            }
        });

        //Boton Categoría 12 - LUGARES
        final ImageView button12 = findViewById(R.id.button_cat12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria12);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria12;
            }
        });

        //Boton Categoría 13 - NATURALEZA
        final ImageView button13 = findViewById(R.id.button_cat13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria13);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria13;
            }
        });

        //Boton Categoría 14 - NUMEROS
        final ImageView button14 = findViewById(R.id.button_cat14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria14);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria14;
            }
        });

        //Boton Categoría 15 - OBJETOS
        final ImageView button15 = findViewById(R.id.button_cat15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria15);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria15;
            }
        });

        //Boton Categoría 16 - PAISES
        final ImageView button16 = findViewById(R.id.button_cat16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria16);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria16;
            }
        });

        //Boton Categoría 17 - PERSONAS
        final ImageView button17 = findViewById(R.id.button_cat17);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria17);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria17;
            }
        });

        //Boton Categoría 18 - ROPA
        final ImageView button18 = findViewById(R.id.button_cat18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria18);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria18;
            }
        });

        //Boton Categoría 19 - SENTIMIENTOS
        final ImageView button19 = findViewById(R.id.button_cat19);
        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria19);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria19;
            }
        });

        //Boton Categoría 20 - SEÑALETICA
        final ImageView button20 = findViewById(R.id.button_cat20);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria20);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria20;
            }
        });

        //Boton Categoría 21 - VEHÍCULOS
        final ImageView button21 = findViewById(R.id.button_cat21);
        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter = new AdapterPictogramas(MainActivity.this,categoria21);
                recyclerView.setAdapter(adapter);
                pictoList_pictos = categoria21;
            }
        });

        //endregion

    }

    //region Metodo Armar Tirafrase

    public void armarTirafrase(){

        Intent intent = new Intent (this, TirafraseActivity.class);
        Bundle args = new Bundle();



        for (int i = 0; i<5; i++){

            if(pictoRespuestas_layouts.get(i).getEstado()){
                // SE AÑADEN 3 FOTOS (0,1,2) Y SE INTENTA AGREGAR LA FOTO NUMERO 5 (DE LA POSICION 5)
                respuestaTirafrase.add(pictoRespuestas_layouts.get(i));
            }
        }

        for(int j = 0; j<respuestaTirafrase.size(); j++){
            args.putInt("image"+j , respuestaTirafrase.get(j).getImage());
            args.putString("title"+j , respuestaTirafrase.get(j).getTexto_respuesta().getText().toString());
        }
        intent.putExtra("BUNDLE",args);
        finish();
        startActivity(intent);

    }

    //endregion

    //region Metodos RecyclerView

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
    //endregion

    //region METODOS DE LLENADO DE CATEGORÍAS

    public void cargarPictogramas_categoria0(ArrayList<Pictograma> categoria){

        //Categoria 0 - FAVORITOS

        pictograma = new Pictograma(1, "abotonar", R.drawable.cat02__abotonar);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria1(ArrayList<Pictograma> categoria){

        //Categoria 1 - ABECEDARIO
        pictograma = new Pictograma(1, "Hogar", R.drawable.cat05_hogar);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria2(ArrayList<Pictograma> categoria){

        //Categoria 2 - ACCIONES
        pictograma = new Pictograma(1, "abotonar", R.drawable.cat02__abotonar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "abrazar", R.drawable.cat02__abrazar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acalorar", R.drawable.cat02__acalorar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acalorar", R.drawable.cat02__acalorar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acampar", R.drawable.cat02__acampar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acariciar", R.drawable.cat02__acariciar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acostarse en la cama", R.drawable.cat02__acostarse_en_la_cama);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adornar", R.drawable.cat02__adornar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adornar", R.drawable.cat02__adornar_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adornar", R.drawable.cat02__adornar_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agachar", R.drawable.cat02__agachar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alcanzar", R.drawable.cat02__alcanzar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alegrar", R.drawable.cat02__alegrar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alegrar", R.drawable.cat02__alegrar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alejar", R.drawable.cat02__alejar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alimentar", R.drawable.cat02__alimentar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "almorzar", R.drawable.cat02__almorzar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "apagar", R.drawable.cat02__apagar_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "apagar el televisor", R.drawable.cat02__apagar_la_television);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "apretar", R.drawable.cat02__apretar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "arañar", R.drawable.cat02__aranar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avergonzar", R.drawable.cat02__avergonzar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "beber", R.drawable.cat02__beber_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "desear", R.drawable.cat02__desear);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "encender el televisor", R.drawable.cat02__encender_la_television_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar basquetbol", R.drawable.cat02__jugar_baloncesto);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar handbol", R.drawable.cat02__jugar_balonmano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar beisbol", R.drawable.cat02__jugar_beisbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar bolos", R.drawable.cat02__jugar_bolos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar futbol", R.drawable.cat02__jugar_futbol_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar hockey", R.drawable.cat02__jugar_hockey_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar rugby", R.drawable.cat02__jugar_rugby);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar tenis", R.drawable.cat02__jugar_tenis);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar voleibol", R.drawable.cat02__jugar_voleibol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar waterpolo", R.drawable.cat02__jugar_waterpolo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar golf", R.drawable.cat02__jugar_golf);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar en el computador", R.drawable.cat02__jugar_en_el_computador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jugar con el tablet", R.drawable.cat02__jugar_con_el_tablet);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lavar los platos", R.drawable.cat02__lavar_los_platos_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lavarse el pelo", R.drawable.cat02__lavarse_el_pelo_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "levantarse de la cama", R.drawable.cat02__levantarse_de_la_cama);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mirarse al espejo", R.drawable.cat02__mirarse_al_espejo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pasear al perro", R.drawable.cat02__pasear_al_perro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rascar", R.drawable.cat02__rascar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "recolectar", R.drawable.cat02__recolectar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "regalar", R.drawable.cat02__regalar_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "robar", R.drawable.cat02__robar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "saludar", R.drawable.cat02__saludar_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "saludar", R.drawable.cat02__saludar_4);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "secarse el pelo", R.drawable.cat02__secar_el_pelo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "secarse el pelo", R.drawable.cat02__secar_el_pelo_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sonarse", R.drawable.cat02__sonarse_la_nariz);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria3(ArrayList<Pictograma> categoria){

        //Categoria 3 - ALIMENTOS

        pictograma = new Pictograma(1, "aceite", R.drawable.cat03__aceite_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aceite de oliva", R.drawable.cat03__aceite_de_oliva);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aceituna negra", R.drawable.cat03__aceituna_negra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aceituna verde", R.drawable.cat03__aceituna_verde);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "acelga", R.drawable.cat03__acelga);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ajo", R.drawable.cat03__ajo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "albondiga", R.drawable.cat03__albondiga);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alcachofa", R.drawable.cat03__alcachofa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "apio", R.drawable.cat03__apio);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "arándanos", R.drawable.cat03__arandanos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "azúcar", R.drawable.cat03__azucar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "berries", R.drawable.cat03__berries);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "brócoli", R.drawable.cat03__brocoli);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "café", R.drawable.cat03__cafe);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cabritas", R.drawable.cat03__cabritas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cereza", R.drawable.cat03__cereza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "coliflor", R.drawable.cat03__coliflor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "damasco", R.drawable.cat03__damasco);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ensalada", R.drawable.cat03__ensalada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "espinacas", R.drawable.cat03__espinacas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "frutilla", R.drawable.cat03__frutilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hamburguesa con papas fritas", R.drawable.cat03__hamburguesa_con_papas_fritas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hielo", R.drawable.cat03__hielo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "higo", R.drawable.cat03__higo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jamón", R.drawable.cat03__jamon_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ketchup", R.drawable.cat03__ketchup);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "kiwi", R.drawable.cat03__kiwi);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lata de bebida", R.drawable.cat03__refresco_en_lata);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lechuga", R.drawable.cat03__lechuga);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "limón", R.drawable.cat03__limon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "limonada", R.drawable.cat03__limonada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mangos", R.drawable.cat03__mangos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "manzana", R.drawable.cat03__manzana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "manzana", R.drawable.cat03__manzana_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "manzana", R.drawable.cat03__manzana_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "maracuyá", R.drawable.cat03__maracuya);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mayonesa", R.drawable.cat03__mayonesa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "melón", R.drawable.cat03__melon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "naranja", R.drawable.cat03__naranja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pan", R.drawable.cat03__pan_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pan de molde", R.drawable.cat03__pan_de_molde);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "papa", R.drawable.cat03__papa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "papas fritas", R.drawable.cat03__papas_fritas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pera", R.drawable.cat03__pera_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pimienta", R.drawable.cat03__pimienta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pimentón", R.drawable.cat03__pimenton);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pimentón", R.drawable.cat03__pimenton_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "piña", R.drawable.cat03__pina_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "plátano", R.drawable.cat03__platano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pollo con papas fritas", R.drawable.cat03__pollo_con_patatas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "queso", R.drawable.cat03__queso);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "queso rallado", R.drawable.cat03__queso_rallado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rábano", R.drawable.cat03__rabano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "racimo de uvas", R.drawable.cat03__racimo_de_uvas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sal", R.drawable.cat03__sal);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "salchicha", R.drawable.cat03__salchicha_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sandía", R.drawable.cat03__sandia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sandwich", R.drawable.cat03__sandwich);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sopa", R.drawable.cat03__sopa_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tallarines", R.drawable.cat03__tallarines);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "taza de café", R.drawable.cat03__taza_de_cafe);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tocino", R.drawable.cat03__tocino);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "uvas", R.drawable.cat03__uvas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "yogurt", R.drawable.cat03__yogurt);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "zanahoria", R.drawable.cat03__zanahoria);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria4(ArrayList<Pictograma> categoria){

        //Categoria 4 - ANIMALES
        pictograma = new Pictograma(1, "abeja", R.drawable.cat04__abeja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "águila", R.drawable.cat04__aguila);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "araña", R.drawable.cat04__arana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ardilla", R.drawable.cat04__ardilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avestruz", R.drawable.cat04__avestruz);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avispa", R.drawable.cat04__avispa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ballena", R.drawable.cat04__ballena);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "caballito de mar", R.drawable.cat04__caballito_de_mar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "caballo", R.drawable.cat04__caballo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cabra", R.drawable.cat04__cabra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camaleón", R.drawable.cat04__camaleon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camello", R.drawable.cat04__camello);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "canario", R.drawable.cat04__canario);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cangrejo", R.drawable.cat04__cangrejo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "canguro", R.drawable.cat04__canguro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "caracol", R.drawable.cat04__caracol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "chinita", R.drawable.cat04__chinita);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cigüeña", R.drawable.cat04__ciguena);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cisne", R.drawable.cat04__cisne);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cocodrilo", R.drawable.cat04__cocodrilo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "colibrí", R.drawable.cat04__colibri);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "conejo", R.drawable.cat04__conejo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "elefante", R.drawable.cat04__elefante);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "erizo", R.drawable.cat04__erizo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "escarabajo", R.drawable.cat04__escarabajo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "estrella de mar", R.drawable.cat04__estrella_de_mar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gallina", R.drawable.cat04__gallina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gallo", R.drawable.cat04__gallo_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gato", R.drawable.cat04__gato_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gaviota", R.drawable.cat04__gaviota);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "golondrina", R.drawable.cat04__golondrina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "grillo", R.drawable.cat04__grillo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gusano", R.drawable.cat04__gusano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hamster", R.drawable.cat04__hamster);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hipopótamo", R.drawable.cat04__hipopotamo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hormiga", R.drawable.cat04__hormiga);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "iguana", R.drawable.cat04__iguana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jirafa", R.drawable.cat04__jirafa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "koala", R.drawable.cat04__koala);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lechuza", R.drawable.cat04__lechuza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "león", R.drawable.cat04__leon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "loro", R.drawable.cat04__loro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mariposa", R.drawable.cat04__mariposa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "nutria", R.drawable.cat04__nutria);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oruga", R.drawable.cat04__oruga);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oso", R.drawable.cat04__oso);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oso panda", R.drawable.cat04__oso_panda);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oso polar", R.drawable.cat04__oso_polar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oveja", R.drawable.cat04__oveja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "paloma", R.drawable.cat04__paloma_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pato", R.drawable.cat04__pato_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pelícano", R.drawable.cat04__pelicano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "perro", R.drawable.cat04__perro_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pez", R.drawable.cat04__pez);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pingüino", R.drawable.cat04__pinguino_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "polilla", R.drawable.cat04__polilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pulpo", R.drawable.cat04__pulpo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "puma", R.drawable.cat04__puma);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rana", R.drawable.cat04__rana_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ratón", R.drawable.cat04__raton);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rinoceronte", R.drawable.cat04__rinoceronte);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "saltamontes", R.drawable.cat04__saltamontes);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sapo", R.drawable.cat04__sapo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "serpiente", R.drawable.cat04__serpiente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tigre", R.drawable.cat04__tigre);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "vaca", R.drawable.cat04__vaca);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "zorro", R.drawable.cat04__zorro);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria5(ArrayList<Pictograma> categoria){

        //Categoria 5 - CASA
        pictograma = new Pictograma(1, "abrelatas", R.drawable.cat05__abrelatas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aspiradora", R.drawable.cat05__aspiradora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "batidora", R.drawable.cat05__batidora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cama", R.drawable.cat05__cama);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camarote", R.drawable.cat05__camarote);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "celular", R.drawable.cat05__telefono_movil);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cocina", R.drawable.cat05__cocina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cortinas", R.drawable.cat05__cortinas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuadro", R.drawable.cat05__cuadro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuchara", R.drawable.cat05__cuchara);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cucharon", R.drawable.cat05__cucharon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuchillo de mesa", R.drawable.cat05__cuchillo_de_mesa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ducha", R.drawable.cat05__ducha_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ducha", R.drawable.cat05__ducha);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "enchufe", R.drawable.cat05__enchufe);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "espátula", R.drawable.cat05__espatula);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "espejo", R.drawable.cat05__espejo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gancho de ropa", R.drawable.cat05__gancho_de_ropa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "grifo", R.drawable.cat05__grifo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guante de horno", R.drawable.cat05__guante_de_horno);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "horno", R.drawable.cat05__horno);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jarra", R.drawable.cat05__jarra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lámpara", R.drawable.cat05__lampara_de_mesa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lámpara de pie", R.drawable.cat05__lampara_de_pie);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lavadora", R.drawable.cat05__lavadora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lavamanos", R.drawable.cat05__lavamanos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mantel", R.drawable.cat05__mantel);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mesa", R.drawable.cat05__mesa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "microondas", R.drawable.cat05__microondas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "olla", R.drawable.cat05__olla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "papel higiénico", R.drawable.cat05__papel_higienico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "papelera", R.drawable.cat05__papelera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "plancha", R.drawable.cat05__plancha);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "plato", R.drawable.cat05__plato);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "puerta", R.drawable.cat05__puerta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rallador", R.drawable.cat05__rallador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "refrigerador", R.drawable.cat05__refrigerador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sandwichera", R.drawable.cat05__sandwichera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sartén", R.drawable.cat05__sarten);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sillón", R.drawable.cat05__sillon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sofá", R.drawable.cat05__sofa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "taza", R.drawable.cat05__taza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "taza de baño", R.drawable.cat05__taza_de_bano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "teléfono", R.drawable.cat05__telefono);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "teléfono inalámbrico", R.drawable.cat05__telefono_inhambrico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "televisor", R.drawable.cat05__television);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tenedor", R.drawable.cat05__tenedor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tina", R.drawable.cat05__tina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "toalla", R.drawable.cat05__toalla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tostador", R.drawable.cat05__tostadora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "vaso", R.drawable.cat05__vaso);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria6(ArrayList<Pictograma> categoria){

        //Categoria 6 - COLORES
        pictograma = new Pictograma(1, "amarillo", R.drawable.cat06__amarillo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "azul claro", R.drawable.cat06__azul_claro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "azul oscuro", R.drawable.cat06__azul_oscuro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "beige", R.drawable.cat06__beige);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "blanco", R.drawable.cat06__blanco_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "café", R.drawable.cat06__color_cafe);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "dorado", R.drawable.cat06__dorado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gris", R.drawable.cat06__gris);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "lila", R.drawable.cat06__lila);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "morado", R.drawable.cat06__morado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "naranjo", R.drawable.cat06__naranja_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "negro", R.drawable.cat06__negro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "plateado", R.drawable.cat06__plateado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rojo", R.drawable.cat06__rojo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rosado", R.drawable.cat06__rosa_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "verde claro", R.drawable.cat06__verde_claro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "verde oscuro", R.drawable.cat06__verde_oscuro);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria7(ArrayList<Pictograma> categoria){

        //Categoria 7 - CUERPO
        pictograma = new Pictograma(1, "abdominal", R.drawable.cat07__abdominal);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "axila", R.drawable.cat07__axila);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "barba", R.drawable.cat07__barba);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bigote", R.drawable.cat07__bigote);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "brazo", R.drawable.cat07__brazo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuerpo", R.drawable.cat07_cuerpo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cabeza", R.drawable.cat07__cabeza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cadera", R.drawable.cat07__cadera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cara", R.drawable.cat07__cara);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ceja", R.drawable.cat07__ceja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "codo", R.drawable.cat07__codo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuello", R.drawable.cat07__cuello);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "dedo", R.drawable.cat07__dedo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "dedos", R.drawable.cat07__dedos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "espalda", R.drawable.cat07__espalda);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "estómago", R.drawable.cat07__estomago);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "frente", R.drawable.cat07__frente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hombro", R.drawable.cat07__hombro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "labios", R.drawable.cat07__labios);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mano", R.drawable.cat07__mano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "nariz", R.drawable.cat07__nariz);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ojo", R.drawable.cat07__ojo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oreja", R.drawable.cat07__oreja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pelo", R.drawable.cat07__pelo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pera", R.drawable.cat07__pera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pestaña", R.drawable.cat07__pestana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pie", R.drawable.cat07__pie);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "piel", R.drawable.cat07__piel);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pierna", R.drawable.cat07__pierna);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pulgar", R.drawable.cat07__pulgar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rodilla", R.drawable.cat07__rodilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "talón", R.drawable.cat07__talon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tobillo", R.drawable.cat07__tobillo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "uña", R.drawable.cat07__una);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria8(ArrayList<Pictograma> categoria){

        //Categoria 8 - DEPORTES
        pictograma = new Pictograma(1, "balon de basquetbol", R.drawable.cat08__balon_de_basquetbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "balon de fútbol", R.drawable.cat08__balon_de_futbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "balon de rugby", R.drawable.cat08__balon_de_rubgy);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "basquetbol", R.drawable.cat08__baloncesto);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bate", R.drawable.cat08__bate);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "fútbol", R.drawable.cat08__futbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "judo", R.drawable.cat08__judo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "karate", R.drawable.cat08__karate);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pelota", R.drawable.cat08__pelota);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pelota de tenis", R.drawable.cat08__pelota_de_tenis);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pelota de beisbol", R.drawable.cat08__pelota_de_beisbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ping pong", R.drawable.cat08__ping_pong);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "raqueta de tenis", R.drawable.cat08__raqueta_de_tenis);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "yoga", R.drawable.cat08__yoga);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria9(ArrayList<Pictograma> categoria){

        //Categoria 9 - FORMAS
        pictograma = new Pictograma(1, "cilindro", R.drawable.cat09__cilindro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "circulo", R.drawable.cat09__circulo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cono", R.drawable.cat09__cono);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "corazón", R.drawable.cat09__corazon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuadrado", R.drawable.cat09__cuadrado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuadrados", R.drawable.cat09__cuadrados);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cubo", R.drawable.cat09__cubo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cuerpos geométricos", R.drawable.cat09__cuerpos_geometricos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "diámetro", R.drawable.cat09__diametro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "esfera", R.drawable.cat09__esfera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "estrella", R.drawable.cat09__estrella);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "formas", R.drawable.cat09__formas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "hexágono", R.drawable.cat09__hexagono);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "línea", R.drawable.cat09__linea);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "línea curva", R.drawable.cat09__linea_curva);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "línea ondulada", R.drawable.cat09__linea_ondulada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "línea quebrada", R.drawable.cat09__linea_quebrada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "línea recta", R.drawable.cat09__linea_recta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ovalado", R.drawable.cat09__ovalado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pentágono", R.drawable.cat09__pentagono);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pirámide", R.drawable.cat09__piramide);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "prisma", R.drawable.cat09__prisma);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rectángulo", R.drawable.cat09__rectangulo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rombo", R.drawable.cat09__rombo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "trapecio", R.drawable.cat09__trapecio);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "triángulo", R.drawable.cat09__triangulo);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria10(ArrayList<Pictograma> categoria){

        //Categoria 10 - INSTRUMENTOS
        pictograma = new Pictograma(1, "acordeoón", R.drawable.cat10__acordeon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "armónica", R.drawable.cat10__armonica);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "arpa", R.drawable.cat10__arpa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "batería", R.drawable.cat10__bateria);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bongó", R.drawable.cat10__bongo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "campana", R.drawable.cat10__campana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cascabel", R.drawable.cat10__cascabel);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "castañuela", R.drawable.cat10__castanuela);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "clarinete", R.drawable.cat10__clarinete);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "corneta", R.drawable.cat10__corneta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "flauta", R.drawable.cat10__flauta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "flauta traversa", R.drawable.cat10__flauta_travesera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guitarra", R.drawable.cat10__guitarra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guitarra eléctrica", R.drawable.cat10__guitarra_electrica);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "maracas", R.drawable.cat10__maracas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pandereta", R.drawable.cat10__pandereta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pandero", R.drawable.cat10__pandero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "piano", R.drawable.cat10__piano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "platillos", R.drawable.cat10__platillos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "saxofón", R.drawable.cat10__saxofon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tambor", R.drawable.cat10__tambor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "triángulo", R.drawable.cat10__triangulo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "trompa", R.drawable.cat10__trompa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "trompeta", R.drawable.cat10__trompeta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tuba", R.drawable.cat10__tuba);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "viola", R.drawable.cat10__viola);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "violín", R.drawable.cat10__violin);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "violonchelo", R.drawable.cat10__violonchelo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "xilófono", R.drawable.cat10__xilofono);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria11(ArrayList<Pictograma> categoria){

        //Categoria 11 - JUGUETES
        pictograma = new Pictograma(1, "ajedrez", R.drawable.cat11__ajedrez);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avión de papel", R.drawable.cat11__avion_de_papel);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camión de juguete", R.drawable.cat11__camion_de_juguete);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "oso de peluche", R.drawable.cat11__oso_de_peluche);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tren de juguete", R.drawable.cat11__tren_de_juguete);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "trompo", R.drawable.cat11__trompo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "yoyó", R.drawable.cat11__yoyo);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria12(ArrayList<Pictograma> categoria){

        //Categoria 12 - LUGARES
        pictograma = new Pictograma(1, "acantilado", R.drawable.cat12__acantilado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alcantarilla", R.drawable.cat12__alcantarilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "autopista", R.drawable.cat12__autopista);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avenida", R.drawable.cat12__avenida);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bahía", R.drawable.cat12__bahia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "barranco", R.drawable.cat12__barranco);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cafetería", R.drawable.cat12__cafeteria);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cancha de basquetbol", R.drawable.cat12__cancha_de_baloncesto);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cancha de fútbol", R.drawable.cat12__cancha_de_futbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "casa", R.drawable.cat12__casa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cascada", R.drawable.cat12__cascada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Coliseo de Roma", R.drawable.cat12__coliseo_de_roma);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "estadio de fútbol", R.drawable.cat12__estadio_de_futbol);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "isla", R.drawable.cat12__isla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "islote", R.drawable.cat12__islote);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "kiosko", R.drawable.cat12__kiosco);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "océano", R.drawable.cat12__oceano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pantano", R.drawable.cat12__pantano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pirámide", R.drawable.cat12__piramide);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pirámide", R.drawable.cat12__piramide_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "puerto", R.drawable.cat12__puerto);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria13(ArrayList<Pictograma> categoria){

        //Categoria 13 - NATURALEZA
        pictograma = new Pictograma(1, "Auto", R.drawable.cat02_acciones);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria14(ArrayList<Pictograma> categoria){

        //Categoria 14 - NUMEROS
        pictograma = new Pictograma(1, "Auto", R.drawable.cat02_acciones);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria15(ArrayList<Pictograma> categoria){

        //Categoria 15 - OBJETOS
        pictograma = new Pictograma(1, "abanico", R.drawable.cat15__abanico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adorno de Navidad", R.drawable.cat15__adorno_de_navidad);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agenda", R.drawable.cat15__agenda);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "álbum de fotos", R.drawable.cat15__album_de_fotos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alfombra", R.drawable.cat15__alfombra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "almohada", R.drawable.cat15__almohada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "audífonos", R.drawable.cat15__audifonos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "baúl", R.drawable.cat15__baul);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bombilla", R.drawable.cat15__bombilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "caja", R.drawable.cat15__caja);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cepillo de pelo", R.drawable.cat15__cepillo_de_pelo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "diccionario", R.drawable.cat15__diccionario);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "espejo", R.drawable.cat15__espejo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "estrella de Navidad", R.drawable.cat15__estrella_de_navidad);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jabón", R.drawable.cat15__jabon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jarrón", R.drawable.cat15__jarron);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jaula", R.drawable.cat15__jaula_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jaula", R.drawable.cat15__jaula);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "luces de Navidad", R.drawable.cat15__luces_de_navidad);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "papel higiénico", R.drawable.cat15__papel_higienico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "reloj", R.drawable.cat15__reloj);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "reloj despertador", R.drawable.cat15__reloj_despertador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "reloj digital", R.drawable.cat15__reloj_digital);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "rosario", R.drawable.cat15__rosario);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sacapuntas", R.drawable.cat15__sacapuntas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "secador de pelo", R.drawable.cat15__secador_de_pelo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "silla", R.drawable.cat15__silla_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "silla", R.drawable.cat15__silla_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "spray", R.drawable.cat15__spray);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tela de araña", R.drawable.cat15__tela_de_arana);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria16(ArrayList<Pictograma> categoria){

        //Categoria 16 - PAISES
        pictograma = new Pictograma(1, "África", R.drawable.cat16__africa_continente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "América", R.drawable.cat16__america_continente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Asia", R.drawable.cat16__asia_continente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Europa", R.drawable.cat16__europa_continente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Oceanía", R.drawable.cat16__oceania_continente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Afganistán", R.drawable.cat16__afganistan);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Albania", R.drawable.cat16__albania);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Alemania", R.drawable.cat16__alemania);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Andorra", R.drawable.cat16__andorra);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Angola", R.drawable.cat16__angola);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Arabia Saudita", R.drawable.cat16__arabia_saudi);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Argelia", R.drawable.cat16__argelia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Argentina", R.drawable.cat16__argentina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Armenia", R.drawable.cat16__armenia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Australia", R.drawable.cat16__australia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Austria", R.drawable.cat16__austria);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Azerbaiyán", R.drawable.cat16__azerbaiyan);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Bahamas", R.drawable.cat16__bahamas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Barbados", R.drawable.cat16__barbados);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Bolivia", R.drawable.cat16__bolivia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Brasil", R.drawable.cat16__brasil);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Cabo Verde", R.drawable.cat16__cabo_verde);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Canadá", R.drawable.cat16__canada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Canarias", R.drawable.cat16__canarias);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Chile", R.drawable.cat16__chile);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "China", R.drawable.cat16__china);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Corea del Sur", R.drawable.cat16__corea_del_sur);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Corea del Norte", R.drawable.cat16__corea_del_norte);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Cuba", R.drawable.cat16__cuba);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Europa", R.drawable.cat16__europa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Ecuador", R.drawable.cat16__ecuador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "El Salvador", R.drawable.cat16__el_salvador);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Emiratos Arabes", R.drawable.cat16__emiratos_arabes_unidos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "España", R.drawable.cat16__espana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Estados Unidos", R.drawable.cat16__estados_unidos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Francia", R.drawable.cat16__francia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Guayana Francesa", R.drawable.cat16__guayana_francesa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Guyana", R.drawable.cat16__guyana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Irak", R.drawable.cat16__irak);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Irán", R.drawable.cat16__iran);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Irlanda", R.drawable.cat16__irlanda);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Islandia", R.drawable.cat16__islandia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Israel", R.drawable.cat16__israel);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Italia", R.drawable.cat16__italia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Jamaica", R.drawable.cat16__jamaica);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Japón", R.drawable.cat16__japon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Kuwait", R.drawable.cat16__kuwait);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Panamá", R.drawable.cat16__panama);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Perú", R.drawable.cat16__peru);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Puerto Rico", R.drawable.cat16__puerto_rico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Qatar", R.drawable.cat16__qatar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "República Checa", R.drawable.cat16__republica_checa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "República Dominicana", R.drawable.cat16__republica_dominicana);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Rusia", R.drawable.cat16__rusia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Senegal", R.drawable.cat16__senegal);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Suecia", R.drawable.cat16__suecia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Surinam", R.drawable.cat16__surinam);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Tailandia", R.drawable.cat16__tailandia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Uruguay", R.drawable.cat16__uruguay);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "Venezuela", R.drawable.cat16__venezuela);
        categoria.add(pictograma);
    }

    public void cargarPictogramas_categoria17(ArrayList<Pictograma> categoria){

        //Categoria 17 - PERSONAS
        pictograma = new Pictograma(1, "abuela", R.drawable.cat17__abuela_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "abuelo", R.drawable.cat17__abuelo_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adolescente", R.drawable.cat17__adolescente);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "adolescente", R.drawable.cat17__adolescente_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agricultor", R.drawable.cat17__agricultor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agricultora", R.drawable.cat17__agricultora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bailarín", R.drawable.cat17__bailarin);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bailarina", R.drawable.cat17__bailarina);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "barrendero", R.drawable.cat17__barrendero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "barrendera", R.drawable.cat17__barrendera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "capitán", R.drawable.cat17__capitan);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "científica", R.drawable.cat17__cientifica);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "científico", R.drawable.cat17__cientifico);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "constructor", R.drawable.cat17__constructor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "constructora", R.drawable.cat17__constructora);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "fubolísta", R.drawable.cat17__futbolista);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "fubolísta", R.drawable.cat17__futbolista_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guitarrista", R.drawable.cat17__guitarrista);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guitarrista", R.drawable.cat17__guitarrista_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "juez", R.drawable.cat17__juez);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "jueza", R.drawable.cat17__jueza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ladrón", R.drawable.cat17__ladron);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ladrona", R.drawable.cat17__ladrona);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "marinera", R.drawable.cat17__marinera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "marinero", R.drawable.cat17__marinero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "panadera", R.drawable.cat17__panadera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "panadero", R.drawable.cat17__panadero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "repartidor", R.drawable.cat17__repartidor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "repartidora", R.drawable.cat17__repartidora);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria18(ArrayList<Pictograma> categoria){

        //Categoria 18 - VESTIMENTA
        pictograma = new Pictograma(1, "abrigo", R.drawable.cat18__abrigo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aros", R.drawable.cat18__aros);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bata", R.drawable.cat18__bata);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bikini", R.drawable.cat18__bikini);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "billetera", R.drawable.cat18__billetera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "blusa", R.drawable.cat18__blusa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bolso", R.drawable.cat18__bolso);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "botas", R.drawable.cat18__botas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "botón", R.drawable.cat18__boton);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bufanda", R.drawable.cat18__bufanda);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "calcetines", R.drawable.cat18__calcetines);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camisa", R.drawable.cat18__camisa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camisa", R.drawable.cat18__camisa_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "capucha", R.drawable.cat18__capucha);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cartera", R.drawable.cat18__cartera);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "chaleco salvavidas", R.drawable.cat18__chaleco_salvavidas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "chaquetón", R.drawable.cat18__chaqueton);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gorro", R.drawable.cat18__gorro);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gorro de baño", R.drawable.cat18__gorro_de_bano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "gorro de fiesta", R.drawable.cat18__gorro_de_fiesta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guante", R.drawable.cat18__guante_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guantes", R.drawable.cat18__guantes);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guantes", R.drawable.cat18__guantes_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "guantes", R.drawable.cat18__guantes_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "medias", R.drawable.cat18__medias);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pantalon", R.drawable.cat18__pantalon);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pantalones cortos", R.drawable.cat18__pantalones_cortos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "pantuflas", R.drawable.cat18__pantuflas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sandalias", R.drawable.cat18__sandalias);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "traje de baño", R.drawable.cat18__traje_de_bano);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "traje de baño", R.drawable.cat18__traje_de_bano1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "zapatilla", R.drawable.cat18__zapatilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "zapatos de ballet", R.drawable.cat18__zapatillas_de_ballet);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "zapatos de tacón", R.drawable.cat18__zapatos_de_tacon);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria19(ArrayList<Pictograma> categoria){

        //Categoria 19 - SENTIMIENTOS
        pictograma = new Pictograma(1, "aburrida", R.drawable.cat19__aburrida);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aburrido", R.drawable.cat19__aburrido);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agotada", R.drawable.cat19__agotada);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "agotado", R.drawable.cat19__agotado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alegre", R.drawable.cat19__alegre);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "alegre", R.drawable.cat19__alegre_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "aterrorizado", R.drawable.cat19__aterrorizado_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avergonzado", R.drawable.cat19__avergonzado);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "contento", R.drawable.cat19__contento_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "enojado", R.drawable.cat19__enojado_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "¿estas contento?", R.drawable.cat19__estas_contento);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "mareado", R.drawable.cat19__mareado_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "me molesta el ruído", R.drawable.cat19__me_molesta_el_ruido);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "nervioso", R.drawable.cat19__nervioso_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "no comprendo lo que dices", R.drawable.cat19__no_comprendo_lo_que_dices);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "¿que dices?", R.drawable.cat19__que_dices);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "quiero", R.drawable.cat19__quiero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "quiero ese", R.drawable.cat19__quiero_ese);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "risa", R.drawable.cat19__risa);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sed", R.drawable.cat19__sed_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "sorprendido", R.drawable.cat19__sorprendido_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "temor", R.drawable.cat19__temor);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tímido", R.drawable.cat19__timido);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "yo", R.drawable.cat19__yo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "yo", R.drawable.cat19__yo_2);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria20(ArrayList<Pictograma> categoria){

        //Categoria 20 - SEÑALETICA
        pictograma = new Pictograma(1, "Auto", R.drawable.cat02_acciones);
        categoria.add(pictograma);

    }

    public void cargarPictogramas_categoria21(ArrayList<Pictograma> categoria){

        //Categoria 21 - TRANSPORTES
        pictograma = new Pictograma(1, "ambulancia", R.drawable.cat21__ambulancia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "ascensor", R.drawable.cat21__ascensor_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "auto", R.drawable.cat21__auto);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "auto de carreras", R.drawable.cat21__auto_de_carreras);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "auto de policía", R.drawable.cat21__auto_de_policia);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "auto de rally", R.drawable.cat21__auto_de_rally);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avión", R.drawable.cat21__avion);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avión", R.drawable.cat21__avion_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "avioneta", R.drawable.cat21__avioneta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "barco", R.drawable.cat21__barco);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bicicleta", R.drawable.cat21__bicicleta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "bote", R.drawable.cat21__bote);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camión de bomberos", R.drawable.cat21__camion_de_bomberos);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camión de basura", R.drawable.cat21__camion_de_la_basura);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "camión", R.drawable.cat21__camion_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "canoa", R.drawable.cat21__canoa_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "carreta", R.drawable.cat21__carreta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "carretilla", R.drawable.cat21__carretilla);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "carretilla", R.drawable.cat21__carretilla1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "carroza", R.drawable.cat21__carroza);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "carruaje", R.drawable.cat21__carruaje);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "casa rodante", R.drawable.cat21__casa_rodante);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "cohete", R.drawable.cat21__nave_espacial_2);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "funicular", R.drawable.cat21__funicular);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "furgoneta", R.drawable.cat21__furgoneta);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "helicóptero", R.drawable.cat21__helicoptero);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "metro", R.drawable.cat21__metro_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "microbus", R.drawable.cat21__microbus);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "nave espacial", R.drawable.cat21__nave_espacial_1);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "paracaídas", R.drawable.cat21__paracaidas);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "silla de montar", R.drawable.cat21__silla_de_montar);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "silla de ruedas", R.drawable.cat21__silla_de_ruedas_3);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "submarino", R.drawable.cat21__submarino);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "tren", R.drawable.cat21__tren);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "triciclo", R.drawable.cat21__triciclo);
        categoria.add(pictograma);
        pictograma = new Pictograma(1, "triciclo", R.drawable.cat21__triciclo_1);
        categoria.add(pictograma);

    }

    //endregion

    //region Boton Borrar Respuestas

    private void delete_answers(ImageView picto_respuesta1,
                              ImageView picto_respuesta2,
                              ImageView picto_respuesta3,
                              ImageView picto_respuesta4,
                              ImageView picto_respuesta5,
                              ImageView picto_respuesta6,
                              TextView texto_respuesta1,
                              TextView texto_respuesta2,
                              TextView texto_respuesta3,
                              TextView texto_respuesta4,
                              TextView texto_respuesta5,
                              TextView texto_respuesta6){

        picto_respuesta1.setImageResource(0);
        texto_respuesta1.setText("");
        pictoRespuestas_layouts.get(0).setEstado(false);

        picto_respuesta2.setImageResource(0);
        texto_respuesta2.setText("");
        pictoRespuestas_layouts.get(1).setEstado(false);

        picto_respuesta3.setImageResource(0);
        texto_respuesta3.setText("");
        pictoRespuestas_layouts.get(2).setEstado(false);

        picto_respuesta4.setImageResource(0);
        texto_respuesta4.setText("");
        pictoRespuestas_layouts.get(3).setEstado(false);

        picto_respuesta5.setImageResource(0);
        texto_respuesta5.setText("");
        pictoRespuestas_layouts.get(4).setEstado(false);

        picto_respuesta6.setImageResource(0);
        texto_respuesta6.setText("");
        pictoRespuestas_layouts.get(5).setEstado(false);
    }

    //endregion

    private void fillAnswers(ArrayList<PictoRespuesta> arrayResultados, Pictograma pictoSeleccionado){

        for(int x = 0; x < arrayResultados.size(); x = x+1){
            if(!arrayResultados.get(x).getEstado()){
                arrayResultados.get(x).getImagen_respuesta().setImageResource(pictoSeleccionado.getImagen());
                arrayResultados.get(x).getTexto_respuesta().setText(pictoSeleccionado.getNombre());
                arrayResultados.get(x).setEstado(true);
                arrayResultados.get(x).setImage(pictoSeleccionado.getImagen());
                break;
            }
        }
    }

}






