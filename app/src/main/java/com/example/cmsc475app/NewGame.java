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


    @Override
    public void onClick(View view) {
           addView();
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
            Toast.makeText(this,"First Player",Toast.LENGTH_SHORT).show();
            layout_list.addView(newplayerView);



    }
    private void removeView(View view){
        Toast.makeText(this,"Only 4 Players Allowed!",Toast.LENGTH_SHORT).show();
        layout_list.removeView(view);



    }
}