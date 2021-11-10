package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.net.lnet4Address;
public class Adder extends AppCompatActivity {
    EditText number1,number2;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        number1= findViewById(R.id.number1);
        number2=findViewById(R.id.number2);

        sum = findViewById(R.id.calculate);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1=0,val2=0;
                if (!number1.getText().toString().equals("")){
                    val1=Interger.parseInt(number1.getText().toString());
                }
                else {
                    number1.setFocusable(true);
                }
                if (!number2.getText().toString().equals("")){
                    val1=Interger.parseInt(number2.getText().toString());
                }
                else {
                    number1.setFocusable(true);
                }
                int value = val1+val2;
                intent main = new Intent(getApplicationContext(),MainActivity.class);
                main.putExtra("the sum" + value);
                startActivity(main);
            }
        });

    }
}
