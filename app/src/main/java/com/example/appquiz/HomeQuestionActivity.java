package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeQuestionActivity extends AppCompatActivity {

    List<QuestionModel> questionsList;
    private Button answerButton1 , answerButton2 , answerButton3 , answerButton4 , nextBtn , scoreBtn;
    private TextView questionTextView , numbreQuestion ;

    private List<Button> buttonList;
    private int currentQuestion , nb = 1 , score = 0;
    private final  int LIMIT = 10;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_question);

        init();
        buttonList.add(answerButton1);
        buttonList.add(answerButton2);
        buttonList.add(answerButton3);
        buttonList.add(answerButton4);
        questionsList = QuestionModel.showAllQuestion();
        ShowAnswer();
        numbreQuestion.setText("Question " + nb + "/10");
        scoreBtn.setVisibility(View.GONE);
        scoreBtn.setOnClickListener(showViewScore());
        nextBtn.setOnClickListener(NextQuestion());

    }


    public void controllerAnswer(int indexReponse) {

        int correctAnswer = questionsList.get(currentQuestion).getReponseCorrecte();

        if (indexReponse == correctAnswer){

            buttonList.get(indexReponse - 1).setBackgroundColor(getResources().getColor(R.color.green));

            for (int i = 0; i < buttonList.size(); i++) {

                if(i != indexReponse - 1)
                {
                    buttonList.get(i).setBackgroundColor(getResources().getColor(R.color.red));
                }
            }

            score++;

        } else {

            buttonList.get(correctAnswer - 1).setBackgroundColor(getResources().getColor(R.color.green));

            for (int i = 0; i < buttonList.size(); i++) {

                if(i != (correctAnswer - 1))
                {
                    buttonList.get(i).setBackgroundColor(getResources().getColor(R.color.red));
                }
            }

        }

        if(nb == LIMIT)
        {
            nextBtn.setVisibility(View.GONE);
            scoreBtn.setVisibility(View.VISIBLE);
        }
    }

    public View.OnClickListener showViewScore()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),ScoreView.class);
                i.putExtra("score",score);
                startActivity(i);

            }
        };
    }


    public void ShowAnswer(){

        currentQuestion = randomQuestion();
        questionTextView.setText(questionsList.get(currentQuestion).getQuestion());
        answerButton1.setText(questionsList.get(currentQuestion).getReponse1());
        answerButton2.setText(questionsList.get(currentQuestion).getReponse2());
        answerButton3.setText(questionsList.get(currentQuestion).getReponse3());
        answerButton4.setText(questionsList.get(currentQuestion).getReponse4());

        answerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controllerAnswer(1 );
            }
        });

        answerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controllerAnswer(2);
            }
        });

        answerButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controllerAnswer(3);
            }
        });

        answerButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controllerAnswer(4);
            }
        });
    }

    public void init() {

        questionsList = new ArrayList<>();
        answerButton1 = findViewById(R.id.answerButton1);
        answerButton2 = findViewById(R.id.answerButton2);
        answerButton3 = findViewById(R.id.answerButton3);
        answerButton4 = findViewById(R.id.answerButton4);
        scoreBtn = findViewById(R.id.scoreBtn);
        questionTextView = findViewById(R.id.questionTextView);
        nextBtn = findViewById(R.id.nextBtn);
        buttonList = new ArrayList<>();
        numbreQuestion = findViewById(R.id.nbreOfQuestion);

    }

    public int randomQuestion() {

        Random r = new Random();
        int sizeOfList = questionsList.size();
        return   r.nextInt(sizeOfList);

    }

    @SuppressLint("ResourceAsColor")
    public  void setBackgroundColor()
    {
        int orangeColor = getResources().getColor(R.color.orange);
        answerButton1.setBackgroundColor(orangeColor);
        answerButton2.setBackgroundColor(orangeColor);
        answerButton3.setBackgroundColor(orangeColor);
        answerButton4.setBackgroundColor(orangeColor);

    }

    public  View.OnClickListener NextQuestion()
    {
        return  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nb++;
                numbreQuestion.setText("Question " + nb + "/10");
                ShowAnswer();
                setBackgroundColor();
            }
        };
    }


}
