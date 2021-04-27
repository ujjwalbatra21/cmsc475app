package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayersScreen extends AppCompatActivity {
    private Button button;
    public TextView scoreT;
    public int totalScore;
    public int scores[] = new int[18];

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

            /*******************
             * SCORE VARIABLES *
             *******************/
        TextView tv1 = (TextView)findViewById(R.id.Score1);
        TextView tv2 = (TextView)findViewById(R.id.Score2);
        TextView tv3 = (TextView)findViewById(R.id.Score3);
        TextView tv4 = (TextView)findViewById(R.id.Score4);
        TextView tv5 = (TextView)findViewById(R.id.Score5);
        TextView tv6 = (TextView)findViewById(R.id.Score6);
        TextView tv7 = (TextView)findViewById(R.id.Score7);
        TextView tv8 = (TextView)findViewById(R.id.Score8);
        TextView tv9 = (TextView)findViewById(R.id.Score9);
        TextView tv10 = (TextView)findViewById(R.id.Score10);
        TextView tv11 = (TextView)findViewById(R.id.Score11);
        TextView tv12 = (TextView)findViewById(R.id.Score12);
        TextView tv13 = (TextView)findViewById(R.id.Score13);
        TextView tv14 = (TextView)findViewById(R.id.Score14);
        TextView tv15 = (TextView)findViewById(R.id.Score15);
        TextView tv16 = (TextView)findViewById(R.id.Score16);
        TextView tv17 = (TextView)findViewById(R.id.Score17);
        TextView tv18 = (TextView)findViewById(R.id.Score18);

        int score1 = Integer.parseInt(tv1.getText().toString() + 0);
        int score2 = Integer.parseInt(tv2.getText().toString() + 0);
        int score3 = Integer.parseInt(tv3.getText().toString() + 0);
        int score4 = Integer.parseInt(tv4.getText().toString() + 0);
        int score5 = Integer.parseInt(tv5.getText().toString() + 0);
        int score6 = Integer.parseInt(tv6.getText().toString() + 0);
        int score7 = Integer.parseInt(tv7.getText().toString() + 0);
        int score8 = Integer.parseInt(tv8.getText().toString() + 0);
        int score9 = Integer.parseInt(tv9.getText().toString() + 0);
        int score10 = Integer.parseInt(tv10.getText().toString() + 0);
        int score11 = Integer.parseInt(tv11.getText().toString() + 0);
        int score12 = Integer.parseInt(tv12.getText().toString() + 0);
        int score13 = Integer.parseInt(tv13.getText().toString() + 0);
        int score14 = Integer.parseInt(tv14.getText().toString() + 0);
        int score15 = Integer.parseInt(tv15.getText().toString() + 0);
        int score16 = Integer.parseInt(tv16.getText().toString() + 0);
        int score17 = Integer.parseInt(tv17.getText().toString() + 0);
        int score18 = Integer.parseInt(tv18.getText().toString() + 0);
        scoreT = (TextView)findViewById(R.id.ScoreTotal);
        totalScore = 0;

        scores[0] = score1;
        scores[1] = score2;
        scores[2] = score3;
        scores[3] = score4;
        scores[4] = score5;
        scores[5] = score6;
        scores[6] = score7;
        scores[7] = score8;
        scores[8] = score9;
        scores[9] = score10;
        scores[10] = score11;
        scores[11] = score12;
        scores[12] = score13;
        scores[13] = score14;
        scores[14] = score15;
        scores[15] = score16;
        scores[16] = score17;
        scores[17] = score18;

            /*****************
             * PAR VARIABLES *
             *****************/
        TextView tvOU1 = (TextView)findViewById(R.id.OverUnder1);
        TextView tvOU2 = (TextView)findViewById(R.id.OverUnder2);
        TextView tvOU3 = (TextView)findViewById(R.id.OverUnder3);
        TextView tvOU4 = (TextView)findViewById(R.id.OverUnder4);
        TextView tvOU5 = (TextView)findViewById(R.id.OverUnder5);
        TextView tvOU6 = (TextView)findViewById(R.id.OverUnder6);
        TextView tvOU7 = (TextView)findViewById(R.id.OverUnder7);
        TextView tvOU8 = (TextView)findViewById(R.id.OverUnder8);
        TextView tvOU9 = (TextView)findViewById(R.id.OverUnder9);
        TextView tvOU10 = (TextView)findViewById(R.id.OverUnder10);
        TextView tvOU11 = (TextView)findViewById(R.id.OverUnder11);
        TextView tvOU12 = (TextView)findViewById(R.id.OverUnder12);
        TextView tvOU13 = (TextView)findViewById(R.id.OverUnder13);
        TextView tvOU14 = (TextView)findViewById(R.id.OverUnder14);
        TextView tvOU15 = (TextView)findViewById(R.id.OverUnder15);
        TextView tvOU16 = (TextView)findViewById(R.id.OverUnder16);
        TextView tvOU17 = (TextView)findViewById(R.id.OverUnder17);
        TextView tvOU18 = (TextView)findViewById(R.id.OverUnder18);

        int par1 = Integer.parseInt(tvOU1.getText().toString() + 0);
        int par2 = Integer.parseInt(tvOU2.getText().toString() + 0);
        int par3 = Integer.parseInt(tvOU3.getText().toString() + 0);
        int par4 = Integer.parseInt(tvOU4.getText().toString() + 0);
        int par5 = Integer.parseInt(tvOU5.getText().toString() + 0);
        int par6 = Integer.parseInt(tvOU6.getText().toString() + 0);
        int par7 = Integer.parseInt(tvOU7.getText().toString() + 0);
        int par8 = Integer.parseInt(tvOU8.getText().toString() + 0);
        int par9 = Integer.parseInt(tvOU9.getText().toString() + 0);
        int par10 = Integer.parseInt(tvOU10.getText().toString() + 0);
        int par11 = Integer.parseInt(tvOU11.getText().toString() + 0);
        int par12 = Integer.parseInt(tvOU12.getText().toString() + 0);
        int par13 = Integer.parseInt(tvOU13.getText().toString() + 0);
        int par14 = Integer.parseInt(tvOU14.getText().toString() + 0);
        int par15 = Integer.parseInt(tvOU15.getText().toString() + 0);
        int par16 = Integer.parseInt(tvOU16.getText().toString() + 0);
        int par17 = Integer.parseInt(tvOU17.getText().toString() + 0);
        int par18 = Integer.parseInt(tvOU18.getText().toString() + 0);

        for (int i = 0; i < scores.length; i++){
            totalScore += scores[i];
            //scoreT.setText(String.valueOf(totalScore));
        }
        updateTotalScore();

    }

    public void switchExit(){
        Intent intent = new Intent(this, ExitActivity.class);
        startActivity(intent);
    }

    void updateTotalScore(){
            scoreT.setText(String.valueOf(totalScore));
    }

}