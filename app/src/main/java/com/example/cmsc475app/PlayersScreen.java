package com.example.cmsc475app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class PlayersScreen extends AppCompatActivity {
    private Button button;
    private TextView total_Score;
    private TextView total_Par;
    private TextView totalOv_under;
    private TextView o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18;
    private EditText s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18;
    private EditText p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
    private int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18, scoresum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_screen);

        button = (Button) findViewById(R.id.button6);
        total_Score = (TextView) findViewById(R.id.total_score);
        total_Par = (TextView) findViewById(R.id.total_par);
        totalOv_under = (TextView) findViewById(R.id.totalOvUn);
        o1 = (TextView) findViewById(R.id.over_one);
        o2 = (TextView) findViewById(R.id.over_two);
        o3 = (TextView) findViewById(R.id.over_three);
        o4 = (TextView) findViewById(R.id.over_four);
        o5 = (TextView) findViewById(R.id.over_five);
        o6 = (TextView) findViewById(R.id.over_six);
        o7 = (TextView) findViewById(R.id.over_seven);
        o8 = (TextView) findViewById(R.id.over_eight);
        o9 = (TextView) findViewById(R.id.over_nine);
        o10 = (TextView) findViewById(R.id.over_ten);
        o11 = (TextView) findViewById(R.id.over_eleven);
        o12 = (TextView) findViewById(R.id.over_twelve);
        o13 = (TextView) findViewById(R.id.over_thirteen);
        o14 = (TextView) findViewById(R.id.over_fourteen);
        o15 = (TextView) findViewById(R.id.over_fifteen);
        o16 = (TextView) findViewById(R.id.over_sixteen);
        o17 = (TextView) findViewById(R.id.over_seventeen);
        o18 = (TextView) findViewById(R.id.over_eighteen);
        s1 = (EditText) findViewById(R.id.score_one);
        s2 = (EditText) findViewById(R.id.score_two);
        s3 = (EditText) findViewById(R.id.score_three);
        s4 = (EditText) findViewById(R.id.score_four);
        s5 = (EditText) findViewById(R.id.score_five);
        s6 = (EditText) findViewById(R.id.score_six);
        s7 = (EditText) findViewById(R.id.score_seven);
        s8 = (EditText) findViewById(R.id.score_eight);
        s9 = (EditText) findViewById(R.id.score_nine);
        s10 = (EditText) findViewById(R.id.score_ten);
        s11 = (EditText) findViewById(R.id.score_eleven);
        s12 = (EditText) findViewById(R.id.score_twelve);
        s13 = (EditText) findViewById(R.id.score_thirteen);
        s14 = (EditText) findViewById(R.id.score_fourteen);
        s15 = (EditText) findViewById(R.id.score_fifteen);
        s16 = (EditText) findViewById(R.id.score_sixteen);
        s17 = (EditText) findViewById(R.id.score_seventeen);
        s18 = (EditText) findViewById(R.id.score_eighteen);
        p1 = (EditText) findViewById(R.id.par_one);
        p2 = (EditText) findViewById(R.id.par_two);
        p3 = (EditText) findViewById(R.id.par_three);
        p4 = (EditText) findViewById(R.id.par_four);
        p5 = (EditText) findViewById(R.id.par_five);
        p6 = (EditText) findViewById(R.id.par_six);
        p7 = (EditText) findViewById(R.id.par_seven);
        p8 = (EditText) findViewById(R.id.par_eight);
        p9 = (EditText) findViewById(R.id.par_nine);
        p10 = (EditText) findViewById(R.id.par_ten);
        p11 = (EditText) findViewById(R.id.par_eleven);
        p12 = (EditText) findViewById(R.id.par_twelve);
        p13 = (EditText) findViewById(R.id.par_thirteen);
        p14 = (EditText) findViewById(R.id.par_fourteen);
        p15 = (EditText) findViewById(R.id.par_fifteen);
        p16 = (EditText) findViewById(R.id.par_sixteen);
        p17 = (EditText) findViewById(R.id.par_seventeen);
        p18 = (EditText) findViewById(R.id.par_eighteen);

        n1 = Integer.parseInt(s1.getText().toString());
        n2 = Integer.parseInt(s2.getText().toString());
        n3 = Integer.parseInt(s3.getText().toString());
        n4 = Integer.parseInt(s4.getText().toString());
        n5 = Integer.parseInt(s5.getText().toString());
        n6 = Integer.parseInt(s6.getText().toString());
        n7 = Integer.parseInt(s7.getText().toString());
        n8 = Integer.parseInt(s8.getText().toString());
        n9 = Integer.parseInt(s9.getText().toString());
        n10 = Integer.parseInt(s10.getText().toString());
        n11 = Integer.parseInt(s11.getText().toString());
        n12 = Integer.parseInt(s12.getText().toString());
        n13 = Integer.parseInt(s13.getText().toString());
        n14 = Integer.parseInt(s14.getText().toString());
        n15 = Integer.parseInt(s15.getText().toString());
        n16 = Integer.parseInt(s16.getText().toString());
        n17 = Integer.parseInt(s17.getText().toString());
        n18 = Integer.parseInt(s18.getText().toString());
        scoresum = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13+n14+n15+n16+n17+n18;



        total_Score.setText(scoresum);

        //totalOv_under = o1 + o2 + o3 + o4 + o5 + o6 + o7 + o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18;


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
