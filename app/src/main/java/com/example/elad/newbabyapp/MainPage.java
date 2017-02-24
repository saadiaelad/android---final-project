package com.example.elad.newbabyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    private TextView helloView;
    private TextView nameText;
    private TextView weekView;
    private TextView weekText;
    private TextView weightView;
    private TextView weightText;
    private TextView birthView;
    private TextView birthText;
    private TextView nextExamView;
    private TextView nextExamText;
    private TextView sinceView;
    private TextView sinceText;
    private TextView tillView;
    private TextView tillText;
    private Button allExamsButton;
    private Button signOutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        helloView = (TextView)findViewById(R.id.helloView);
        nameText = (TextView)findViewById(R.id.nameText);
        weekView = (TextView)findViewById(R.id.weekView);
        weekText = (TextView)findViewById(R.id.weekText);
        weightView = (TextView)findViewById(R.id.weightView);
        weightText = (TextView)findViewById(R.id.weightText);
        birthView = (TextView)findViewById(R.id.birthView);
        birthText = (TextView)findViewById(R.id.birthText);
        nextExamView = (TextView)findViewById(R.id.nextExamView);
        nextExamText = (TextView)findViewById(R.id.nextExamText);
        sinceView = (TextView)findViewById(R.id.sinceView);
        sinceText = (TextView)findViewById(R.id.sinceText);
        tillView = (TextView)findViewById(R.id.tillView);
        tillText = (TextView)findViewById(R.id.tillText);
        allExamsButton = (Button)findViewById(R.id.allExamsButton);
        signOutButton = (Button)findViewById(R.id.signOutButton);

        allExamsButton.setOnClickListener(new onClickListener());
        signOutButton.setOnClickListener(new onClickListener());

        //put name on nameText.
        // put all the information.


    }

    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //if signOutButton
                // clean all (function)
                // return to loginPage.
            //if allExamsButton
                //move to new activity with all the exmas options (only to see the exam and when to do it.
        }
    }
}
