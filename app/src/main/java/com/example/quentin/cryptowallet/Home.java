package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Home extends Activity {

    private ImageView logoCoin ;
    private ImageView logoValeur ;
    private TextView nom ;
    private TextView soldeEnCoin ;
    private TextView soldeEnDollar ;
    private TextView valeurCoin ;
    private Monnaie m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logoCoin = findViewById(R.id.imageView);
         logoValeur = findViewById(R.id.imageView8);
         nom = findViewById(R.id.monTexte);
        soldeEnCoin =findViewById(R.id.textView3);
        soldeEnDollar = findViewById(R.id.textView6);
        valeurCoin = findViewById(R.id.textView7);

        final ListView liste= findViewById(R.id.listMenu);


        ListAdapter myAdapter = new MyAdapter(Home.this);
        liste.setAdapter(myAdapter);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Log.i("valeur",""+R.drawable.bitcoin);
                        m = new Monnaie("Bitcoin",R.drawable.bitcoin,R.drawable.flechevertehaute,"$1233.45"
                        ,"12.41%","0,00041");
                        Log.i("valeur de m solde : ",m.getSoldeEnDollar());
                        break;
                    case 1:
                        m = new Monnaie("Ethereum",R.drawable.ethereum,R.drawable.flechevertehaute,"$8900.34"
                                ,"09.10%","2,45670");
                        break;
                    case 2:
                        m = new Monnaie("LiteCoin",R.drawable.litecoin,R.drawable.flecherougebas,"$21000.25"
                                ,"02.21%","125,50");
                        break;
                    case 3:
                        m = new Monnaie("Ripple",R.drawable.ripple,R.drawable.flechevertehaute,"$345.00"
                                ,"12.41%","5,2100");
                        break;
                }
                Intent in = new Intent(Home.this,Wallet.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("coin", m);
                in.putExtras(bundle);
                startActivity(in);
            }
        });
    }
}
