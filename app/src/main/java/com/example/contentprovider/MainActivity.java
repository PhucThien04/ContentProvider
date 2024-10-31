package com.example.contentprovider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }

    private void addEvent(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy();
            }
        });
    }

    private void xuLy() {
        Intent intent = new Intent(MainActivity.this, Message_Layout.class);
        startActivity(intent);
    }

    private void addControl(){
        btn = findViewById(R.id.btnmessage);
    }
}
