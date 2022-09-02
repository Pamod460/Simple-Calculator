package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText val1;
    EditText val2;
    TextView txtAnswer;
    TextView lblBinary;
    TextView lblOctal;
    TextView lblHexaDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = findViewById(R.id.txtValue1);
        val2 = findViewById(R.id.txtValue2);
        txtAnswer = findViewById(R.id.txtAnswer);
        lblBinary = findViewById(R.id.lblBinary);
        lblOctal = findViewById(R.id.lblOctal);
        lblHexaDecimal = findViewById(R.id.lblHexaDecimal);
    }

    public void Calculate(View v) {
        String tag = v.getTag().toString();
        String num1 = val1.getText().toString();
        String num2 = val2.getText().toString();
        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);
        double ans = 0;
        switch (tag) {
            case "add":
                ans = value1 + value2;
                break;
            case "sub":
                ans = value1 - value2;
                break;
            case "mul":
                ans = value1 * value2;
                break;
            case "div":
                ans = value1 / value2;
                break;
        }
        txtAnswer.setText("" + ans);
    }

    public void convert(View v) {
        String tag = v.getTag().toString();
        String ans = txtAnswer.getText().toString();
        double ans1 = Double.parseDouble(ans);
        String conAns = "";
        switch (tag) {
            case "bin":
                conAns = Integer.toBinaryString((int) ans1);
                lblBinary.setText("" + conAns);
                break;
            case "oct":
                conAns = Integer.toOctalString((int) ans1);
                lblOctal.setText("" + conAns);
                break;
            case "hex":
                conAns = Integer.toHexString((int) ans1);
                lblHexaDecimal.setText("" + conAns);
                break;
        }

    }

    public void btnClear(View v) {
        val1.setText("");
        val2.setText("");
        txtAnswer.setText("");
        lblBinary.setText("");
        lblOctal.setText("");
        lblHexaDecimal.setText("");


    }

}