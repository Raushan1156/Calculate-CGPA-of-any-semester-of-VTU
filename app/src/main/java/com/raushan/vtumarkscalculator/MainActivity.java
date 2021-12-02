package com.raushan.vtumarkscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.raushan.vtumarkscalculator.R;


public class MainActivity extends AppCompatActivity {
    public static final String TotalMarks="package com.raushan.calculatemarks.extra.Name1";
    public static final String AverageMarks="package com.raushan.calculatemarks.extra.Name2";
    public static final String GradePoint="package com.raushan.calculatemarks.extra.Name3";
    public static final String studentname="package com.raushan.calculatemarks.extra.Name4";


    TextView smc,sname,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,Tcredit;
    EditText sname1,sub11,sub22,sub33,sub44,sub55,sub66,sub77,sub88,grd11,grd22,grd33,grd44,grd55,grd66,grd77,grd88,tc;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickbtn(View view)
    {

        smc=findViewById(R.id.smc);
        sname=findViewById(R.id.sname);
        sub1=findViewById(R.id.sub1);
        sub2=findViewById(R.id.sub2);
        sub3=findViewById(R.id.sub3);
        sub4=findViewById(R.id.sub4);
        sub5=findViewById(R.id.sub5);
        sub6=findViewById(R.id.sub6);
        sub7=findViewById(R.id.sub7);
        sub8=findViewById(R.id.sub8);
        Tcredit=findViewById(R.id.Tcredit);


//        avg=findViewById(R.id.avg);
//        avgmarks=findViewById(R.id.avgmarks);
//        grade=findViewById(R.id.grade);
//        gradePoint=findViewById(R.id.gradePoint);

        sname1=findViewById(R.id.sname1);
        sub11=findViewById(R.id.sub11);
        sub22=findViewById(R.id.sub22);
        sub33=findViewById(R.id.sub33);
        sub44=findViewById(R.id.sub44);
        sub55=findViewById(R.id.sub55);
        sub66=findViewById(R.id.sub66);
        sub77=findViewById(R.id.sub77);
        sub88=findViewById(R.id.sub88);

        grd11=findViewById(R.id.grd11);
        grd22=findViewById(R.id.grd22);
        grd33=findViewById(R.id.grd33);
        grd44=findViewById(R.id.grd44);
        grd55=findViewById(R.id.grd55);
        grd66=findViewById(R.id.grd66);
        grd77=findViewById(R.id.grd77);
        grd88=findViewById(R.id.grd88);

        tc=findViewById(R.id.tc);

        button=findViewById(R.id.button);

        Toast.makeText(MainActivity.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);

        //Reading Student Name
        String studentName=sname1.getText().toString();

        String s1=sub11.getText().toString();
        int s11=Integer.parseInt(s1);
        String s2=sub22.getText().toString();
        int s22=Integer.parseInt(s2);
        String s3=sub33.getText().toString();
        int s33=Integer.parseInt(s3);
        String s4=sub44.getText().toString();
        int s44=Integer.parseInt(s4);
        String s5=sub55.getText().toString();
        int s55=Integer.parseInt(s5);
        String s6=sub66.getText().toString();
        int s66=Integer.parseInt(s6);
        String s7=sub77.getText().toString();
        int s77=Integer.parseInt(s7);
        String s8=sub88.getText().toString();
        int s88=Integer.parseInt(s8);


        String g11=grd11.getText().toString();
        int grade1=Integer.parseInt(g11);
        String g22=grd22.getText().toString();
        int grade2=Integer.parseInt(g22);
        String g33=grd33.getText().toString();
        int grade3=Integer.parseInt(g33);
        String g44=grd44.getText().toString();
        int grade4=Integer.parseInt(g44);
        String g55=grd55.getText().toString();
        int grade5=Integer.parseInt(g55);
        String g66=grd66.getText().toString();
        int grade6=Integer.parseInt(g66);
        String g77=grd77.getText().toString();
        int grade7=Integer.parseInt(g77);
        String g88=grd88.getText().toString();
        int grade8=Integer.parseInt(g88);
        //finding total marks
        int total=(s11+s22+s33+s44+s55+s66+s77+s88);
        String totalMarks=Integer.toString(total);

        String TotalCredit=tc.getText().toString();
        int TC=Integer.parseInt(TotalCredit);
        //finding the percentage
        double val =Math.floor(((total*100)/800)*100)/100;
        String AverageVal=Double.toString(val);

        int subject1=grade1*(int)(Math.ceil(s11/10));
        int subject2=grade2*(int)(Math.ceil(s22/10));
        int subject3=grade3*(int)(Math.ceil(s33/10));
        int subject4=grade4*(int)(Math.ceil(s44/10));
        int subject5=grade5*(int)(Math.ceil(s55/10));
        int subject6=grade6*(int)(Math.ceil(s66/10));
        int subject7=grade7*(int)(Math.ceil(s77/10));
        int subject8=grade8*(int)(Math.ceil(s88/10));
        double sgpa=(subject1+subject2+subject3+subject4+subject5+subject6+subject7+subject8)/TC;
        String gradeval=Double.toString(sgpa);

        intent.putExtra(studentname,studentName);
        intent.putExtra(TotalMarks,totalMarks);
        intent.putExtra(AverageMarks,AverageVal);
        intent.putExtra(GradePoint,gradeval);
        startActivity(intent);


    }
}