package com.xp.myapp3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    //创建
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);
        Log.i("MainActivity", " onCreate========创建");
    }

    @Override
    //开始
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", " onStart========开始");
    }

    @Override
    //重新开始
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", " onRestart========重新开始");
    }

    @Override
    //重绘
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", " onResume========重绘");
    }

    @Override
    //暂停
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", " onPause========暂停");
    }

    @Override
    //停止
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", " onStop========停止");
    }

    @Override
    //销毁
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", " onDestroy========销毁");
    }

    public void cityClick(View view) {
        startActivity(new Intent(this,Activity1.class));
    }
    public void listClick(View view) {
        startActivity(new Intent(this,Activity2.class));
    }
    public void loginClick(View view) {
        startActivity(new Intent(this,Activity3.class));
    }
}

