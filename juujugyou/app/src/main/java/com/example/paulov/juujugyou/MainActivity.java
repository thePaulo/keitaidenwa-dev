package com.example.paulov.juujugyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDate(View view){
        DatePicker datePicker = new DatePicker();
        datePicker.show(getSupportFragmentManager(),"datePicker");
    }
    public void openTime(View view){
        TimePicker timePicker = new TimePicker();
        timePicker.show(getSupportFragmentManager(),"timePicker");
    }
}
