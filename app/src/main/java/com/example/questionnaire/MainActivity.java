package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button radioButtonsBtn = findViewById(R.id.radio_buttons_btn);
        radioButtonsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonsActivity.class);
            startActivity(intent);
        });

        Button checkBoxesBtn = findViewById(R.id.check_boxes_btn);
        checkBoxesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxesActivity.class);
            startActivity(intent);
        });
    }
}