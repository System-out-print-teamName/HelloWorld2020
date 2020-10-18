package com.example.helloworld2020;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
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

        //TextView textView = (TextView)findViewById(R.id.textView1);
        //textView.setMovementMethod(new ScrollingMovementMethod());

        String data = "";
        int rank = 1;

        StringBuffer sbuffer = new StringBuffer();

        InputStream is = this.getResources().openRawResource(R.raw.collegenames);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        sbuffer.append("Top 25 Computer Science Colleges in the US\n\n");

        if (is != null) {
            try {
                while ((data = reader.readLine()) != null) {
                    sbuffer.append("#" + rank + " - " + data + "\n\n");
                    rank += 1;
                }
                //textView.setText(sbuffer);
                is.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        /*Button gatechBtn = (Button)findViewById(R.id.gatechButton);
        gatechBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        GATechActivity.class));
            }
        });

        Button cornellBtn = (Button)findViewById(R.id.cornellButton);
        cornellBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        CornellActivity.class));
            }
        });

        Button columbiaBtn = (Button)findViewById(R.id.columbiaButton);
        columbiaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        ColumbiaActivty.class));
            }
        });

        Button brownBtn = (Button)findViewById(R.id.brownButton);
        brownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        BrownActivity.class));
            }
        });

        Button upennBtn = (Button)findViewById(R.id.upennButton);
        upennBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        UPennActivity.class));
            }
        });

        Button riceBtn = (Button)findViewById(R.id.riceButton);
        riceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        RiceActivity.class));
            }
        });

        Button uscBtn = (Button)findViewById(R.id.uscButton);
        uscBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CollegeListActivity.this,
                        USCActivity.class));
            }
        }); */

    }
    public void launchMIT(View view) {
        Intent i = new Intent(this, MITActivity.class);
        startActivity(i);
    }
    public void launchUCLA(View view) {
        Intent i = new Intent(this, UCLAActivity.class);
        startActivity(i);
    }
    public void launchUChicago(View view) {
        Intent i = new Intent(this, UChicagoActivity.class);
        startActivity(i);
    }
    public void launchJHU(View view) {
        Intent i = new Intent(this, JHUActivity.class);
        startActivity(i);
    }
    public void launchNorthwestern(View view) {
        Intent i = new Intent(this, NorthwesternActivity.class);
        startActivity(i);
    }
    public void launchTufts(View view) {
        Intent i = new Intent(this, TuftsActivity.class);
        startActivity(i);
    }
    public void launchBerkeley(View view) {
        Intent i = new Intent(this, UCBerkeleyActivity.class);
        startActivity(i);
    }
    public void launchWUSTL(View view) {
        Intent i = new Intent(this, WUSTLActivity.class);
        startActivity(i);
    }
    public void launchNotreDame(View view) {
        Intent i = new Intent(this, NotreDameActivity.class);
        startActivity(i);
    }
    public void launchUMich(View view) {
        Intent i = new Intent(this, UMichActivity.class);
        startActivity(i);
    }

    public void launchDartmouth(View view) {
        Intent i = new Intent(this, DartmouthActivity.class);
        startActivity(i);
    }
    public void launchHarveyMudd(View view) {
        Intent i = new Intent(this, HarveyMuddActivity.class);
        startActivity(i);
    }


}