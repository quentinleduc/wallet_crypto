package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

class MyAdapter extends BaseAdapter{

    private final Activity context;

    public MyAdapter(Activity mainActivity) {
        context  = mainActivity;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v;
        if (convertView == null) {
            v = inflater.inflate(R.layout.mon_exemple, null);
        } else {
            v = convertView;
        }
        ImageView image = v.findViewById(R.id.imageView);
        ImageView imagePourcent = v.findViewById(R.id.imageView8);
        TextView texte = v.findViewById(R.id.monTexte);
        TextView prix = v.findViewById(R.id.textView3);
        TextView prix2 = v.findViewById(R.id.textView6);
        TextView pourcentage = v.findViewById(R.id.textView7);
        switch (i){
            case 0:
                image.setImageResource(R.drawable.bitcoin);
                texte.setText("Bitcoin");
                prix.setText("0,00041");
                prix2.setText("$1233.45");
                pourcentage.setText("12.41%");
                imagePourcent.setImageResource(R.drawable.flechevertehaute);
                break;
            case 1:
                image.setImageResource(R.drawable.ethereum);
                texte.setText("Ethereum");
                prix.setText("2,45670");
                prix2.setText("$8900.34");
                pourcentage.setText("09.10%");
                imagePourcent.setImageResource(R.drawable.flechevertehaute);
                break;
            case 2:
                image.setImageResource(R.drawable.litecoin);
                texte.setText("LiteCoin");
                prix.setText("125,50");
                prix2.setText("$21000.25");
                pourcentage.setText("02.21%");
                imagePourcent.setImageResource(R.drawable.flecherougebas);
                break;
            case 3:
            image.setImageResource(R.drawable.ripple);
                texte.setText("Ripple");
                prix.setText("5,2100");
                prix2.setText("$345.00");
                pourcentage.setText("12.41%");
                imagePourcent.setImageResource(R.drawable.flechevertehaute);
            break;
        }


        return v;
    }
}
