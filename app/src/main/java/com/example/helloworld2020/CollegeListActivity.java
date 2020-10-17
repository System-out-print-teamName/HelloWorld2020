package com.example.helloworld2020;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CollegeListActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);

        ArrayList<String> satScores = new ArrayList<>();
        ArrayList<String> acceptanceRates = new ArrayList<>();
        ArrayList<String> collegeNames = new ArrayList<>();
        ArrayList<String> rankings = new ArrayList<>();

        try {
            File sat = new File("Sat scores.txt");
            File acceptance = new File("Acceptance Rates.txt");
            File names = new File("College Names.txt");
            File ranking = new File("Rankings.txt");
            FileReader frSat = new FileReader(sat);
            FileReader frAcceptance = new FileReader(acceptance);
            FileReader frNames = new FileReader(names);
            FileReader frRankings = new FileReader(ranking);

            BufferedReader bfr = new BufferedReader(frSat);
            String line = bfr.readLine();
            while (line != null) {
                satScores.add(line);
                line = bfr.readLine();
            }
            bfr.close();
            bfr = new BufferedReader(frAcceptance);
            line = bfr.readLine();
            while (line != null) {
                acceptanceRates.add(line);
                line = bfr.readLine();
            }
            bfr.close();
            bfr = new BufferedReader(frNames);
            line = bfr.readLine();
            while (line != null) {
                collegeNames.add(line);
                line = bfr.readLine();
            }
            bfr.close();
            bfr = new BufferedReader(frRankings);
            line = bfr.readLine();
            while (line != null) {
                rankings.add(line);
                line = bfr.readLine();
            }
            bfr.close();




        } catch (IOException e) {
        }

        TextView tv1 = (TextView)findViewById(R.id.textView1);
        tv1.setText("Hello");

    }
}