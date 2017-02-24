package com.example.elad.newbabyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    private EditText nameText;
    private EditText lastDateText;
    private Button acceptButton;
    private TextView dateView;
    private TextView nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        nameText = (EditText)findViewById(R.id.nameText);
        lastDateText = (EditText)findViewById(R.id.lastDateText);
        acceptButton = (Button)findViewById(R.id.acceptButton);
        dateView = (TextView)findViewById(R.id.dateView);
        nameView = (TextView)findViewById(R.id.nameView);

        acceptButton.setOnClickListener(new onClickListener());
        lastDateText.setOnClickListener(new onClickListener());
    }

    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //if acceptButton
                // if name is good (function)
                // if date is good (function)
                // move to MainPage activity with the name and date.
            //if lastDateText
                //open calendar.
        }
    }
}
