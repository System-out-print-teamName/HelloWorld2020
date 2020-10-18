

package com.example.helloworld2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button satBtn = (Button)findViewById(R.id.sat);

        satBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StandardizedTestingActivity.class));
            }
        });
    }

    public void launchCollegeList(View v) {
        Intent i = new Intent(this, CollegeListActivity.class);
        startActivity(i);
    }

        public void launchCollegeSearch(View v) {
            // Intent i = new Intent(this, CollegeSearch.class);
            // startActivity(i);
        }

    public void launchStandardizedTesting(View v) {
        Intent i = new Intent(this, StandardizedTestingActivity.class);
        startActivity(i);
    }

        public void launchAbout(View v) {
            // Intent i = new Intent(this, About.class);
            // startActivity(i);
        }
}