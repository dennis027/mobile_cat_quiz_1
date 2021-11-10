package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button calculate = findViewById(R.id.sum);
        TextView result;
        result= findViewById(R.id.sum);

        intent i = getIntent();
        String value = i.getStringExtra(result);
        if(value!=null){
            Toast.makeText(this, "The sum is "+ value,ToastLENGTH_SHORT),showA();

        }

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext()Adder.class));
            }
        });

    }
}