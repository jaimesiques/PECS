package com.example.jaime.pecs2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.Button;

import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
        //normalShape = getResources().getDrawable(R.drawable.shape);

        Button categoria1 = (Button) findViewById(R.id.cat1);
        Button categoria2 = (Button) findViewById(R.id.cat2);
        Button categoria3 = (Button) findViewById(R.id.cat3);
        Button categoria4 = (Button) findViewById(R.id.cat4);
        Button categoria5 = (Button) findViewById(R.id.cat5);
        Button categoria6 = (Button) findViewById(R.id.cat6);
        Button categoria7 = (Button) findViewById(R.id.cat7);
        Button categoria8 = (Button) findViewById(R.id.cat8);
        Button categoria9 = (Button) findViewById(R.id.cat9);
        Button categoria10 = (Button) findViewById(R.id.cat10);

        TextView t_respuesta1 = (TextView) findViewById(R.id.texto_respuesta1);
        TextView t_respuesta2 = (TextView) findViewById(R.id.texto_respuesta2);
        TextView t_respuesta3 = (TextView) findViewById(R.id.texto_respuesta3);
        TextView t_respuesta4 = (TextView) findViewById(R.id.texto_respuesta4);
        TextView t_respuesta5 = (TextView) findViewById(R.id.texto_respuesta5);
        TextView t_respuesta6 = (TextView) findViewById(R.id.texto_respuesta6);
        TextView t_respuesta7 = (TextView) findViewById(R.id.texto_respuesta7);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/chalkboard.ttf");

        categoria1.setTypeface(custom_font);
        categoria2.setTypeface(custom_font);
        categoria3.setTypeface(custom_font);
        categoria4.setTypeface(custom_font);
        categoria5.setTypeface(custom_font);
        categoria6.setTypeface(custom_font);
        categoria7.setTypeface(custom_font);
        categoria8.setTypeface(custom_font);
        categoria9.setTypeface(custom_font);
        categoria10.setTypeface(custom_font);

        t_respuesta1.setTypeface(custom_font);
        t_respuesta2.setTypeface(custom_font);
        t_respuesta3.setTypeface(custom_font);
        t_respuesta4.setTypeface(custom_font);
        t_respuesta5.setTypeface(custom_font);
        t_respuesta6.setTypeface(custom_font);
        t_respuesta7.setTypeface(custom_font);

    }
}
