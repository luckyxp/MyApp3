package com.xp.myapp3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xp.myapp3.R;

import java.util.List;

public class myAdapter extends BaseAdapter {
    Context context;
    List<String> list;

    public myAdapter(Context context, List list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list_data, parent, false);
        TextView tv_item_center = convertView.findViewById(R.id.tv_item_center);
        TextView tv_item_right = convertView.findViewById(R.id.tv_item_right);
        tv_item_center.setText("center:" + list.get(position));
        tv_item_right.setText(list.get(position));
        return convertView;
    }
}
