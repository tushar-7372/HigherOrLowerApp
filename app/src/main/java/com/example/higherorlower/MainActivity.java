package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void guess(View view)
    {
        Log.i("Info","Button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);
        Log.i("Guessed number",editText.getText().toString());
        int guessedNumber=Integer.parseInt(editText.getText().toString());
        String message;
        if(randomNumber<guessedNumber)
        {
            message="Lower";
        }
        else if(randomNumber>guessedNumber)
        {
            message="Higher";
        }
        else
        {
            message="You got it right";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randomNumber=rand.nextInt(20)+1;
    }
}