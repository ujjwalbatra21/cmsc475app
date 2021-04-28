package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
//public class NewGame extends AppCompatActivity implements AdapterView.OnItemSelectedListener
public class NewGame extends AppCompatActivity implements View.OnClickListener {
    private Button button,button2,button5;
    LinearLayout layout_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        layout_list =findViewById(R.id.layout_list);
        button5 =findViewById(R.id.button5);
        button5.setOnClickListener(this);


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

    int i = 0;
    @Override
    public void onClick(View view) {
        if (i == 0) {
            addView();
            Toast.makeText(getApplicationContext(),"First Player",Toast.LENGTH_SHORT).show();
            i = 1;
        }
        else if (i == 1) {
            //i++;
            addView();
            Toast.makeText(getApplicationContext(),"First Player",Toast.LENGTH_SHORT).show();
            i = 2;
        }
        if (i == 2) {
            //i++;
            addView();
            Toast.makeText(getApplicationContext(),"Second Player",Toast.LENGTH_SHORT).show();
        }
        if (i == 3) {
            //i++;
            addView();
            Toast.makeText(getApplicationContext(),"Third Player",Toast.LENGTH_SHORT).show();
        }
        if (i == 4) {
            //i++;
            addView();
            Toast.makeText(getApplicationContext(),"Fourth Player",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Only 4 Players Allowed!",Toast.LENGTH_SHORT).show();
        }
    }
    private void addView() {

            View newplayerView = getLayoutInflater().inflate(R.layout.row_add_players, null, false);
            EditText editText = (EditText) newplayerView.findViewById(R.id.player_name);
            //TextView playerstandingText = (TextView)newplayerView.findViewById(R.id.player_standing);
            ImageView imageclose = (ImageView) newplayerView.findViewById(R.id.image_remove);

            imageclose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    removeView(newplayerView);
                }
            });
            layout_list.addView(newplayerView);
    }
    private void removeView(View view){
        layout_list.removeView(view);


    }
}