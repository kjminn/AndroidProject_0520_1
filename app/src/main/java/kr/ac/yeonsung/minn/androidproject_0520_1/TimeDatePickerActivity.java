package kr.ac.yeonsung.minn.androidproject_0520_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeDatePickerActivity extends AppCompatActivity {
    TextView textTime, textDate;
    TimePicker timePick;
    DatePicker datePick;
    int selectedYear, selectedMonth, selectedDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_date_picker);
        textTime = findViewById(R.id.text_time);
        textDate = findViewById(R.id.text_date);
        timePick = findViewById(R.id.time_pick);
        datePick = findViewById(R.id.date_pick);
        datePick.setOnDateChangedListener(dateListener);

        Button btn = findViewById(R.id.btn_date);
        btn.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textTime.setText(timePick.getCurrentHour() + "시 " + timePick.getCurrentMinute() +"분");
            textDate.setText(selectedYear + "년 " + selectedMonth + "월" + selectedDay + "일");
        }
    };

    DatePicker.OnDateChangedListener dateListener = new DatePicker.OnDateChangedListener() {
        @Override
        public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
            selectedYear = year;
            selectedMonth = month + 1;
            selectedDay = day;
        }
    };
}