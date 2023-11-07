package com.training.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberInput;
    Button converterButton;
    TextView outputText;


    public double conversion(double convertableKiloUnit){
    return convertableKiloUnit*2.20462;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberInput= findViewById(R.id.editTextNumber);
        converterButton= findViewById(R.id.button);
        outputText=findViewById((R.id.textView));




        converterButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
              double inputValue= Double.parseDouble(numberInput.getText().toString())  ;
                double finalValue=conversion(inputValue);
                outputText.setText(""+finalValue+" pounds");
            }
        });



    }
}