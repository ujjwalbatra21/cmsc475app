package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayersScreen extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_screen);

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchExit();

            }
        });
    }

    public void switchExit(){
        Intent intent = new Intent(this, ExitActivity.class);
        startActivity(intent);
    }
}


/*over_under[i] = par[i]-score[i];
for(int i = 0; i<19; i++){
    totalScore +=score[i];
}

for(int i = 0; i<19; i++){
    totalPar +=par[i];
}

for(int i = 0; i<19; i++){
    totalOverUnder += over_under[i];
}*/
// every entry on the table per hole will be appended to the score array*/
