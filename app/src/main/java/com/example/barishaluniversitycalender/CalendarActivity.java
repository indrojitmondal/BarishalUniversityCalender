package com.example.barishaluniversitycalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    private TextView currentdate;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        closeContextMenu();
        currentdate= (TextView) findViewById(R.id.currentdate);
        datePicker=(DatePicker) findViewById(R.id.datepicker);
        currentdate.setText(currentdate1());

    }

    String currentdate1()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth() +1) +"/");
        stringBuilder.append(datePicker.getYear());

       return stringBuilder.toString();

    }
}
