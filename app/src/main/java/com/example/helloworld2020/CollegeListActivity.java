package com.example.helloworld2020;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setMovementMethod(new ScrollingMovementMethod());

        String data = "";

        StringBuffer sbuffer = new StringBuffer();

        InputStream is = this.getResources().openRawResource(R.raw.collegenames);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if (is != null) {
            try {
                while ((data = reader.readLine()) != null) {
                    sbuffer.append(data + "\n");
                }
                textView.setText(sbuffer);
                is.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}