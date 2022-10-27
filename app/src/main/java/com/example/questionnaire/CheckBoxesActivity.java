package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class CheckBoxesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);
        Button verifyBoxBtn = findViewById(R.id.verify_box_btn);
        verifyBoxBtn.setOnClickListener(view -> {
           CheckBox box1 = findViewById(R.id.box1_btn);
           CheckBox box2 = findViewById(R.id.box2_btn);
           CheckBox box3 = findViewById(R.id.box3_btn);
           CheckBox box4 = findViewById(R.id.box4_btn);
           CheckBox box5 = findViewById(R.id.box5_btn);
           CheckBox box6 = findViewById(R.id.box6_btn);
           if(box1.isChecked() && box4.isChecked() && box5.isChecked() && box2.isChecked() == false && box3.isChecked() == false && box6.isChecked() == false){
               Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
           } else {
               Toast.makeText(this, "Not correct", Toast.LENGTH_SHORT).show();
           }
        });
    }
}