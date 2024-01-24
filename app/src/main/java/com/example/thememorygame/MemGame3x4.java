package com.example.thememorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MemGame3x4 extends AppCompatActivity {
    ImageButton IB1x1, IB1x2, IB1x3, IB1x4, IB2x1, IB2x2, IB2x3, IB2x4, IB3x1, IB3x2, IB3x3, IB3x4;
    Button button;

    List<Integer> cards = new ArrayList<>();
    List<MemoryCard> memoryCards = new ArrayList<>();
    List<ImageButton> iButtons = new ArrayList<>();
    Integer cardCount = 0;
    Integer lastCard, curCard = null;
    private final Integer cardBack = R.drawable.blueback;

    private final String LogKey = "LogKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_game3x4);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(v -> openMain());

        Resources res = getResources();
        List<Integer> cards = new ArrayList<Integer>();

        cards.add(R.drawable.diamonds_king);
        cards.add(R.drawable.diamonds_king);
        cards.add(R.drawable.diamonds_queen);
        cards.add(R.drawable.diamonds_queen);
        cards.add(R.drawable.clubs_king);
        cards.add(R.drawable.clubs_king);
        cards.add(R.drawable.clubs_queen);
        cards.add(R.drawable.clubs_queen);
        cards.add(R.drawable.joker_red);
        cards.add(R.drawable.joker_red);
        cards.add(R.drawable.hearts_queen);
        cards.add(R.drawable.hearts_queen);

        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);

        iButtons.add(IB1x1 = findViewById(R.id.imageButton1x1));
        iButtons.add(IB1x2 = findViewById(R.id.imageButton1x2));
        iButtons.add(IB1x3 = findViewById(R.id.imageButton1x3));
        iButtons.add(IB1x4 = findViewById(R.id.imageButton1x4));

        iButtons.add(IB2x1 = findViewById(R.id.imageButton2x1));
        iButtons.add(IB2x2 = findViewById(R.id.imageButton2x2));
        iButtons.add(IB2x3 = findViewById(R.id.imageButton2x3));
        iButtons.add(IB2x4 = findViewById(R.id.imageButton2x4));

        iButtons.add(IB3x1 = findViewById(R.id.imageButton3x1));
        iButtons.add(IB3x2 = findViewById(R.id.imageButton3x2));
        iButtons.add(IB3x3 = findViewById(R.id.imageButton3x3));
        iButtons.add(IB3x4 = findViewById(R.id.imageButton3x4));

        for (int i = 0; i < cards.size(); i++) {
            memoryCards.add(new MemoryCard());
            memoryCards.get(i).setIdentifier(cards.get(i));
            if(memoryCards.get(i).face == null){
                memoryCards.get(i).setFace(false);
            }
            if(memoryCards.get(i).match == null){
                memoryCards.get(i).setMatch(false);
            }
        }

        IB1x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x1 clicked");
                curCard = 0;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();
            }
        });
        IB1x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x2 clicked");
                curCard = 1;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();
            }
        });
        IB1x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x3 clicked");
                curCard = 2;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();
            }
        });
        IB1x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button1x4 clicked");
                curCard = 3;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });


        IB2x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x1 clicked");
                curCard = 4;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
        IB2x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x2 clicked");
                curCard = 5;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
        IB2x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x3 clicked");
                curCard = 6;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });


        IB2x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button2x4 clicked");
                curCard = 7;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
        IB3x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x1 clicked");
                curCard = 8;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
        IB3x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x2 clicked");
                curCard = 9;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
        IB3x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x3 clicked");
                curCard = 10;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });

        IB3x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogKey, "Button3x4 clicked");
                curCard = 11;
                // Updating models
                updateModels(curCard);
                // Updating views;
                updateViews();

            }
        });
    }
    public void updateViews(){
        for (int i = 0; i < cards.size(); i++) {
            if (memoryCards.get(i).face){
                iButtons.get(i).setImageResource(cards.get(i));
            } else {
                iButtons.get(i).setImageResource(cardBack);
            }
        }
    }
    public void resetCards(){
        for (int i = 0; i < cards.size(); i++) {
            if (memoryCards.get(i).match){
                iButtons.get(i).setImageResource(cards.get(i));
            } else {
                iButtons.get(i).setImageResource(cardBack);
                memoryCards.get(i).face = false;
            }
        }
    }
    public void updateModels(Integer pos){

        if (memoryCards.get(pos).face) {
            Toast.makeText(this, "Please select face down card", Toast.LENGTH_SHORT).show();
            return;
        }

        // 0 or 2 cards previously selected
        if (lastCard == null){
            lastCard = pos;
        } // 1 card previously selected
        else {
            checkMatch(pos, lastCard);
            lastCard = null;
        }

        cardCount += 1;
        if (cardCount >= 2){
            resetCards();
        }

        memoryCards.get(pos).face = !memoryCards.get(pos).face;
        Toast.makeText(this, "Position: " + pos.toString() + " " + memoryCards.get(pos).face, Toast.LENGTH_SHORT).show();
        // 3 cases
        // 0 cards flipped - flip selected
        // 1 card flipped - flip selected and check for match
        // 2 cards flipped - reset and flip
    }

    public void checkMatch(Integer card1, Integer card2){
        if (Objects.equals(memoryCards.get(card1).identifier, memoryCards.get(card2).identifier)){
            memoryCards.get(card1).match = true;
            memoryCards.get(card2).match = true;
            iButtons.get(card1).setAlpha(0.1f);
            iButtons.get(card2).setAlpha(0.1f);
            Toast.makeText(this, "Match found!", Toast.LENGTH_SHORT).show();
        } else {
            resetCards();
        }
    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}