package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "navidad.ttf");
        TextView texto= (TextView) findViewById(R.id.textlogo);
        texto.setTypeface(mifuente);
        Animation an = AnimationUtils.loadAnimation(this, R.anim.splash);
        texto.startAnimation(an);

        an.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent it = new Intent(SplashActivity.this, MainActivity.class );
        startActivity(it);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
