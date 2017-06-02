package com.example.jaime.pecs2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GridviewAdapter extends BaseAdapter{

    private Context context;
    private Integer[] items;

    public GridviewAdapter(Context context, Integer[] items){
        super();
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img;

        if (convertView == null) {
            img = new ImageView(context);
            convertView = img;
            img.setPadding(5, 5, 5, 5);
            img.setAdjustViewBounds(true);

        } else {
            img = (ImageView) convertView;
        }

        Picasso.with(context)
                .load(items[position])
                .placeholder(R.drawable.imagen_cargando)
                .resize(200, 230)
                .into(img);

        return convertView;
    }
}
