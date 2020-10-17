package com.example.helloworld2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandardizedTestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standardized_testing);

        String nextSatTest = "August";
        Button nextSatBtn = (Button)findViewById(R.id.nextSatDateButton);
        nextSatBtn.setText("Next Sat Test: " + nextSatTest);

        String nextActTest = "August";
        Button nextActBtn = (Button)findViewById(R.id.nextActDateButton);
        nextActBtn.setText("Next Act Test: " + nextActTest);

        Button satPrepBtn = (Button)findViewById(R.id.satPrepButton);
        satPrepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardizedTestingActivity.this, SatPrepActivity.class));
            }
        });

        Button actPrepBtn = (Button)findViewById(R.id.actPrepButton);
        actPrepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardizedTestingActivity.this, ActPrepActivity.class));
            }
        });
    }
}