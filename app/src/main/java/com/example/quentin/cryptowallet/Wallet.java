package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
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

        final Monnaie m =(Monnaie) bundle.getSerializable("coin");

        logoDessus = findViewById(R.id.imageView5);
        logoDessus.setImageResource(m.getlogocoin());
        logoDessus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,CryptoMoney.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("coin", m);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });

        logodessous = findViewById(R.id.imageView7);
        logodessous.setImageResource(m.getlogocoin());


        soldeDollar = findViewById(R.id.textView3);
        nomDessus = findViewById(R.id.textView2);

        soldeDollar.setText(m.getSoldeEnDollar());
        nomDessus.setText(m.getNom());

        final ListView liste= findViewById(R.id.listTransactions);
        ListAdapter myAdapter2 = new MyAdapter2(Wallet.this);
        liste.setAdapter(myAdapter2);

        ImageButton ib = findViewById(R.id.imageButton);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
