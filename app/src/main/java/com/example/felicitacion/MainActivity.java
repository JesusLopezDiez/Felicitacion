package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "Snowballs.ttf");
        TextView titulo= (TextView) findViewById(R.id.textView);
        titulo.setTypeface(mifuente);

        MediaPlayer mp = new MediaPlayer().create(this, R.raw.cumpleanos);
        mp.start();


    }


}
