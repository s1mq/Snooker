package com.example.android.snooker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int POScore = 0;
    int PTScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // These SEVEN methods will be called when Player One buttons 1-7 are clicked.
    public void buttonPO1 (View view) {
        POScore = POScore + 1;
        displayForPO(POScore);
    }
    public void buttonPO2 (View view) {
        POScore = POScore + 2;
        displayForPO(POScore);
    }
    public void buttonPO3 (View view) {
        POScore = POScore + 3;
        displayForPO(POScore);
    }
    public void buttonPO4 (View view) {
        POScore = POScore + 4;
        displayForPO(POScore);
    }
    public void buttonPO5 (View view) {
        POScore = POScore + 5;
        displayForPO(POScore);
    }
    public void buttonPO6 (View view) {
        POScore = POScore + 6;
        displayForPO(POScore);
    }
    public void buttonPO7 (View view) {
        POScore = POScore + 7;
        displayForPO(POScore);
    }


    // These SEVEN methods will be called when Player Two buttons 1-7 are clicked.
    public void buttonPT1 (View view) {
        PTScore = PTScore + 1;
        displayForPT(PTScore);
    }
    public void buttonPT2 (View view) {
        PTScore = PTScore + 2;
        displayForPT(PTScore);
    }
    public void buttonPT3 (View view) {
        PTScore = PTScore + 3;
        displayForPT(PTScore);
    }
    public void buttonPT4 (View view) {
        PTScore = PTScore + 4;
        displayForPT(PTScore);
    }
    public void buttonPT5 (View view) {
        PTScore = PTScore + 5;
        displayForPT(PTScore);
    }
    public void buttonPT6 (View view) {
        PTScore = PTScore + 6;
        displayForPT(PTScore);
    }
    public void buttonPT7 (View view) {
        PTScore = PTScore + 7;
        displayForPT(PTScore);
    }

    //This method is for the RESET button.
    public void resetScore (View view){
        POScore = 0;
        PTScore = 0;
        displayForPO(POScore);
        displayForPT(PTScore);
    }
    /**
     * Displays the given score for Player One.
     */
    public void displayForPO(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p_o_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player Two.
     */
    public void displayForPT(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p_t_score);
        scoreView.setText(String.valueOf(score));
    }
}
