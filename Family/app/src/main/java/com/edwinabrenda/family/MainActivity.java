package com.edwinabrenda.family;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button family,number,color,phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        family=findViewById(R.id.family);
        number=findViewById(R.id.number);
        color=findViewById(R.id.color);
        phrase=findViewById(R.id.phrase);
}

    public void phrases(View view) {
    }

    public void colors(View view) {
        Intent intent = new Intent(MainActivity.this,Colors.class);
        startActivity(intent);
    }

    public void numbers(View view) {
        Intent intent = new Intent(MainActivity.this,Number.class);
        startActivity(intent);
    }

    public void family(View view) {
        Intent intent = new Intent(MainActivity.this,Family.class);
        startActivity(intent);
    }
}