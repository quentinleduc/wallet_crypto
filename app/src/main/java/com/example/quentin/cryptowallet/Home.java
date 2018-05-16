package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ListView liste= findViewById(R.id.listMenu);
        ArrayList maListe = new ArrayList();
        maListe.add("Bitcoin");
        maListe.add("Ethereum");
        maListe.add("LiteCoin");
        maListe.add("Ripple");
        ArrayAdapter adt = new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,maListe);
        liste.setAdapter(adt);
    }
}
