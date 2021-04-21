package com.riquest.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView1,textView2;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btncal);
        editText1 = findViewById(R.id.edweight);
        editText2 = findViewById(R.id.edheight);
        textView1 = findViewById(R.id.result);
        textView2 = findViewById(R.id.ket);
    }

    public void Klik(View view) {
        String text = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        double num = Integer.parseInt(text);
        double num2 = Integer.parseInt(text2);
        double hasil = bmi.process(num,num2);
        String finalresult = String.valueOf(hasil);
        textView1.setText(finalresult);
    }
}