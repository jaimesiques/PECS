package com.example.jaime.pecs2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.grid_pictogramas);
        gridView.setAdapter((new ImageAdapter(this)));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PlayActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });


        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/chalkboard.ttf");
    }

    public class ImageAdapter extends BaseAdapter{
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public Object getItem(int position) {
            return null;
        }

        public int getCount() {
            return mThumbsId.length;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbsId[position]);
            imageView.setAdjustViewBounds(true);
            return imageView;
        }

        private Integer[] mThumbsId = {
            R.drawable.cat1_abecedario,
            R.drawable.cat2_acciones,
            R.drawable.cat3_alimento,
            R.drawable.cat4_animales,
            R.drawable.cat5_casa,
            R.drawable.cat6_colores,
            R.drawable.cat7_formas,
            R.drawable.cat8_instrumentos,
            R.drawable.cat9_lugares,
            R.drawable.cat10_naturaleza,
            R.drawable.cat11_numeros,
            R.drawable.cat12_objetos,
        };

    }
}
