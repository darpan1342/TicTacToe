package com.example.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    AdView madview;
    String win;
    String lose;
    String draw;
    int count;
    InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-6932127119268721~2884392217");
        madview= findViewById(R.id.adr);
        AdRequest adRequest = new AdRequest.Builder().build();
        madview.loadAd(adRequest);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-6932127119268721/6478741031");
        AdRequest adRequest1 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest1);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                interstitialAd.loadAd( new AdRequest.Builder().build());
            }
        });
        final Button re =  findViewById(R.id.reset);
        final TextView scorePlayer1= findViewById(R.id.player1_score) ;
        final TextView scorePlayer2=  findViewById(R.id.player2_score);
        final TextView setter =  findViewById(R.id.setter);
        final Button [] bt = new Button[9];
         bt[0]= findViewById(R.id.bt0);
         bt[1]= findViewById(R.id.bt1);
         bt[2]=findViewById(R.id.bt2);
         bt[3]=findViewById(R.id.bt3);
         bt[4]=findViewById(R.id.bt4);
         bt[5]=findViewById(R.id.bt5);
         bt[6]=findViewById(R.id.bt6);
         bt[7]=findViewById(R.id.bt7);
         bt[8]=findViewById(R.id.bt8);
        win="WON ,";
        lose="LOST ,";
        draw="DRAW ,";
        final result res = new result();
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                }
                else
                {
                    Log.i("ad","ad is not loaded");
                }
                if(!bt[0].isEnabled()&&!bt[1].isEnabled()&&!bt[2].isEnabled()&&!bt[3].isEnabled()
                        &&!bt[4].isEnabled()&&!bt[5].isEnabled()&&!bt[6].isEnabled()&&!bt[7].isEnabled()
                        &&!bt[8].isEnabled())
                {
                    scorePlayer2.append(draw);
                    scorePlayer1.append(draw);
                    count=count+1;
                }
                for(int i=0;i<9;i++)
                {
                    bt[i].setText("");
                    bt[i].setEnabled(true);
                }
                res.de();
                if(count==3)
                {
                    count=1;
                    int g =compress(scorePlayer1.getText().toString(),scorePlayer2.getText().toString());
                    if(g==0)
                    {
                        scorePlayer2.setText(draw);
                        scorePlayer1.setText(draw);
                    }
                    if(g==1)
                    {
                        scorePlayer1.setText(win);
                        scorePlayer2.setText(lose);
                    }
                    if(g==2)
                    {
                        scorePlayer2.setText(win);
                        scorePlayer1.setText(lose);
                    }
                }

            }
        });
        for(int i=0;i<9;i++)
        {
            final int k=i;
            bt[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String chang= (String) setter.getText();
                    bt[k].setText(chang);
                    if(chang.equals("X"))
                        setter.setText("O");
                    else
                        setter.setText("X");
                    boolean y = res.sete(k,chang);
                    if(y&&chang.equals("X"))
                    {
                        scorePlayer1.append(win);
                        scorePlayer2.append(lose);
                    }
                    if(y&&chang.equals("O"))
                    {
                        scorePlayer2.append(win);
                        scorePlayer1.append(lose);
                    }
                    bt[k].setEnabled(false);
                    if(y)
                    {
                        count=count+1;
                        for(int j=0;j<9;j++)
                        {
                            bt[j].setText("");
                            bt[j].setEnabled(true);
                        }
                        res.de();
                        if(count==3)
                        {
                            count=1;
                            int g =compress(scorePlayer1.getText().toString(),scorePlayer2.getText().toString());
                            if(g==0)
                            {
                                scorePlayer2.setText(draw);
                                scorePlayer1.setText(draw);
                            }
                            else if(g>1)
                            {
                                scorePlayer1.setText(win);
                                scorePlayer2.setText(lose);
                            }
                            else
                            {
                                scorePlayer2.setText(win);
                                scorePlayer1.setText(lose);
                            }

                        }
                    }
                }
            });
        }
    }

    private int compress(String a, String b) {
        String res1[]= a.split(",");
        String res2[]=b.split(",");
        String res="";
        int check=0;
        for(String h:res1)
        {
            h=h.trim();
            if(h.equals("WON"))
            {
                check=check+1;
            }
            res= res+h;
        }
        for(String h:res2)
        {
            h=h.trim();
            if(h.equals("WON"))
            {
                check=check-1;
            }
        }
        return check;

    }
}

