package com.example.ch02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bigger,smaller;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bigger=(Button)findViewById(R.id.bigger);
        smaller=(Button)findViewById(R.id.smaller);
        textView=(TextView)findViewById(R.id.tv);
    }

    int size=30;
    public void bigger(View v){
        textView.setTextSize(++size);
    }

    public void smaller(View v){
        if (size>30){
            textView.setTextSize(--size);
        }
    }
}