package com.example.cgiday1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     static final String MKEY = "key";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "created", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "resumed", Toast.LENGTH_SHORT).show();
        Log.w(TAG,"please restore the data as activtity is resuming");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "paused", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"please saved the data as activtity is pausing");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "stopped", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"please close files as the activity is stopped");


    }

    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.button_login:
                EditText nameEditText = findViewById(R.id.editTextName);
                String name = nameEditText.getText().toString();

                Toast.makeText(this, getResources().getString(R.string.enter_name), Toast.LENGTH_SHORT).show();

                break;
            case R.id.button_cancel:
                //Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show();
                Intent catIntent = new Intent(MainActivity.this,CategoriesActivity.class);
                catIntent.putExtra(MKEY,"abdul");
                startActivity(catIntent);

                break;

            case R.id.buttonDialer:
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"));

                startActivity(dialIntent);
                break;

            case R.id.buttoncalc:
                 createAlarm("cgi alarm",18,17);
                break;
        }
    }

    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
