package com.edwinabrenda.kui_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edwinabrenda.kui_app.databinding.ActivityAuthDashboardBinding;

public class AuthDashboardActivity extends AppCompatActivity {

    ActivityAuthDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAuthDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


      binding.buttonGetStarted.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(AuthDashboardActivity.this,RegisterActivity.class);
              startActivity(intent);
          }
      });

        binding.buttonGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AuthDashboardActivity.this,LoginActivity.class);
                startActivity(intent);
    }


}