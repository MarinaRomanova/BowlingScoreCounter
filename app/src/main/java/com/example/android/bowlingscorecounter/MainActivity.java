package com.example.android.bowlingscorecounter;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    int scoreA = 0;
    int scoreB = 0;

    Button one_player1;
    Button two_player1;
    Button three_player1;
    Button four_player1;
    Button five_player1;
    Button six_player1;
    Button seven_player1;
    Button eight_player1;
    Button nine_player1;
    Button ten_player1;

    Button one_player2;
    Button two_player2;
    Button three_player2;
    Button four_player2;
    Button five_player2;
    Button six_player2;
    Button seven_player2;
    Button eight_player2;
    Button nine_player2;
    Button ten_player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        one_player1 = (Button) findViewById(R.id.one_Point_Button_Player1);
        one_player1.setOnClickListener(this);

        two_player1 = (Button) findViewById(R.id.two_Points_Button_Player1);
        two_player1.setOnClickListener(this);

        three_player1 = (Button) findViewById(R.id.three_Points_Button_Player1);
        three_player1.setOnClickListener(this);

        four_player1 = (Button) findViewById(R.id.four_Points_Button_Player1);
        four_player1.setOnClickListener(this);

        five_player1 = (Button) findViewById(R.id.five_Points_Button_Player1);
        five_player1.setOnClickListener(this);

        six_player1 = (Button) findViewById(R.id.six_Points_Button_Player1);
        six_player1.setOnClickListener(this);

        seven_player1 = (Button) findViewById(R.id.seven_Points_Button_Player1);
        seven_player1.setOnClickListener(this);

        eight_player1 = (Button) findViewById(R.id.eight_Points_Button_Player1);
        eight_player1.setOnClickListener(this);

        nine_player1 = (Button) findViewById(R.id.nine_Points_Button_Player1);
        nine_player1.setOnClickListener(this);

        ten_player1 = (Button) findViewById(R.id.ten_Points_Button_Player1);
        ten_player1.setOnClickListener(this);

        one_player2 = (Button) findViewById(R.id.one_Point_Button_Player2);
        one_player2.setOnClickListener(this);

        two_player2 = (Button) findViewById(R.id.two_Points_Button_Player2);
        two_player2.setOnClickListener(this);

        three_player2 = (Button) findViewById(R.id.three_Points_Button_Player2);
        three_player2.setOnClickListener(this);

        four_player2 = (Button) findViewById(R.id.four_Points_Button_Player2);
        four_player2.setOnClickListener(this);

        five_player2 = (Button) findViewById(R.id.five_Points_Button_Player2);
        five_player2.setOnClickListener(this);

        six_player2 = (Button) findViewById(R.id.six_Points_Button_Player2);
        six_player2.setOnClickListener(this);

        seven_player2 = (Button) findViewById(R.id.seven_Points_Button_Player2);
        seven_player2.setOnClickListener(this);

        eight_player2 = (Button) findViewById(R.id.eight_Points_Button_Player2);
        eight_player2.setOnClickListener(this);

        nine_player2 = (Button) findViewById(R.id.nine_Points_Button_Player2);
        nine_player2.setOnClickListener(this);

        ten_player2 = (Button) findViewById(R.id.ten_Points_Button_Player2);
        ten_player2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.one_Point_Button_Player1:
                scoreA += 1;
                break;

            case R.id.two_Points_Button_Player1:
                scoreA += 2;
                break;

            case R.id.three_Points_Button_Player1:
                scoreA += 3;
                break;

            case R.id.four_Points_Button_Player1:
                scoreA += 4;
                break;

            case R.id.five_Points_Button_Player1:
                scoreA += 5;
                break;

            case R.id.six_Points_Button_Player1:
                scoreA += 6;
                break;

            case R.id.seven_Points_Button_Player1:
                scoreA += 7;
                break;

            case R.id.eight_Points_Button_Player1:
                scoreA += 8;
                break;

            case R.id.nine_Points_Button_Player1:
                scoreA += 9;
                break;

            case R.id.ten_Points_Button_Player1:
                scoreA += 10;
                break;

            case R.id.one_Point_Button_Player2:
                scoreB += 1;
                break;

            case R.id.two_Points_Button_Player2:
                scoreB += 2;
                break;

            case R.id.three_Points_Button_Player2:
                scoreB += 3;
                break;

            case R.id.four_Points_Button_Player2:
                scoreB += 4;
                break;

            case R.id.five_Points_Button_Player2:
                scoreB += 5;
                break;

            case R.id.six_Points_Button_Player2:
                scoreB += 6;
                break;

            case R.id.seven_Points_Button_Player2:
                scoreB += 7;
                break;

            case R.id.eight_Points_Button_Player2:
                scoreB += 8;
                break;

            case R.id.nine_Points_Button_Player2:
                scoreB += 9;
                break;

            case R.id.ten_Points_Button_Player2:
                scoreB += 10;
                break;

            default:
                break;
        }

        displayForPlayer1(scoreA);
        displayForPlayer2(scoreB);

    }

    /**
     * This method reset scores for both players.
     */
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForPlayer1(scoreA);
        displayForPlayer2(scoreB);
    }

    /**
     * This method displays the given score for a Player 1.
     */

    private void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given score for a Player 2.
     */

    private void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }
}
