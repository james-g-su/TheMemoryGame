package com.example.thememorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button, button34, button44, button54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMG34();
            }
        });

        button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMG44();
            }
        });

        button54 = (Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMG54();
            }
        });
    }

    public void openMG34() {
        Intent intent = new Intent(this, MemGame3x4.class);
        startActivity(intent);
    }

    public void openMG44() {
        Intent intent = new Intent(this, MemGame4x4.class);
        startActivity(intent);
    }

    public void openMG54() {
        Intent intent = new Intent(this, MemGame5x4.class);
        startActivity(intent);
    }
}