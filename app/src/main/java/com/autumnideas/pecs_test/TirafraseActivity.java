package com.autumnideas.pecs_test;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by jaimearavena on 18-12-17.
 */

public class TirafraseActivity extends AppCompatActivity {

    TextToSpeech tts;

    String textoCompleto;

    CardView tirafrase_card1;
    CardView tirafrase_card2;
    CardView tirafrase_card3;
    CardView tirafrase_card4;
    CardView tirafrase_card5;
    CardView tirafrase_card6;

    ImageView tirafrase_image1;
    ImageView tirafrase_image2;
    ImageView tirafrase_image3;
    ImageView tirafrase_image4;
    ImageView tirafrase_image5;
    ImageView tirafrase_image6;

    TextView tirafrase_texto1;
    TextView tirafrase_texto2;
    TextView tirafrase_texto3;
    TextView tirafrase_texto4;
    TextView tirafrase_texto5;
    TextView tirafrase_texto6;

    ArrayList<PictoTirafrase> tirafrase;
    ArrayList<Tirafrase> tirafrase_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirafrase);

        tirafrase = new ArrayList<PictoTirafrase>();
        tirafrase_layout = new ArrayList<Tirafrase>();

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");

        //region Inicializo Variables

        tirafrase_card1 = findViewById(R.id.tirafrase_card_1);
        tirafrase_card2 = findViewById(R.id.tirafrase_card_2);
        tirafrase_card3 = findViewById(R.id.tirafrase_card_3);
        tirafrase_card4 = findViewById(R.id.tirafrase_card_4);
        tirafrase_card5 = findViewById(R.id.tirafrase_card_5);
        tirafrase_card6 = findViewById(R.id.tirafrase_card_6);

        tirafrase_image1 = findViewById(R.id.tirafrase_image_1);
        tirafrase_image2 = findViewById(R.id.tirafrase_image_2);
        tirafrase_image3 = findViewById(R.id.tirafrase_image_3);
        tirafrase_image4 = findViewById(R.id.tirafrase_image_4);
        tirafrase_image5 = findViewById(R.id.tirafrase_image_5);
        tirafrase_image6 = findViewById(R.id.tirafrase_image_6);

        tirafrase_texto1 = findViewById(R.id.tirafrase_text_1);
        tirafrase_texto2 = findViewById(R.id.tirafrase_text_2);
        tirafrase_texto3 = findViewById(R.id.tirafrase_text_3);
        tirafrase_texto4 = findViewById(R.id.tirafrase_text_4);
        tirafrase_texto5 = findViewById(R.id.tirafrase_text_5);
        tirafrase_texto6 = findViewById(R.id.tirafrase_text_6);

        //endregion


        //region onClick Imagenes

        tirafrase_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto1.getText().toString());
                                Log.e("texto", tirafrase_texto1.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });


        tirafrase_card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto2.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });

        tirafrase_card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto3.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });

        tirafrase_card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto4.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });

        tirafrase_card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto5.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });

        tirafrase_card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Locale locSpanish = new Locale("spa", "MEX");
                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            int result = tts.setLanguage(locSpanish);
                            if (result == TextToSpeech.LANG_MISSING_DATA ||
                                    result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                Log.e("error", "This Language is not supported");
                            } else {
                                ConvertTextToSpeech(tirafrase_texto6.getText().toString());
                            }
                        } else
                            Log.e("error", "Initilization Failed!");
                    }
                });
                tts.setLanguage(locSpanish);
            }
        });


        //endregion


        initalizeLayout();
        loadData(args);

        asignData();

        armarFrase();
    }

    private void ConvertTextToSpeech(String text) {
        // TODO Auto-generated method stub
        if (text == null || "".equals(text)) {
            text = "";
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        } else
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    private void initalizeLayout() {

        Tirafrase slot = new Tirafrase(tirafrase_image1, tirafrase_texto1, false);
        tirafrase_layout.add(slot);

        slot = new Tirafrase(tirafrase_image2, tirafrase_texto2, false);
        tirafrase_layout.add(slot);

        slot = new Tirafrase(tirafrase_image3, tirafrase_texto3, false);
        tirafrase_layout.add(slot);

        slot = new Tirafrase(tirafrase_image4, tirafrase_texto4, false);
        tirafrase_layout.add(slot);

        slot = new Tirafrase(tirafrase_image5, tirafrase_texto5, false);
        tirafrase_layout.add(slot);

        slot = new Tirafrase(tirafrase_image6, tirafrase_texto6, false);
        tirafrase_layout.add(slot);
    }

    private void loadData(Bundle args) {

        for (int i = 0; i <= 5; i++) {

            if (args.getString("title" + i) != null) {

                Log.e("i ?", "i : " + i);

                int foto = args.getInt("image" + i);
                String titulo = args.getString("title" + i);

                PictoTirafrase pictoTirafrase = new PictoTirafrase(foto, titulo, true);

                tirafrase.add(pictoTirafrase);
            }
        }
    }

    private void asignData() {

        for (int i = 0; i < tirafrase.size(); i++) {

            if (!tirafrase_layout.get(i).getStatus()) {
                tirafrase_layout.get(i).setStatus(true);
                tirafrase_layout.get(i).getImagen().setImageResource(tirafrase.get(i).getImage());
                tirafrase_layout.get(i).getNombre().setText(tirafrase.get(i).getName());
            }
        }
    }

    public void backMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }

    public void armarFrase() {
        if (!tirafrase_texto1.getText().toString().equals("")) {
            textoCompleto = tirafrase_texto1.getText().toString();
            textoCompleto = textoCompleto + " ";
            textoCompleto = textoCompleto + " ";
            if (!tirafrase_texto2.getText().toString().equals("")) {
                textoCompleto = textoCompleto + tirafrase_texto2.getText().toString();
                textoCompleto = textoCompleto + " ";
                textoCompleto = textoCompleto + " ";
                if (!tirafrase_texto3.getText().toString().equals("")) {
                    textoCompleto = textoCompleto + tirafrase_texto3.getText().toString();
                    textoCompleto = textoCompleto + " ";
                    textoCompleto = textoCompleto + " ";
                    if (!tirafrase_texto4.getText().toString().equals("")) {
                        textoCompleto = textoCompleto + tirafrase_texto4.getText().toString();
                        textoCompleto = textoCompleto + " ";
                        textoCompleto = textoCompleto + " ";
                        if (!tirafrase_texto5.getText().toString().equals("")) {
                            textoCompleto = textoCompleto + tirafrase_texto5.getText().toString();
                            textoCompleto = textoCompleto + " ";
                            textoCompleto = textoCompleto + " ";
                            if (!tirafrase_texto6.getText().toString().equals("")) {
                                textoCompleto = textoCompleto + tirafrase_texto6.getText().toString();
                            }
                        }
                    }
                }
            }
        }
    }

    public void reproducirFrase(View view) {
        final Locale locSpanish = new Locale("spa", "MEX");
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                // TODO Auto-generated method stub
                if(status == TextToSpeech.SUCCESS){
                    int result=tts.setLanguage(locSpanish);
                    if(result==TextToSpeech.LANG_MISSING_DATA ||
                            result==TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("error", "This Language is not supported");
                    }
                    else{
                        ConvertTextToSpeech(textoCompleto);
                    }
                }
                else
                    Log.e("error", "Initilization Failed!");
            }
        });
        tts.setLanguage(locSpanish);
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
        return;
    }
}
