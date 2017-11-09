package com.example.brandonkraybill.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int chemistryGrade = 4;
    int mathGrade = 4;
    int biologyGrade = 4;
    int historyGrade = 4;
    int englishGrade = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chem_increase(View view) {
        if (chemistryGrade > 0) {
            chemistryGrade = chemistryGrade - 1;
        } else {
            Toast.makeText(getApplicationContext(), "Max Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayChemGrade();
    }

    public void chem_decrease(View view) {
        if (chemistryGrade < 10) {
            chemistryGrade = chemistryGrade + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Lowest Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayChemGrade();
    }

    public void displayChemGrade() {
        TextView chemTextView = (TextView) findViewById(R.id.chemistry_text_view);
        chemTextView.setText(getChemistryGrade(chemistryGrade));
    }

    public void math_increase(View view) {
        if (mathGrade > 0) {
            mathGrade = mathGrade - 1;
        } else {
            Toast.makeText(getApplicationContext(), "Max Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayMathGrade();
    }

    public void math_decrease(View view) {
        if (mathGrade < 10) {
            mathGrade = mathGrade + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Lowest Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayMathGrade();
    }

    public void displayMathGrade() {
        TextView mathTextView = (TextView) findViewById(R.id.math_text_view);
        mathTextView.setText(getMathGrade(mathGrade));
    }

    public void history_increase(View view) {
        if (historyGrade > 0) {
            historyGrade = historyGrade - 1;
        } else {
            Toast.makeText(getApplicationContext(), "Max Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayHistoryGrade();
    }

    public void history_decrease(View view) {
        if (historyGrade < 10) {
            historyGrade = historyGrade + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Lowest Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayHistoryGrade();
    }

    public void displayHistoryGrade() {
        TextView historyTextView = (TextView) findViewById(R.id.history_text_view);
        historyTextView.setText(getHistoryGrade(historyGrade));
    }

    public void english_increase(View view) {
        if (englishGrade > 0) {
            englishGrade = englishGrade - 1;
        } else {
            Toast.makeText(getApplicationContext(), "Max Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayEnglishGrade();
    }

    public void english_decrease(View view) {
        if (englishGrade < 10) {
            englishGrade = englishGrade + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Lowest Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayEnglishGrade();
    }

    public void displayEnglishGrade() {
        TextView englishTextView = (TextView) findViewById(R.id.english_text_view);
        englishTextView.setText(getEnglishGrade(englishGrade));
    }

    public void bio_increase(View view) {
        if (biologyGrade > 0) {
            biologyGrade = biologyGrade - 1;
        } else {
            Toast.makeText(getApplicationContext(), "Max Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayBioGrade();
    }

    public void bio_decrease(View view) {
        if (biologyGrade < 10) {
            biologyGrade = biologyGrade + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Lowest Grade Reached.",
                    Toast.LENGTH_LONG).show();
        }
        displayBioGrade();
    }

    public void displayBioGrade() {
        TextView bioTextView = (TextView) findViewById(R.id.biology_text_view);
        bioTextView.setText(getBiologyGrade(biologyGrade));
    }







    public String createReportCard(String fullName, int chemistryGrade,int mathGrade,
                               int biologyGrade, int historyGrade, int englishGrade) {
        String gradeReport = "Name: " + fullName;
        gradeReport += "\nChemistry: " + grades[chemistryGrade];
        gradeReport += "\nMath: " + grades[mathGrade];
        gradeReport += "\nHistory: " + grades[historyGrade];
        gradeReport += "\nEnglish: " + grades[englishGrade];
        gradeReport += "\nBiology: " + grades[biologyGrade];
        return gradeReport;
    }

    public void displayMessage(View view) {
        EditText firstName = (EditText) findViewById(R.id.fname_edit_text);
        EditText lastName = (EditText) findViewById(R.id.lname_edit_text);
        String fullName = firstName.getText().toString() + " " + lastName.getText().toString();
        String gradeReport = createReportCard(fullName, chemistryGrade, mathGrade, biologyGrade, historyGrade, englishGrade);
        TextView reportTextView = (TextView) findViewById(R.id.grade_summary);
        reportTextView.setText(gradeReport);
    }


    String[] grades = {"A+","A","A-","B+","B","B-","C+","C","C-","D","F"};

    public String getChemistryGrade(int chemistryGrade) {
        return grades[chemistryGrade];
    }

    public String getMathGrade(int mathGrade) {
        return grades[mathGrade];
    }

    public String getBiologyGrade(int biologyGrade) {
        return grades[biologyGrade];
    }

    public String getHistoryGrade(int historyGrade) {
        return grades[historyGrade];
    }

    public String getEnglishGrade(int englishGrade) {
        return grades[englishGrade];
    }

}