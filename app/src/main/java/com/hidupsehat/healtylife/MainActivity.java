package com.hidupsehat.healtylife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    /* -------------------------------de------------------------------------*/
    ViewFlipper v_flipper;
    private CardView notif, setting, video, info;
    /* -------------------------------en de------------------------------------*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView;
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        /* -------------------------------notification------------------------------------*/
        notif = findViewById(R.id.cvnotif);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Notification.class);
                startActivity(i);
            }});
        /* -----------------------------end notification--------------------------------------*/
        /* -------------------------------setting------------------------------------*/
        setting = findViewById(R.id.cvsetting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Setting.class);
                startActivity(i);
            }});
        /* -----------------------------end setting--------------------------------------*/
        /* -------------------------------video------------------------------------*/
        video = findViewById(R.id.cvvideo);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Video.class);
                startActivity(i);
            }});
        /* -----------------------------end video--------------------------------------*/
        /* -------------------------------information------------------------------------*/
        info = findViewById(R.id.cvinfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Information.class);
                startActivity(i);
            }});
        /* -----------------------------end information--------------------------------------*/
        /* -----------------------------view flipper--------------------------------------*/
        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
        v_flipper = findViewById(R.id.v_flipper);
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
        /* -----------------------------end flipper--------------------------------------*/


    public void sendMessage(View view) {
    }
}
