package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
//public class NewGame extends AppCompatActivity implements AdapterView.OnItemSelectedListener
public class NewGame extends AppCompatActivity{
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);




        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerScreen();

            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitScreen();

            }
        });

    }
    public void exitScreen(){
        Intent intentb2 = new Intent(this,ExitActivity.class);
        startActivity(intentb2);
    }

    public void playerScreen(){
        Intent intent = new Intent(this,PlayersScreen.class);
        startActivity(intent);
    }



}