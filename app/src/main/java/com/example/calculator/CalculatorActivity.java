package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class CalculatorActivity extends AppCompatActivity {
    LinearLayout hidden1;
    LinearLayout hidden2;
    TextView expander;
    AppCompatButton one;
    EditText screen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        hidden1 = findViewById(R.id.hidden1);
        hidden2 = findViewById(R.id.hidden2);
        expander = findViewById(R.id.expand_list);
        one = findViewById(R.id.one);
        screen = findViewById(R.id.screen);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = String.valueOf(screen.getText()) + "1";
                screen.setText(current);
            }
        });



        expander.setOnClickListener(v -> {
            hidden1.setWeightSum(LinearLayout.LayoutParams.WRAP_CONTENT);
            hidden1.setVisibility(View.VISIBLE);
            hidden2.setWeightSum(1.0F);
        });
    }
}