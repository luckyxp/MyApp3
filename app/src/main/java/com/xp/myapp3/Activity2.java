package com.xp.myapp3;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.xp.myapp3.adapter.myAdapter;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Context context; //Activity父类
    List<String> list = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_view);
        initData();
        context = this;
        ListView list_items = findViewById(R.id.list_items);
        myAdapter myAdapter = new myAdapter(context, list);
        list_items.setAdapter(myAdapter);
        list_items.setOnItemClickListener(this);
    }
    private void initData() {
        for (int i = 0; i < 50; i++) {
            list.add("数据 :" + i);  //0-49
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(context, "点击了"+list.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

