package com.edwinabrenda.scoresheet1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA, ScoreTeamB, PlayerA, PlayerB, CountTeamA, CountTeamB, CountTeamC, CountTeamD, CountTeamE,CountTeamF,CountTeamG,CountTeamH,CountTeamI,CountTeamJ,CountTeamK,CountTeamL;
    Button increment, decrement,endGame;
    TextView ScoreA, PScoreA, PScore2A, PScore3A, PScore4A, PScore5A, PScore6A, PScore7A, PScore8A, PScore9A, PScore10A, PScore11A, PScore12A, PScoreB, ScoreB, playerA1, playerA2, playera3, playera4, playera5, player1, player2, player3, player6, player7,
            player8, player9, player10, player11, player12, player4, player5, txtPlayer1, txtPlayer2, txtPlayer3, txtPlayer4, txtPlayer5, txtPlayer6, txtPlayer7, txtPlayer8, txtPlayer9, txtPlayer10, txtPlayer11, txtPlayer12;

    LinearLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreA = findViewById(R.id.scoretm);
        PScoreA = findViewById(R.id.p1);
        PScore2A = findViewById(R.id.p2);
        PScore3A = findViewById(R.id.p3);
        PScore4A = findViewById(R.id.p4);
        PScore5A = findViewById(R.id.p5);
        PScore6A = findViewById(R.id.p6);
        PScore7A = findViewById(R.id.p7);
        PScore8A = findViewById(R.id.p8);
        PScore9A = findViewById(R.id.p9);
        PScore10A = findViewById(R.id.p10);
        PScore11A = findViewById(R.id.p11);
        PScore12A = findViewById(R.id.p12);
        endGame=findViewById(R.id.btnend);



        txtPlayer1= findViewById(R.id.p1);
        txtPlayer2= findViewById(R.id.p2);
        txtPlayer3= findViewById(R.id.p3);
        txtPlayer4= findViewById(R.id.p4);
        txtPlayer5= findViewById(R.id.p5);
        txtPlayer6= findViewById(R.id.p6);
        txtPlayer7= findViewById(R.id.p7);
        txtPlayer8= findViewById(R.id.p8);
        txtPlayer9= findViewById(R.id.p9);
        txtPlayer10= findViewById(R.id.p10);
        txtPlayer11= findViewById(R.id.p11);
        txtPlayer12= findViewById(R.id.p12);


        main = findViewById(R.id.main);


        //PScoreB=findViewById(R.id.)
        ScoreB = findViewById(R.id.scoretm1);
        PScoreB = findViewById(R.id.p1);
        playerA1 = findViewById(R.id.p1);
        playerA2 = findViewById(R.id.p2);
        playera3 = findViewById(R.id.p3);
        playera4 = findViewById(R.id.p4);
        playera5 = findViewById(R.id.p5);
        player1 = findViewById(R.id.player1A);
        player2 = findViewById(R.id.player2A);
        player3 = findViewById(R.id.player3A);
        player4 = findViewById(R.id.player4A);
        player5 = findViewById(R.id.player5A);
        player6 = findViewById(R.id.player6A);
        player7 = findViewById(R.id.player7A);
        player8 = findViewById(R.id.player8A);
        player9 = findViewById(R.id.player9A);
        player10 = findViewById(R.id.player10A);
        player11 = findViewById(R.id.player11A);
        player12 = findViewById(R.id.player12A);


        player1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer1A("Player 1", "One");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        /*endGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                endGamePlay("");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });*/
        player2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Addplayer2A("Player 2", "Two");
                // TODO Auto-generated method stub
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer3A("Player 3", "Three");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer4A("Player 4", "Four");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer5A("Player 5", "Five");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer6A("Player 6", "Six");
                // Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer7A("Player 7", "Seven");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer8A("Player 8", "Eight");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });


        player9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer9A("Player 9", "Nine");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer10A("Player 10", "Ten");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer11A("Player 11", "Eleven");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });
        player12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addplayer12A("Player 12", "Twelve");
                //Toast.makeText(getApplicationContext(), "You made a mess", Toast.LENGTH_LONG).show();
            }

        });

    }
    public void Addplayer1A(String player1,String score)
    {
        String play=player1;

            if (CountTeamA<5 && play == "Player 1" && score == "One") {
                CountTeamA = CountTeamA + 1;
                PScoreA.setText(CountTeamA + "");
            }

        else {
                playerA1.setVisibility(View.GONE);
                txtPlayer1.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    /*public String endGamePlay()
    {
        //String play=player1;

        //if ( play == "Player 1" && score == "One") {
            //CountTeamA = CountTeamA + 1;
            PScoreA.getText();

    }*/
    public void Addplayer2A(String player1,String score)
    {
        String play=player1;

        if (CountTeamB<5 && play == "Player 2" && score == "Two") {
            CountTeamB = CountTeamB+1;
            PScore2A.setText(CountTeamB + "");
        }

        else {
            player2.setVisibility(View.GONE);
            txtPlayer2.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer3A(String player1,String score)
    {
        String play=player1;

        if (CountTeamD<5 && play == "Player 3" && score == "Three") {
            CountTeamD = CountTeamD + 1;
            PScore3A.setText(CountTeamD+ "");
        }

        else {
            player3.setVisibility(View.GONE);
            txtPlayer3.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer4A(String player1,String score)
    {
        String play=player1;

        if (CountTeamE<5 && play == "Player 4" && score == "Four") {
            CountTeamE = CountTeamE + 1;
            PScore4A.setText(CountTeamE + "");
        }

        else {
            player4.setVisibility(View.GONE);
            txtPlayer4.setVisibility(View.GONE);
           // Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer5A(String player1,String score)
    {
        String play=player1;

        if (CountTeamC<5 && play == "Player 5" && score == "Five") {
            CountTeamC = CountTeamC + 1;
            PScore5A.setText(CountTeamC + "");
        }

        else {
            player5.setVisibility(View.GONE);
            txtPlayer5.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer6A(String player1,String score)
    {
        String play=player1;

        if (CountTeamF<5 && play == "Player 6" && score == "Six") {
            CountTeamF = CountTeamF + 1;
            PScore6A.setText(CountTeamF + "");
        }

        else {
            player6.setVisibility(View.GONE);
            txtPlayer6.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer7A(String player1,String score)
    {
        String play=player1;

        if (CountTeamG<5 && play == "Player 7" && score == "Seven") {
            CountTeamG = CountTeamG + 1;
            PScore7A.setText(CountTeamG + "");
        }

        else {
            player7.setVisibility(View.GONE);
            txtPlayer7.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer8A(String player1,String score)    {
        String play=player1;

        if (CountTeamH<5 && play == "Player 8" && score == "Eight") {
            CountTeamH = CountTeamH + 1;
            PScore8A.setText(CountTeamH + "");
        }

        else {
            player8.setVisibility(View.GONE);
            txtPlayer8.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer9A(String player1,String score)
    {
        String play=player1;

        if (CountTeamI<5 && play == "Player 9" && score == "Nine") {
            CountTeamI = CountTeamI + 1;
            PScore9A.setText(CountTeamI + "");
        }

        else {
            player9.setVisibility(View.GONE);
            txtPlayer9.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer10A(String player1,String score)
    {
        String play=player1;

        if (CountTeamJ<5 && play == "Player 10" && score == "Ten") {
            CountTeamJ = CountTeamJ + 1;
            PScore10A.setText(CountTeamJ + "");
        }

        else {
            player10.setVisibility(View.GONE);
            txtPlayer10.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer11A(String player1,String score)
    {
        String play=player1;

        if (CountTeamK<5 && play == "Player 11" && score == "Eleven") {
            CountTeamK = CountTeamK + 1;
            PScore11A.setText(CountTeamK + "");
        }

        else {
            player11.setVisibility(View.GONE);
            txtPlayer11.setVisibility(View.GONE);
            //Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }
    public void Addplayer12A(String player1,String score)
    {
        String play=player1;

            if (CountTeamL<5 && play == "Player 12" && score == "Twelve") {
            CountTeamL = CountTeamL + 1;
            PScore12A.setText(CountTeamL + "");
        }

        else {
                player12.setVisibility(View.GONE);
                txtPlayer12.setVisibility(View.GONE);
           // Toast.makeText(getApplicationContext(), "Game Ended", Toast.LENGTH_LONG).show();
        }

    }


    public void Addone(String team1,String score)
    {
       String team=team1;

       if (team=="team A" && score=="one"){
           ScoreTeamA=ScoreTeamA+1;
           ScoreA.setText(ScoreTeamA+"");}
       if (team=="team B"&& score=="one"){
           ScoreTeamB=ScoreTeamB+1;
           ScoreB.setText(ScoreTeamB+"");
       }

    }
    public void AddAone(String team2,String score)
    {
        String team1=team2;

        if (team1=="player A" && score=="one"){
            PlayerA=PlayerA+1;
            PScoreA.setText(PScoreA+"");}
        if (team1=="player B"&& score=="one"){
            PlayerB=PlayerB+1;
            ScoreB.setText(PlayerB+"");
        }


    }
    public void Addtwo(String team1,String score)
    {
        String team=team1;

        if (team=="team A" && score=="two"){
            ScoreTeamA=ScoreTeamA+2;
            ScoreA.setText(ScoreTeamA+"");}
        if (team=="team B"&& score=="two"){
            ScoreTeamB=ScoreTeamB+2;
            ScoreB.setText(ScoreTeamB+"");
        }

    }
    public void Addthree(String team1,String score)
    {
        String team=team1;

        if (team=="team A" && score=="three"){
            ScoreTeamA=ScoreTeamA+3;
            ScoreA.setText(ScoreTeamA+"");}
        if (team=="team B"&& score=="three"){
            ScoreTeamB=ScoreTeamB+3;
            ScoreB.setText(ScoreTeamB+"");
        }

    }

    public void Aone(View v)
    {

        Addone("team A","one");
    }
    public void Aaone(View v)
    {

        AddAone("player A","one");
    }
    public void Atwo(View v)
    {
        Addtwo("team A","two");

    }
    public void Athree(View v)
    {

        Addthree("team A","three");
    }
    public void Bone(View v)
    {
        Addone("team B","one");

    }
    public void Btwo(View v)
    {
        Addtwo("team B","two");

    }
    public void Bthree(View v)
    {

        Addthree("team B","three");
    }
    public void Aatwo(View view)
    {

    }
    public void Aafive(View view)
    {

    }
    public void Aathree(View view)
    {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.redcolor:
                main.setBackgroundColor(getResources().getColor(R.color.red));
                return true;
            case R.id.bluecolor:
                main.setBackgroundColor(getResources().getColor(R.color.blue));
                return true;
            case R.id.greencolor:
                main.setBackgroundColor(getResources().getColor(R.color.green));
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}