package com.edwinabrenda.kui_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.edwinabrenda.kui_app.databinding.ActivityRegisterBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;

    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseAuth = firebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        binding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.editRegisterEmail.getText().toString();
                String password = binding.edtRegisterPassword.getText().toString();
                String Username = binding.editRegisterUserName.getText().toString();
                String Phonenumber = binding.edtRegisterPhoneNum.getText().toString();
                String regnumber = binding.editRegisterRegNo.getText().toString();

                if (email.isEmpty()) {
                    binding.editRegisterEmail.setError("Email is empty");
                } else if (password.isEmpty()) {
                    binding.edtRegisterPassword.setError("Password can not be empty");
                } else if (Username.isEmpty()) {
                    binding.editRegisterUserName.setError("Enter your username");
                } else if (Phonenumber.isEmpty()) {
                    binding.edtRegisterPhoneNum.setError("enter phonenumber");
                } else if (regnumber.isEmpty()) {
                    binding.editRegisterRegNo.setError("enter regnumber");
                } else {
                    binding.RegisterProgressBar.setVisibility(View.VISIBLE);

                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                User user = new User(Username, regnumber, Phonenumber, email);
                                String userId = firebaseAuth.getCurrentUser().getUid();
                                databaseReference.child(userId).setValue(user);
                            } else {
                                Toast.makeText(getApplicationContext(), "Account registration failed", Toast.LENGTH_SHORT).show();
                                binding.RegisterProgressBar.setVisibility(View.GONE);
                            }
                        }
                    });
                }

            }
        });
    }
}