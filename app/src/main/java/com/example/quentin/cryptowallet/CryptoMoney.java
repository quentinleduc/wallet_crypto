package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CryptoMoney extends Activity {

    private  Monnaie m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_money);
        Intent in = this.getIntent();
        Bundle bundle = in.getExtras();

        m =(Monnaie) bundle.getSerializable("coin");

        ImageView logo = findViewById(R.id.imageView7);
        logo.setImageResource(m.getlogocoin());
        TextView nomCoin = findViewById(R.id.nomCoin);
        nomCoin.setText(m.getNom());
        TextView nomCoin2 = findViewById(R.id.textView2);
        nomCoin2.setText(m.getNom());
        TextView soldeDollar = findViewById(R.id.textView3);
        soldeDollar.setText(m.getSoldeEnDollar());
        ImageView retour = findViewById(R.id.imageView11);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        final EditText saisieCoin = findViewById(R.id.saisieCoin);
        final EditText saisieDollar = findViewById(R.id.saisieDollar);



        ImageView buy = findViewById(R.id.imageView10);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(CryptoMoney.this,Success.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("coin", m);
                bundle.putString("dollar",saisieDollar.getText().toString());
                bundle.putString("coinValeur",saisieCoin.getText().toString());
                in.putExtras(bundle);
                startActivity(in);
                finish();
            }
        });
    }
}
