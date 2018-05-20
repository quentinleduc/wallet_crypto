package com.example.quentin.cryptowallet;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Success extends Activity {

    private Monnaie m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent in = this.getIntent();
        Bundle bundle = in.getExtras();

        m =(Monnaie) bundle.getSerializable("coin");
        String dollarV = bundle.getString("dollar");
        String coinV = bundle.getString("coinValeur");
        ImageView logo = findViewById(R.id.imageView13);
        logo.setImageResource(m.getlogocoin());
        ImageView retour = findViewById(R.id.imageView11);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView nom = findViewById(R.id.nomCoin);
        nom.setText(m.getNom());
        TextView dollar = findViewById(R.id.dollar);
        dollar.setText(dollarV);
        TextView coin = findViewById(R.id.coin);
        coin.setTextSize(10);
        coin.setText(coinV);
    }
}
