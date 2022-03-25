package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Animation imgin,imgout;
    Button btkJoinIn;

    private void anh_xa_a()
    {
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFliper);
        btkJoinIn   = (Button) findViewById(R.id.buttonJoinIn);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anh_xa_a();

        imgin = AnimationUtils.loadAnimation(this,R.anim.file_in);
        imgout= AnimationUtils.loadAnimation(this,R.anim.file_out);

        viewFlipper.setInAnimation(imgin);
        viewFlipper.setOutAnimation(imgout);

        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        btkJoinIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_JoinIn = new Intent();
                intent_JoinIn.setClass(MainActivity.this,LoginPage.class);
                startActivity(intent_JoinIn);
            }
        });



    }


}