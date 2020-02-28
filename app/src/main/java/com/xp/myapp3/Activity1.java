package com.xp.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity1 extends AppCompatActivity {
    Map<Integer, List<String>> lists;
    List<String> list;
    ArrayAdapter<String> stringArrayAdapter;

    @Override
    //创建
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_city);


        Spinner collarCtiy = findViewById(R.id.spinner_collar_city);
        Spinner city = findViewById(R.id.spinner_city);
        initData();

        //适配器 ,起连接作用
        stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        collarCtiy.setAdapter(stringArrayAdapter);

        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                list.clear();
                list.addAll(lists.get(position));
                stringArrayAdapter.notifyDataSetChanged();//可以在修改适配器绑定的数组后，不用重新刷新Activity,通知Activity更新spinner数据
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void initData() {
        lists = new HashMap<>();
        List<String> changsha = new ArrayList<>();
        changsha.add("芙蓉区");
        changsha.add("天心区");
        changsha.add("岳麓区");
        changsha.add("开福区");
        changsha.add("雨花区");
        List<String> beijing = new ArrayList<>();
        beijing.add("福田区");
        beijing.add("盐田区");
        beijing.add("南山区");
        beijing.add("宝安区");
        beijing.add("龙华区");
        beijing.add("龙岗区");
        List<String> shanghai = new ArrayList<>();
        shanghai.add("东城区");
        shanghai.add("西城区");
        shanghai.add("朝阳区");
        shanghai.add("海淀区");
        shanghai.add("通州区");
        lists.put(0, changsha);
        lists.put(1, beijing);
        lists.put(2, shanghai);
        list = new ArrayList<>();
        for (String s : lists.get(0)) {
            list.add(s);
        }
        System.out.println("initData");
    }
}