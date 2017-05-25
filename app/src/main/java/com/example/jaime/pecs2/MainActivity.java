package com.example.jaime.pecs2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button boton1 = (Button)findViewById(R.id.button1);
        Button boton2 = (Button)findViewById(R.id.button2);
        Button boton3 = (Button)findViewById(R.id.button3);
        TextView textViewmenu = (TextView)findViewById(R.id.textViewMenu);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/chalkboard.ttf");
        boton1.setTypeface(custom_font);
        boton2.setTypeface(custom_font);
        boton3.setTypeface(custom_font);
        textViewmenu.setTypeface(custom_font);

        Button boton_inicio = (Button) findViewById(R.id.button1);
        boton_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), PlayActivity.class);
                finish();
                view.getContext().startActivity(Intent);}
        });

    }
    }


