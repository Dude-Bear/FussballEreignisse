package com.example.android.fussballereignisse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A
     */
    public void goalTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsTeamA(goalsTeamA);
    }

    public void displayGoalsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void yellowCardTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    public void displayYellowCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowCards);
        scoreView.setText(String.valueOf(score));
    }

    public void redCardTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsTeamA(redCardsTeamA);
    }

    public void displayRedCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_redCards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B
     */
    public void goalTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsTeamB(goalsTeamB);
    }

    public void displayGoalsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void yellowCardTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    public void displayYellowCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowCards);
        scoreView.setText(String.valueOf(score));
    }

    public void redCardTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsTeamB(redCardsTeamB);
    }

    public void displayRedCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_redCards);
        scoreView.setText(String.valueOf(score));
    }

    //Reset Button
    public void resetScore(View V) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayGoalsTeamA(goalsTeamA);
        displayGoalsTeamB(goalsTeamB);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayRedCardsTeamA(redCardsTeamA);
        displayRedCardsTeamB(redCardsTeamB);
    }
}
