package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void handleLogin(View view) {
        EditText name = findViewById(R.id.editTextLogin);
        String string = name.getText().toString();
        TextView textView = findViewById(R.id.textViewloginresult);
        textView.setText(string);
    }
}
