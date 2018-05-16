package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private static int SPLASH_TIME_OUT = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Home.class);
                Log.i("Splash","time" + SPLASH_TIME_OUT);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
