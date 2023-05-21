package com.example.matala11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SolutionActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    Button btn;
    int result1, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutionactivity);
        tv1.findViewById(R.id.tv1);
        tv2.findViewById(R.id.tv2);
        tv3.findViewById(R.id.tv3);
        btn.findViewById(R.id.btn);
        Intent intent = getIntent();
        result1 = intent.getIntExtra("score1", 0);
        result2 = intent.getIntExtra("score2", 0);
        tv1.setText(String.valueOf(result1));
        tv2.setText(String.valueOf(result2));
        if (result1>result2){
            tv3.setText("Player1 is the winner!");
        }
        else if (result1<result2){
            tv3.setText("Player2 is the winner!");
        }
        else{
            tv3.setText("There is a Teko!");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = 0;
                result2 = 0;
                finish();
            }
        });
    }
}