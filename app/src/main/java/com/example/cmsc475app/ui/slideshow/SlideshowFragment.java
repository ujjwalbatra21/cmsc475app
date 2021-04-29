package com.example.cmsc475app.ui.slideshow;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cmsc475app.ExitActivity;
import com.example.cmsc475app.NewGame;
import com.example.cmsc475app.R;

public class SlideshowFragment extends Fragment {
    private Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        super.onCreate(savedInstanceState);

        button = (Button) root.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchNewGame();

            }
        });
        return root;
    }

    public void switchNewGame(){
        Intent intent = new Intent(getActivity(), NewGame.class);
        startActivity(intent);
    }



}