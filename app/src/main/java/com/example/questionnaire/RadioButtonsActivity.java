package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioButton radioButtonBtn1 = findViewById(R.id.option1_btn);
            if(radioButtonBtn1.isChecked()) {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButtonBtn2 = findViewById(R.id.option2_btn);
            if(radioButtonBtn2.isChecked()) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButtonBtn3 = findViewById(R.id.option3_btn);
            if(radioButtonBtn3.isChecked()) {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButtonBtn4 = findViewById(R.id.option4_btn);
            if(radioButtonBtn4.isChecked()) {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }
        });
    }
}