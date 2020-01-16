package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "Snowballs.ttf");
        TextView titulo= (TextView) findViewById(R.id.textView);
        TextView bajo= (TextView) findViewById(R.id.textView2);
        titulo.setTypeface(mifuente);

        MediaPlayer mp = new MediaPlayer().create(this, R.raw.cumpleanos);
        mp.start();

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideup = AnimationUtils.loadAnimation(this, R.anim.slideup);
       bajo.startAnimation(slideup);


    }


}
