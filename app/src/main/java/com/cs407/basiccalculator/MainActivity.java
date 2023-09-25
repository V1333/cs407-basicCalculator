package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickForContent(View view) {
        EditText eText = findViewById(R.id.editTextText);
        EditText eText2 = findViewById(R.id.editTextText2);
        int i = Integer.parseInt(eText.getText().toString());
        int j = Integer.parseInt(eText2.getText().toString());
        int z = i + j;
        goToActivity(String.valueOf(z));
        Log.i("INFO", String.valueOf(z));
    }

    public void clickForContent2(View view) {
        EditText eText = findViewById(R.id.editTextText);
        EditText eText2 = findViewById(R.id.editTextText2);
        int i = Integer.parseInt(eText.getText().toString());
        int j = Integer.parseInt(eText2.getText().toString());
        int z = j - i;
        Log.i("INFO", String.valueOf(z));
        if (z < 0) {
            goToActivity("" + z);
        }
        else {
            goToActivity(String.valueOf(z));
        }
    }

    public void clickForContent3(View view) {
        EditText eText = findViewById(R.id.editTextText);
        EditText eText2 = findViewById(R.id.editTextText2);
        int i = Integer.parseInt(eText.getText().toString());
        int j = Integer.parseInt(eText2.getText().toString());
        int z = i * j;
        goToActivity(String.valueOf(z));
    }

    public void clickForContent4(View view) {
        EditText eText = findViewById(R.id.editTextText);
        EditText eText2 = findViewById(R.id.editTextText2);
        double i = Integer.parseInt(eText.getText().toString());
        double j = Integer.parseInt(eText2.getText().toString());
        double z = j / i;
        Log.i("INFO", String.valueOf(z));
        goToActivity("" + z);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Result", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}