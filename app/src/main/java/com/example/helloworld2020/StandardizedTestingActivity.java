package com.example.helloworld2020;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StandardizedTestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standardized_testing);

        createNotificationChannel();

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
                startActivity(new Intent(StandardizedTestingActivity.this,
                        SatPrepActivity.class));
            }
        });

        Button actPrepBtn = (Button)findViewById(R.id.actPrepButton);
        actPrepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardizedTestingActivity.this,
                        ActPrepActivity.class));
            }
        });

        Button dailyAlarmButton = (Button)findViewById(R.id.dailyAlarm);

        dailyAlarmButton.setOnClickListener(v -> {
            Toast.makeText(this, "Reminder Set!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(StandardizedTestingActivity.this,
                    ReminderBroadcast.class);
            PendingIntent pendingIntent =
                    PendingIntent.getBroadcast(StandardizedTestingActivity.this,
                            0, intent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

            long timeAtButtonClick = System.currentTimeMillis();

            long tenSecondsInMillis = 1000 * 10;

            alarmManager.set(AlarmManager.RTC_WAKEUP, timeAtButtonClick +
                    tenSecondsInMillis, pendingIntent);
        });
    }



    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "LemubitReminderChannel";
            String description = "Channel for Lemubit Reminder";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notifyLemubit", name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}