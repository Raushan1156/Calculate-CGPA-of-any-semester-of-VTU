package com.raushan.vtumarkscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView studentName,stname,totalMarks,totalMark,totalPercentage,totalPercent,totalgpa,totalGradePoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        studentName=findViewById(R.id.studentName);
        stname=findViewById(R.id.stname);
        totalMarks=findViewById(R.id.totalMarks);
        totalMark=findViewById(R.id.totalMark);
        totalPercentage=findViewById(R.id.totalPercentage);
        totalPercent=findViewById(R.id.totalPercent);
        totalgpa=findViewById(R.id.totalgpa);
        totalGradePoint=findViewById(R.id.totalGradePoint);

        Intent intent=getIntent();
        String studName=intent.getStringExtra(MainActivity.studentname);
        stname.setText(studName);

        String Tmarks=intent.getStringExtra(MainActivity.TotalMarks);
        totalMark.setText(Tmarks);

        String Tpercent=intent.getStringExtra(MainActivity.AverageMarks);
        totalPercent.setText(Tpercent+"%");

        String Tgpa=intent.getStringExtra(MainActivity.GradePoint);
        totalGradePoint.setText(Tgpa);
    }
}