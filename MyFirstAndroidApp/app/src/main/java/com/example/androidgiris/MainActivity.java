package com.example.androidgiris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstandroidapp.R;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
EditText editNumber1,editNumber2;
Button btn;
TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber1 = findViewById(R.id.inputNumber1);
        editNumber2 = findViewById(R.id.inputNumber2);
        btn = findViewById(R.id.calculateBtn);
        txtResult = findViewById(R.id.resultTxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = Integer.valueOf(editNumber1.getText().toString()) + Integer.valueOf(editNumber2.getText().toString());
                txtResult.setText(String.valueOf(result));
            }
        });
    }
}