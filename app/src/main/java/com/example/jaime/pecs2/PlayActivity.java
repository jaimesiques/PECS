package com.example.jaime.pecs2;

import android.app.Activity;
import android.content.ClipData;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayActivity extends Activity implements View.OnDragListener {

    private Drawable enterShape;
    private Drawable normalShape;
    View.OnTouchListener dragListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            // start move on a touch event
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            }
            return false;

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
        //normalShape = getResources().getDrawable(R.drawable.shape);

        Button categoria1 = (Button)findViewById(R.id.cat1);
        Button categoria2 = (Button)findViewById(R.id.cat2);
        Button categoria3 = (Button)findViewById(R.id.cat3);
        Button categoria4 = (Button)findViewById(R.id.cat4);
        Button categoria5 = (Button)findViewById(R.id.cat5);
        Button categoria6 = (Button)findViewById(R.id.cat6);
        Button categoria7 = (Button)findViewById(R.id.cat7);
        Button categoria8 = (Button)findViewById(R.id.cat8);
        Button categoria9 = (Button)findViewById(R.id.cat9);
        Button categoria10 = (Button)findViewById(R.id.cat10);

        TextView t_respuesta1 = (TextView)findViewById(R.id.texto_respuesta1);
        TextView t_respuesta2 = (TextView)findViewById(R.id.texto_respuesta2);
        TextView t_respuesta3 = (TextView)findViewById(R.id.texto_respuesta3);
        TextView t_respuesta4 = (TextView)findViewById(R.id.texto_respuesta4);
        TextView t_respuesta5 = (TextView)findViewById(R.id.texto_respuesta5);
        TextView t_respuesta6 = (TextView)findViewById(R.id.texto_respuesta6);
        TextView t_respuesta7 = (TextView)findViewById(R.id.texto_respuesta7);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/chalkboard.ttf");

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

        findViewById(R.id.gridPictogramasCategoria).setOnDragListener(this);
        findViewById(R.id.gridRespuestasPicrogramas).setOnDragListener(this);

        findViewById(R.id.myimage1).setOnTouchListener(dragListener);
        findViewById(R.id.myimage2).setOnTouchListener(dragListener);
        findViewById(R.id.myimage3).setOnTouchListener(dragListener);
        findViewById(R.id.myimage4).setOnTouchListener(dragListener);
    }

    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                // Do nothing
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                // Do nothing
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                // Do nothing
                break;
            case DragEvent.ACTION_DROP:
                // view dropped, reassign the view to the new ViewGroup
                View view = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) view.getParent();
                owner.removeView(view);
                GridLayout container = (GridLayout) v;
                container.addView(view);
                view.setVisibility(View.VISIBLE);

                break;
            case DragEvent.ACTION_DRAG_ENDED:
               // v.setBackground(normalShape);
            default:
                break;
        }
        return true;
    }
}
