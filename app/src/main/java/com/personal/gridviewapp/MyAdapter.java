package com.personal.gridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private int[] iconIDs;
    private LayoutInflater inflator;
    private String[] data;

    MyAdapter(Context context, String[] data, int[] iconIDs){
//        super(context, R.layout.grid_item, data);
        this.data = data;
        this.iconIDs = iconIDs;
        this.inflator = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return iconIDs.length;
    }

    @Override
    public Object getItem(int i) {
        return iconIDs[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup container) {
        if (convertView == null) {
            convertView = inflator.inflate(R.layout.grid_item, container, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textView = convertView.findViewById(R.id.text);
        imageView.setImageResource(iconIDs[i]);
        textView.setText(data[i]);

        return convertView;
    }
}
