package kr.ac.yeonsung.minn.androidproject_0520_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chrono = findViewById(R.id.chrono);
        chrono.setBase(SystemClock.elapsedRealtime());
        chrono.start();
    }
}