package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView lTextField = findViewById(R.id.counter_time);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                lTextField.setText(getString(R.string.count_time) + millisUntilFinished / 1000);
            }

            public void onFinish() {
                lTextField.setText(R.string.done);
            }
        }.start();
    }
}
