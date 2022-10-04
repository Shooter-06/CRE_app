package com.example.fbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentRepresentation extends AppCompatActivity {

    Button fragCount, fragImag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_representation);

        fragCount=findViewById(R.id.button);
        fragImag=findViewById(R.id.button2);

        fragCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new FirstFragment()).commit();
            }
        });

        fragImag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new SecondFragment()).commit();
            }
        });
    }
}