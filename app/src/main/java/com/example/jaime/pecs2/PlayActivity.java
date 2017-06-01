package com.example.jaime.pecs2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jaime.pecs2.Load.LoadData;
import com.example.jaime.pecs2.Load.Resultado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayActivity extends AppCompatActivity {

    private GridView gridView;
    private GridviewAdapter gridViewAdapter;
    private ImageView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --------------------------------------
        //INICIO CATEGORIAS
        // --------------------------------------

        gridView = (GridView) findViewById(R.id.grid_pictogramas);
        gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());

        gridView.setAdapter(gridViewAdapter);

        ImageView image1 = (ImageView) findViewById(R.id.categoria_1);
        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(0);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image2 = (ImageView) findViewById(R.id.categoria_2);
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(1);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(1).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image3 = (ImageView) findViewById(R.id.categoria_3);
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(2);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image4 = (ImageView) findViewById(R.id.categoria_4);
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(3);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image5 = (ImageView) findViewById(R.id.categoria_5);
        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(4);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        ImageView image6 = (ImageView) findViewById(R.id.categoria_6);
        image6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(5);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });


        ImageView image7 = (ImageView) findViewById(R.id.categoria_7);
        image7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(6);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });


        ImageView image8 = (ImageView) findViewById(R.id.categoria_8);
        image8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                LoadData.getInstance().activateCategoria(7);
                gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(0).getUrls());
                gridView.setAdapter(gridViewAdapter);
            }

        });

        // --------------------------------------
        // FIN CATEGORIAS
        // --------------------------------------

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Obtenemos la categoría activada
                Integer categoria;
                categoria = LoadData.getInstance().getCategoriaActivada();
                Log.e("problema", String.valueOf(categoria));
                agregarResultado(position,categoria);
            }
        });

    }

    private void activar(int i) {
        Integer longitud_categorias = LoadData.getInstance().categorias.size();
        for(int j = 0; j < longitud_categorias; j ++){
            LoadData.getInstance().categorias.get(i).desactivar();
        }
        LoadData.getInstance().categorias.get(i).activar();
    }

    private void agregarResultado(int position_pictograma, Integer categoria){
        Integer posicion_resultado = LoadData.getInstance().getSiguienteEspacio();
        if(posicion_resultado < 5) {
            resultado = (ImageView) findViewById(LoadData.getInstance().resultados.get(posicion_resultado).getUrl_resultado());
            resultado.setImageResource(LoadData.getInstance().categorias.get(categoria).getPictogramas().get(position_pictograma).getUrl_pictograma());
            LoadData.getInstance().resultados.get(posicion_resultado).setActivado(true);

            resultado.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Eliminar foto y re-ordenar
                    Integer resultado_posicion = LoadData.getInstance().getResultadoById(v.getId()).getId();
                    if (LoadData.getInstance().resultados.get(resultado_posicion).isActivado()) {
                        reordenar(resultado_posicion, PlayActivity.this);
                    }else{
                        Toast.makeText(PlayActivity.this, "No hay actividad para borrar", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            Toast.makeText(PlayActivity.this, "Haz alcanzado el número máximo de actividades", Toast.LENGTH_SHORT).show();
        }
    }

    private void reordenar(Integer resultado_posicion, PlayActivity playActivity) {
        //Falta esta wea
    }

}
