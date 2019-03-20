package com.example.admob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    AdView madView;
    String win;
    String lose;
    int player1Points = 0;
    int player2Points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Darpan id : ca-app-pub-6932127119268721~2884392217
        // test add id : ca-app-pub-3940256099942544/6300978111
        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
        madView = findViewById(R.id.adr);
        AdRequest adRequest = new AdRequest.Builder().build();
        madView.loadAd(adRequest);
        final Button re = findViewById(R.id.reset);
        final TextView scorePlayer1 = findViewById(R.id.player1_score);
        final TextView scorePlayer2 = findViewById(R.id.player2_score);
        final TextView setter = findViewById(R.id.setter);
        final Button bt0 = findViewById(R.id.bt0);
        final Button bt1 = findViewById(R.id.bt1);
        final Button bt2 = findViewById(R.id.bt2);
        final Button bt3 = findViewById(R.id.bt3);
        final Button bt4 = findViewById(R.id.bt4);
        final Button bt5 = findViewById(R.id.bt5);
        final Button bt6 = findViewById(R.id.bt6);
        final Button bt7 = findViewById(R.id.bt7);
        final Button bt8 = findViewById(R.id.bt8);
        win = "WIN";
        lose = "LOSE";
        final result res = new result();
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt0.setText("");
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                bt0.setEnabled(true);
                bt1.setEnabled(true);
                bt2.setEnabled(true);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                res.de();

            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt0.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(0, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt0.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt1.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(1, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt1.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt2.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(2, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt2.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt3.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(3, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt3.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt4.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(4, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt4.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt5.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(5, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt5.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt6.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(6, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt6.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt7.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(7, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt7.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String chang = (String) setter.getText();
                bt8.setText(chang);
                if (chang.equals("X"))
                    setter.setText("O");
                else
                    setter.setText("X");
                boolean y = res.sete(8, chang);
                if (y && chang.equals("X")) {
                    player1Points++;
                    if (player2Points > 0) {
                        player2Points--;
                    }
                    scorePlayer1.setText(win + " (" + player1Points + ")");
                    scorePlayer2.setText(lose + " (" + player2Points + ")");
                }
                if (y && chang.equals("O")) {
                    player2Points++;
                    if (player1Points > 0) {
                        player1Points--;
                    }
                    scorePlayer2.setText(win + " (" + player2Points + ")");
                    scorePlayer1.setText(lose + " (" + player1Points + ")");
                }
                bt8.setEnabled(false);
                if (y) {
                    bt0.setText("");
                    bt1.setText("");
                    bt2.setText("");
                    bt3.setText("");
                    bt4.setText("");
                    bt5.setText("");
                    bt6.setText("");
                    bt7.setText("");
                    bt8.setText("");
                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    res.de();
                }
            }
        });
    }
}

