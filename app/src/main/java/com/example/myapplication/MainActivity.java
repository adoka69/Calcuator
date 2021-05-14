package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText FirstNum;
    private EditText SecondNum;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button multiple;
    private TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstNum = findViewById(R.id.FirstNum);
        SecondNum = findViewById(R.id.SecondNum);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiple = findViewById(R.id.multiple);
        divide = findViewById(R.id.divide);
        Output = findViewById(R.id.Output);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(String.valueOf(FirstNum.getText()));
                int second = Integer.parseInt(String.valueOf(SecondNum.getText()));
                int total = first+second;
                Output.setText(String.valueOf(total));

            }

        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(String.valueOf(FirstNum.getText()));
                int second = Integer.parseInt(String.valueOf(SecondNum.getText()));
                int total = first-second;
                Output.setText(String.valueOf(total));

            }

        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(String.valueOf(FirstNum.getText()));
                int second = Integer.parseInt(String.valueOf(SecondNum.getText()));
                int total = first*second;
                Output.setText(String.valueOf(total));

            }

        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Integer.parseInt(String.valueOf(FirstNum.getText()));
                double second = Integer.parseInt(String.valueOf(SecondNum.getText()));
                if(second==0){
                    Output.setText("Error");
                }
                else {
                    double total = first/second;
                    Output.setText(String.valueOf(Math.round(total)));
                }

            }

        });




}}