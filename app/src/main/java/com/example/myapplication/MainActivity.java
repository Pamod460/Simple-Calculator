package com.example.myapplication;

import android.annotation.SuppressLint;
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


    @SuppressLint("SetTextI18n")
    public void btnSum(View v) {

        String num1 = val1.getText().toString();
        String num2 = val2.getText().toString();
        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);
        double answer = value1 + value2;
        txtAnswer.setText("" + answer);
    }

    @SuppressLint("SetTextI18n")
    public void btnSub(View v) {
        String num1 = val1.getText().toString();
        String num2 = val2.getText().toString();
        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);
        double answer = value1 - value2;
        txtAnswer.setText("" + answer);
    }

    @SuppressLint("SetTextI18n")
    public void btnMul(View v) {
        String num1 = val1.getText().toString();
        String num2 = val2.getText().toString();
        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);
        double answer = value1 * value2;
        txtAnswer.setText("" + answer);
    }

    @SuppressLint("SetTextI18n")
    public void btnDiv(View v) {
        String num1 = val1.getText().toString();
        String num2 = val2.getText().toString();
        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);
        double answer = value1 / value2;
        txtAnswer.setText("" + answer);

    }

    @SuppressLint("SetTextI18n")
    public void btnBinary(View v) {
        String ans = txtAnswer.getText().toString();
        double ans1 = Double.parseDouble(ans);
        String binaryAns = Integer.toBinaryString((int) ans1);
        lblBinary.setText("" + binaryAns);

    }

    @SuppressLint("SetTextI18n")
    public void btnOctal(View v) {
        String ans = txtAnswer.getText().toString();
        double ans1 = Double.parseDouble(ans);
        String octalAns = Integer.toOctalString((int) ans1);
        lblOctal.setText("" + octalAns);

    }

    @SuppressLint("SetTextI18n")
    public void btnHex(View v) {
        String ans = txtAnswer.getText().toString();
        double ans1 = Double.parseDouble(ans);
        String hexAns = Integer.toHexString((int) ans1);
        lblHexaDecimal.setText("" + hexAns);

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