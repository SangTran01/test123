package com.example.tony_.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String q1Answer;
    private String q2Answer;
    private String q3Answer;
    private String q4Answer;
    private String q5Answer;
    private String q6Answer;
    private boolean q7Answer;
    private String q8Answer;
    private String q9Answer;
    private String q10Answer;

    private int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {
        quizScore = 0;

        EditText q1Edittext = findViewById(R.id.q1_edit_text);
        EditText q2EditText = findViewById(R.id.q2_edit_text);
        EditText q3EditText = findViewById(R.id.q3_edit_text);

        RadioGroup q4RadioGroup = findViewById(R.id.q4_radio_group);
        RadioButton q4RadioButton;
        int q4SelectedId = q4RadioGroup.getCheckedRadioButtonId();
        q4RadioButton = findViewById(q4SelectedId);

        EditText q5EditText = findViewById(R.id.q5_edit_text);
        EditText q6EditText = findViewById(R.id.q6_edit_text);
        CheckBox q7Checkbox = findViewById(R.id.q7_cb_clowns);

        RadioGroup q8RadioGroup = findViewById(R.id.q8_radio_group);
        RadioButton q8RadioButton;
        int q8SelectedId = q8RadioGroup.getCheckedRadioButtonId();
        q8RadioButton = findViewById(q8SelectedId);

        EditText q9EditText = findViewById(R.id.q9_edit_text);
        EditText q10EditText = findViewById(R.id.q10_edit_text);

        q1Answer = q1Edittext.getText().toString();
        q2Answer = q2EditText.getText().toString();
        q3Answer = q3EditText.getText().toString();


        q5Answer = q5EditText.getText().toString();
        q6Answer = q6EditText.getText().toString();
        q7Answer = q7Checkbox.isChecked();


        //q8Answer = q8RadioButton.getText() == null ? "" : q8RadioButton.getText().toString();
        q9Answer = q9EditText.getText().toString();
        q10Answer = q10EditText.getText().toString();

        if (q1Answer.equals("3")) {
            quizScore += 1;
        }
        if (q2Answer.equals("20")) {
            quizScore += 1;
        }
        if (q3Answer.equals("12")) {
            quizScore += 1;
        }
        if (q4RadioGroup.getCheckedRadioButtonId() != -1) {
            q4Answer = q4RadioButton.getText().toString();
            if (q4Answer.toLowerCase().equals("pacific")) {
                quizScore += 1;
            }
        }
        if (q5Answer.equals("5")) {
            quizScore += 1;
        }
        if (q6Answer.toLowerCase().trim().equals("octopus")) {
            quizScore += 1;
        }
        if (q7Answer) {
            quizScore += 1;
        }
        if (q8RadioGroup.getCheckedRadioButtonId() != -1) {
            q8Answer = q8RadioButton.getText().toString();
            if (q8Answer.equals("-40")) {
                quizScore += 1;
            }
        }
        if (q9Answer.toLowerCase().trim().equals("amazon")) {
            quizScore += 1;
        }
        if (q10Answer.toLowerCase().trim().equals("madrid")) {
            quizScore += 1;
        }

        Toast.makeText(getApplicationContext(),
                quizScore + "/10",
                Toast.LENGTH_SHORT).show();
    }
}
