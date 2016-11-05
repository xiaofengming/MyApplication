package com.example.administrator.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"xiaofengming!",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"hello world!",Toast.LENGTH_SHORT).show();
    }
}
