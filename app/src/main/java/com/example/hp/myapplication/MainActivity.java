package com.example.hp.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;


public class MainActivity extends AppCompatActivity {

    //Object of type Button and TextView
    Button btnDisplay1;
    Button btnDisplay2;
    Button btnDisplay3;
    Button btnDisplay4;
    TextView displayTxt;
    EditText inputEdtTxt;
    EditText inputEditTxt;
    Integer textFromEditText;
    Integer textFromEdtText;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay1 = findViewById(R.id.displayBtn1);
        btnDisplay2 = findViewById(R.id.displayBtn2);
        btnDisplay3 = findViewById(R.id.displayBtn3);
        btnDisplay4 = findViewById(R.id.displayBtn4);
        displayTxt = findViewById(R.id.displayTxt);
        inputEdtTxt = findViewById(R.id.inputEdtTxt);
        inputEditTxt = findViewById(R.id.inputEditTxt);


        btnDisplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                textFromEditText = Integer.valueOf(inputEdtTxt.getText().toString());
                textFromEdtText = Integer.valueOf(inputEditTxt.getText().toString());
                displayTxt.setText(String.valueOf(getSum(textFromEditText, textFromEdtText)));
                Toast.makeText(MainActivity.this, "This is addition", Toast.LENGTH_SHORT).show();

            }
        });

        btnDisplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                textFromEditText = Integer.valueOf(inputEdtTxt.getText().toString());
                textFromEdtText = Integer.valueOf(inputEditTxt.getText().toString());
                displayTxt.setText(String.valueOf(getDiff(textFromEditText, textFromEdtText)));
            }
        });

        btnDisplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                textFromEditText = Integer.valueOf(inputEdtTxt.getText().toString());
                textFromEdtText = Integer.valueOf(inputEditTxt.getText().toString());
                displayTxt.setText(String.valueOf(getMul(textFromEditText, textFromEdtText)));
            }
        });

        btnDisplay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                textFromEditText = Integer.valueOf(inputEdtTxt.getText().toString());
                textFromEdtText = Integer.valueOf(inputEditTxt.getText().toString());
                displayTxt.setText(String.valueOf(getDiv(textFromEditText, textFromEdtText)));
            }
        });

    }




     protected int getSum(Integer textFromEditText, Integer textFromEdtText)
     {
         return textFromEditText+textFromEdtText;
     }

    protected int getMul(Integer textFromEditText, Integer textFromEdtText)
    {
        return textFromEditText*textFromEdtText;
    }

    protected int getDiff(Integer textFromEditText, Integer textFromEdtText)
    {
        return textFromEditText-textFromEdtText;
    }

    protected int getDiv(Integer textFromEditText, Integer textFromEdtText)
    {
        return textFromEditText/textFromEdtText;
    }
}