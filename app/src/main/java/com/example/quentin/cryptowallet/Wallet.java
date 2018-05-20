package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Wallet extends Activity {

    ImageView logoDessus;
    ImageView logodessous;
    TextView soldeDollar;
    TextView nomDessus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        Intent in = this.getIntent();
        Bundle bundle = in.getExtras();

        Monnaie m =(Monnaie) bundle.getSerializable("coin");

        logoDessus = findViewById(R.id.imageView5);
        logodessous = findViewById(R.id.imageView7);
        logoDessus.setImageResource(m.getlogocoin());
        logodessous.setImageResource(m.getlogocoin());


        soldeDollar = findViewById(R.id.textView3);
        nomDessus = findViewById(R.id.textView2);

        soldeDollar.setText(m.getSoldeEnDollar());
        nomDessus.setText(m.getNom());

    }
}
