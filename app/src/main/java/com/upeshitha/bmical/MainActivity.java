package com.upeshitha.bmical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button badd,bmin,bmulty,bdevide;  // define button
    TextView rs;  // define result text
    EditText n1, n2; // define edit text

    float result;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        badd = findViewById(R.id.bunplus);
        bmin = findViewById(R.id.bunmin);
        bmulty = findViewById(R.id.bunmulty);
        bdevide = findViewById(R.id.bundiv);

        rs = findViewById(R.id.result);
        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 + num2;

                rs.setText(String.valueOf(result));
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 - num2;

                rs.setText(String.valueOf(result));
            }
        });

        bmulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 * num2;

                rs.setText(String.valueOf(result));
            }
        });

        bdevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                result = num1 / num2;

                rs.setText(String.valueOf(result));
            }
        });
    }
}