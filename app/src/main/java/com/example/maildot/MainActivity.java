package com.example.maildot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        setContentView (R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation (this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation (this,R.anim.bottom_animation);

        image = findViewById (R.id.maildotImage);
        slogan = findViewById (R.id.textView);

        image.setAnimation (topAnim);
        slogan.setAnimation (bottomAnim);

        new Handler ().postDelayed (() -> {
            Intent intent = new Intent (MainActivity.this,Login.class);

            Pair[] pairs = new Pair[2];
            pairs[0] = new Pair<View,String>(image, "logo_image");
            pairs[1] = new Pair<View,String>(slogan, "logo_text");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation (MainActivity.this,pairs);
            startActivity (intent,options.toBundle ());

        },SPLASH_SCREEN);
    }
}





