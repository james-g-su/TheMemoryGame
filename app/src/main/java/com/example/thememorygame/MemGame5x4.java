package com.example.thememorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class MemGame5x4 extends AppCompatActivity {

    ImageButton IB1x1, IB1x2, IB1x3, IB1x4, IB2x1, IB2x2, IB2x3, IB2x4, IB3x1, IB3x2, IB3x3, IB3x4, IB4x1, IB4x2, IB4x3, IB4x4, IB5x1, IB5x2, IB5x3, IB5x4;
    Button button;

    private final String LogKey = "LogKey";
    private Integer score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_game5x4);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(v -> openMain());

        Resources res = getResources();
        Integer dking = R.drawable.diamonds_king;
        Integer dqueen = R.drawable.diamonds_queen;
        Integer cking = R.drawable.clubs_king;
        Integer cqueen = R.drawable.clubs_queen;
        Integer hking = R.drawable.hearts_king;
        Integer hqueen = R.drawable.hearts_queen;
        Integer sking = R.drawable.spades_king;
        Integer squeen = R.drawable.spades_queen;
        Integer bjoker = R.drawable.joker_black;
        Integer rjoker = R.drawable.joker_red;


        List<Integer> cards = new ArrayList<Integer>();

        cards.add(cking);
        cards.add(cqueen);
        cards.add(sking);
        cards.add(squeen);
        cards.add(cking);
        cards.add(cqueen);
        cards.add(sking);
        cards.add(squeen);

        cards.add(cking);
        cards.add(cqueen);
        cards.add(sking);
        cards.add(squeen);
        cards.add(cking);
        cards.add(cqueen);
        cards.add(sking);
        cards.add(squeen);

        cards.add(bjoker);
        cards.add(rjoker);

        cards.add(bjoker);
        cards.add(rjoker);

        Collections.shuffle(cards);

        IB1x1 = findViewById(R.id.imageButton1x1);
        IB1x2 = findViewById(R.id.imageButton1x2);
        IB1x3 = findViewById(R.id.imageButton1x3);
        IB1x4 = findViewById(R.id.imageButton1x4);

        IB2x1 = findViewById(R.id.imageButton2x1);
        IB2x2 = findViewById(R.id.imageButton2x2);
        IB2x3 = findViewById(R.id.imageButton2x3);
        IB2x4 = findViewById(R.id.imageButton2x4);

        IB3x1 = findViewById(R.id.imageButton3x1);
        IB3x2 = findViewById(R.id.imageButton3x2);
        IB3x3 = findViewById(R.id.imageButton3x3);
        IB3x4 = findViewById(R.id.imageButton3x4);

        IB4x1 = findViewById(R.id.imageButton4x1);
        IB4x2 = findViewById(R.id.imageButton4x2);
        IB4x3 = findViewById(R.id.imageButton4x3);
        IB4x4 = findViewById(R.id.imageButton4x4);

        IB5x1 = findViewById(R.id.imageButton5x1);
        IB5x2 = findViewById(R.id.imageButton5x2);
        IB5x3 = findViewById(R.id.imageButton5x3);
        IB5x4 = findViewById(R.id.imageButton5x4);



        IB1x1 = findViewById(R.id.imageButton1x1);
        IB1x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IB1x1.setImageResource(cards.get(0));
            }
        });
        IB1x2 = findViewById(R.id.imageButton1x2);
        IB1x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x2 clicked");
                IB1x2.setImageResource(cards.get(1));
            }
        });

        IB1x3 = findViewById(R.id.imageButton1x3);
        IB1x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x3 clicked");
                IB1x3.setImageResource(cards.get(2));
            }
        });

        IB1x4 = findViewById(R.id.imageButton1x4);
        IB1x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x4 clicked");
                IB1x4.setImageResource(cards.get(3));
            }
        });


        IB2x1 = findViewById(R.id.imageButton2x1);
        IB2x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x1 clicked");
                IB2x1.setImageResource(cards.get(4));
            }
        });

        IB2x2 = findViewById(R.id.imageButton2x2);
        IB2x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x2 clicked");
                IB2x2.setImageResource(cards.get(5));
            }
        });

        IB2x3 = findViewById(R.id.imageButton2x3);
        IB2x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x3 clicked");
                IB2x3.setImageResource(cards.get(6));
            }
        });

        IB2x4 = findViewById(R.id.imageButton2x4);
        IB2x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x4 clicked");
                IB2x4.setImageResource(cards.get(7));
            }
        });


        IB3x1 = findViewById(R.id.imageButton3x1);
        IB3x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x1 clicked");
                IB3x1.setImageResource(cards.get(8));
            }
        });

        IB3x2 = findViewById(R.id.imageButton3x2);
        IB3x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x2 clicked");
                IB3x2.setImageResource(cards.get(9));
            }
        });

        IB3x3 = findViewById(R.id.imageButton3x3);
        IB3x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x3 clicked");
                IB3x3.setImageResource(cards.get(10));
            }
        });

        IB3x4 = findViewById(R.id.imageButton3x4);
        IB3x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x4 clicked");
                IB3x4.setImageResource(cards.get(11));
            }
        });


        IB4x1 = findViewById(R.id.imageButton4x1);
        IB4x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button4x1 clicked");
                IB4x1.setImageResource(cards.get(12));
            }
        });

        IB4x2 = findViewById(R.id.imageButton4x2);
        IB4x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button4x2 clicked");
                IB4x2.setImageResource(cards.get(13));
            }
        });

        IB4x3 = findViewById(R.id.imageButton4x3);
        IB4x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button4x3 clicked");
                IB4x3.setImageResource(cards.get(14));
            }
        });

        IB4x4 = findViewById(R.id.imageButton4x4);
        IB4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button4x4 clicked");
                IB4x4.setImageResource(cards.get(15));
            }
        });


        IB5x1 = findViewById(R.id.imageButton5x1);
        IB5x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button5x1 clicked");
                IB5x1.setImageResource(cards.get(16));
            }
        });

        IB5x2 = findViewById(R.id.imageButton5x2);
        IB5x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button5x2 clicked");
                IB5x2.setImageResource(cards.get(17));
            }
        });

        IB5x3 = findViewById(R.id.imageButton5x3);
        IB5x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button5x3 clicked");
                IB5x3.setImageResource(cards.get(18));
            }
        });

        IB5x4 = findViewById(R.id.imageButton5x4);
        IB5x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button5x4 clicked");
                IB5x4.setImageResource(cards.get(19));
            }
        });

    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

