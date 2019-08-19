package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     static final String MKEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.button_login:
                EditText nameEditText = findViewById(R.id.editTextName);
                String name = nameEditText.getText().toString();

                Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

                break;
            case R.id.button_cancel:
                //Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show();
                Intent catIntent = new Intent(MainActivity.this,CategoriesActivity.class);
                catIntent.putExtra(MKEY,"abdul");
                startActivity(catIntent);

                break;
        }
    }
}
