package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreView extends AppCompatActivity {

    private Button tryAgainBtn , backToHome ;
    private TextView scoreTextView , congratulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_view);
        init();
        int score = getIntent().getIntExtra("score",1);
        congratulationViewByScore(score);
        scoreTextView.setText(score + "/10");
        tryAgainBtn.setOnClickListener(tryAgain());
        backToHome.setOnClickListener(backToHome());

    }

    public void congratulationViewByScore(int score)
    {
        if(score >1 && score <= 5){
            congratulation.setText("Tu peux Mieux Faire");
        }else{
            congratulation.setText("Exellent");
        }
    }


    public   View.OnClickListener tryAgain()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeQuestionActivity.class);
                startActivity(i);
                finish();
            }
        };
    }

    public   View.OnClickListener backToHome()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        };
    }


    public  void init(){

        tryAgainBtn = findViewById(R.id.tryAgainBtn);
        backToHome = findViewById(R.id.backToHomeBtn);
        scoreTextView = findViewById(R.id.scoreView);
        congratulation = findViewById(R.id.congrationView);
    }
}