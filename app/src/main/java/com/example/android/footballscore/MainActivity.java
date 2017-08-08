package com.example.android.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixPoints(View v) {
        scoreTeam1 = scoreTeam1 + 6;
        displayForTeam1(scoreTeam1);
    }

    public void addThreePoints(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    public void addOnePoint(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    public void addSixPointsTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 6;
        displayForTeam2(scoreTeam2);
    }

    public void addThreePointsTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }

    public void addOnePointTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }
}
