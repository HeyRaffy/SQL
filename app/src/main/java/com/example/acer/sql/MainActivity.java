package com.example.acer.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eFN, eLN, eGrade;
    DBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper helper = new DBHelper(this);
        eFN = findViewById(R.id.etFN);
        eLN = findViewById(R.id.etLN);
        eGrade = findViewById(R.id.etGrade);
    }

    public void addRecord(View v){
        String fname = eFN.getText().toString();
        String lname = eLN.getText().toString();
        int grade = Integer.parseInt(eGrade.getText().toString());

    }
}
