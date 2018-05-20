package com.example.quentin.cryptowallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
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

class MyAdapter2 extends BaseAdapter{

    private final Activity context;

    public MyAdapter2(Activity mainActivity) {
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
            v = inflater.inflate(R.layout.mon_exemple2, null);
        } else {
            v = convertView;
        }
        ImageView image = v.findViewById(R.id.logo);
        TextView date = v.findViewById(R.id.date);
        TextView etat = v.findViewById(R.id.etat);
        TextView soldeCoin = v.findViewById(R.id.soldeCoin);
        TextView soldeDollar = v.findViewById(R.id.soldeDollar);
        switch (i){
            case 0:
                image.setImageResource(R.drawable.oval10);
                date.setText("Sep 25, 2017");
                etat.setText("Sold");
                soldeDollar.setText("$1233.45");
                soldeCoin.setTextColor(Color.RED);
                soldeCoin.setText("0.00034");
                break;
            case 1:
                image.setImageResource(R.drawable.oval10copy);
                date.setText("Sep 25, 2017");
                etat.setText("Bought");
                soldeDollar.setText("$800.50");
                soldeCoin.setText("0000500");
                soldeCoin.setTextColor(Color.GREEN);
                break;
            case 2:
                image.setImageResource(R.drawable.oval10);
                date.setText("Sep 25, 2017");
                etat.setText("Sold");
                soldeDollar.setText("$1233.45");
                soldeCoin.setTextColor(Color.RED);
                soldeCoin.setText("0.00034");
                break;
            case 3:
                image.setImageResource(R.drawable.oval10copy);
                date.setText("Sep 25, 2017");
                etat.setText("Bought");
                soldeDollar.setText("$800.50");
                soldeCoin.setText("0000500");
                soldeCoin.setTextColor(Color.GREEN);
                break;
        }


        return v;
    }

}
