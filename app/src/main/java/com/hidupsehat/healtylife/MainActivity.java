package com.hidupsehat.healtylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};

        v_flipper = findViewById(R.id.v_flipper);
/*
        for (int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }

 */
        for (int image : images) {
            flipperImages(image);
        }
    }
    void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, R.anim.slide_in_left);
        v_flipper.setInAnimation(this, R.anim.slide_out_right);

    }

    public void sendMessage(View view) {
    }
}
