package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlayersScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_screen);
    }
}

//public class Player{
//    public String playerName;
/*    public int[] par;
    public int[] over_under;
    public int totalScore, totalPar, totalOverUnder;
    public int[] score;
}
over_under[i] = par[i]-score[i];
for(int i = 0; i<19; i++){
    totalScore +=score[i];
}

for(int i = 0; i<19; i++){
    totalPar +=par[i];
}

for(int i = 0; i<19; i++){
    totalOverUnder += over_under[i];
}
// every entry on the table per hole will be appended to the score array*/
