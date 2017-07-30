package com.example.android.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int teamAPoints=0;
    int teamBPoints=0;
    int FoulsTeamA=0;
    int FoulsTeamB=0;
    /* Team a*/
    /* ADD 3 POINTS*/
    public void add3PointsA(View v)
    {
        teamAPoints=teamAPoints+3;
        displayForTeamA(teamAPoints);
    }
    /* ADD 2 POINTS*/
    public void add2PointsA(View v)
    {
        teamAPoints=teamAPoints+2;
        displayForTeamA(teamAPoints);

    }
    /* ADD 1 POINTS*/
    public void add1PointsA(View v)
    {
        teamAPoints=teamAPoints+1;
        displayForTeamA(teamAPoints);
    }
    /* ADD FOUL POINT*/
    public void setFoulTeamA(View v){
        FoulsTeamA = FoulsTeamA + 1 ;
        displayFoulForTeamA(FoulsTeamA);
    }
    /* Team B*/
    /* ADD 3 POINTS*/
    public void add3PointsB(View v)
    {
        teamBPoints=teamBPoints+3;
        displayForTeamB(teamBPoints);
    }
    /* ADD 2 POINTS*/
    public void add2PointsB(View v)
    {
        teamBPoints=teamBPoints+2;
        displayForTeamB(teamBPoints);

    }
    /* ADD 1 POINTS*/
    public void add1PointsB(View v)
    {
        teamBPoints=teamBPoints+1;
        displayForTeamB(teamBPoints);
    }
    /* ADD FOUL POINT*/
    public void setFoulTeamB(View v){
        FoulsTeamB = FoulsTeamB + 1 ;
        displayFoulForTeamB(FoulsTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_b);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View v)
    {
        teamBPoints=0;
        teamAPoints=0;
        FoulsTeamA=0;
        FoulsTeamB=0;
        displayForTeamB(teamBPoints);
        displayForTeamA(teamBPoints);
        displayFoulForTeamA(FoulsTeamA);
        displayFoulForTeamB(FoulsTeamB);
    }
}
