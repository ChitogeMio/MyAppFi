package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreem extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=4000;

    View view1a,view2a,view3a,view4a,view5a,view6a;
    TextView txtWell,txtTo;

    ImageView img1a;

    Animation topAnimation, bottomAnimation,middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screem);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animatiom);


        view1a = findViewById(R.id.view1);
        view2a = findViewById(R.id.view2);
        view3a = findViewById(R.id.view3);
        view4a = findViewById(R.id.view4);
        view5a = findViewById(R.id.view5);
        view6a = findViewById(R.id.view6);

        txtWell = findViewById(R.id.textWell);
        txtTo = findViewById(R.id.textTo);

        img1a = findViewById(R.id.imageView1);

        view1a.setAnimation(topAnimation);
        view2a.setAnimation(topAnimation);
        view3a.setAnimation(topAnimation);
        view4a.setAnimation(topAnimation);
        view5a.setAnimation(topAnimation);
        view6a.setAnimation(topAnimation);

        txtTo.setAnimation(middleAnimation);
        txtWell.setAnimation(middleAnimation);

        img1a.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreem.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_TIME_OUT);

    }
}