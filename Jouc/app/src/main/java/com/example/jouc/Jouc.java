package com.example.jouc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Jouc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jouc);
        String Faculty= "Faculty Issues :-";
        String Student="Student Issues :-";
        String Suggestion="Suggestion :-";
        String Money="Money Issues :-";

        Button Faculty_issues;
        Button MoneyIssues;
        Button SuggestionIssues;
        Button StudentIssues;

        MoneyIssues = findViewById(R.id.Money);
        SuggestionIssues = findViewById(R.id.Suggestion);
        StudentIssues = findViewById(R.id.Student);
        Faculty_issues=findViewById(R.id.Facultyissues);

        Faculty_issues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_third();
                Intent intent = new Intent(getBaseContext(), Submiting.class);
                intent.putExtra("EXTRA_SESSION_ID", Faculty);
                startActivity(intent);
            }
        });
        SuggestionIssues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_third();
                Intent intent = new Intent(getBaseContext(), Submiting.class);
                intent.putExtra("EXTRA_SESSION_ID", Suggestion);
                startActivity(intent);
            }
        });
        StudentIssues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_third();
                Intent intent = new Intent(getBaseContext(), Submiting.class);
                intent.putExtra("EXTRA_SESSION_ID", Student);
                startActivity(intent);
            }
        });

        MoneyIssues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_third();
                Intent intent = new Intent(getBaseContext(), Submiting.class);
                intent.putExtra("EXTRA_SESSION_ID", Money);
                startActivity(intent);
            }
        });

//        Intent intent = new Intent(getBaseContext(), Submiting.class);
//        intent.putExtra("EXTRA_SESSION_ID", Jouc);
//        startActivity(intent);
    }

    public void to_third (){
        Intent i = new Intent (this, Submiting.class);
        startActivity(i);
    }

}