package com.edwinabrenda.kui_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.edwinabrenda.kui_app.databinding.ActivityAddPostBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddPostActivity extends AppCompatActivity {

    ActivityAddPostBinding binding;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAddPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        databaseReference= FirebaseDatabase.getInstance().getReference( "post");
        binding.buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String title=binding.edtPostTitle.getText().toString();
                String discription=binding.editPostDescription.getText().toString();

                if (title.isEmpty()){


                }

            }
        });

    }
}