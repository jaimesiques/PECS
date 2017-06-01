package com.example.jaime.pecs2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
    private Button btn_borrar;

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

        //Cargar categorias
        for(int i=0; i<LoadData.getInstance().categorias.size(); i++)
        cargar_categorias(i);

        // --------------------------------------
        // FIN CATEGORIAS
        // --------------------------------------

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Obtenemos la categoría activada
                Integer categoria;
                categoria = LoadData.getInstance().getCategoriaActivada();
                agregarResultado(position,categoria);
            }
        });

        btn_borrar = (Button) findViewById(R.id.button_borrar);
        btn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrarRespuestas();
            }
        });
    }

    private void borrarRespuestas() {
        Integer longitud_respuestas = LoadData.getInstance().resultados.size();
        ImageView image;

        for(int i = 0; i < longitud_respuestas; i++){
            LoadData.getInstance().resultados.get(i).setActivado(false);
            image = (ImageView) findViewById(LoadData.getInstance().resultados.get(i).getUrl_resultado());
            image.setImageResource(0);
        }
    }

    private void cargar_categorias(final Integer num_categoria) {
        Integer longitud_categorias = LoadData.getInstance().categorias.size();

            ImageView image = (ImageView) findViewById(LoadData.getInstance().categorias.get(num_categoria).getUrl_categoria());
            image.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v)
                {
                    LoadData.getInstance().activateCategoria(num_categoria);
                    gridViewAdapter = new GridviewAdapter(PlayActivity.this, LoadData.getInstance().categorias.get(num_categoria).getUrls());
                    gridView.setAdapter(gridViewAdapter);
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
                    Toast.makeText(PlayActivity.this, String.valueOf(resultado_posicion), Toast.LENGTH_SHORT).show();
                    if (LoadData.getInstance().resultados.get(resultado_posicion).isActivado()) {
                        borrarRespuesta(resultado_posicion);
                    }else{
                        Toast.makeText(PlayActivity.this, "No hay actividad para borrar", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            Toast.makeText(PlayActivity.this, "Haz alcanzado el número máximo de actividades", Toast.LENGTH_SHORT).show();
        }
    }

    private void borrarRespuesta(Integer resultado_posicion) {
        //Desactivamos el objeto seleccionado
        LoadData.getInstance().resultados.get(resultado_posicion).setActivado(false);
        //Borramos el drawable
        resultado = (ImageView) findViewById(LoadData.getInstance().resultados.get(resultado_posicion).getUrl_resultado());
        resultado.setImageResource(0);
    }

}
