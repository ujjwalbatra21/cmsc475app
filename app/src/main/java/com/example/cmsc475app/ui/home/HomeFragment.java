package com.example.cmsc475app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cmsc475app.ExitActivity;
import com.example.cmsc475app.NewGame;
import com.example.cmsc475app.PlayersScreen;
import com.example.cmsc475app.R;

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

public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button button,button2,button5;
    LinearLayout layout_list;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        super.onCreate(savedInstanceState);

        layout_list = root.findViewById(R.id.layout_list);
        button5 = root.findViewById(R.id.button5);
        button5.setOnClickListener(this);
//
//
        button = (Button) root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerScreen();

            }
        });
        button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitScreen();

            }
        });
        return root;
    }
    public void exitScreen(){
        Intent intentb2 = new Intent(getActivity(), ExitActivity.class);
        startActivity(intentb2);
    }

    public void playerScreen(){
        Intent intent = new Intent(getActivity(), PlayersScreen.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        addView();
    }
    private void addView(){

        View newplayerView = getLayoutInflater().inflate(R.layout.row_add_players,null,false);
        EditText editText = (EditText)newplayerView.findViewById(R.id.player_name);
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