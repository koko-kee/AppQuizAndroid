package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         startBtn = findViewById(R.id.startBtn);

         startBtn.setOnClickListener(new View.OnClickListener() {
             @Override

             public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(), HomeQuestionActivity.class);
                 startActivity(i);
             }
         });

    }





}

