package com.example.dbhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        	    DbHelper db;
        	    EditText editTextId ,editTextName ,editTextEmail ,editTextMobile;
	   Button buttonInsert, buttonView, buttonDelete,buttonUpdate, buttonSearch;
	   String id;
	   String name;
	   String email;
	   String mobile;
	   String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
        	        super.onCreate(savedInstanceState);
        	        setContentView(R.layout.activity_main);

        	        editTextId = findViewById(R.id.edit_id);
        	        editTextName = findViewById(R.id.edit_name);
        	        editTextEmail = findViewById(R.id.edit_email);
        	        editTextMobile = findViewById(R.id.edit_mobile);

        	        buttonInsert = findViewById(R.id.button_insert);
        	        buttonView = findViewById(R.id.button_view);
        	        buttonDelete = findViewById(R.id.button_delete);
        	        buttonUpdate = findViewById(R.id.button_update);
        	        buttonSearch = findViewById(R.id.button_search);

        	        buttonInsert.setOnClickListener(this);
        	        buttonView.setOnClickListener(this);
                buttonDelete.setOnClickListener(this);
                buttonUpdate.setOnClickListener(this);
        	        buttonSearch.setOnClickListener(this);

        	        db=new DbHelper(this);
        	    }
	    @Override
	    public void onClick(View v) {

        	        switch (v.getId()){


            	            case R.id.button_insert:
            	            	    id=editTextId.getText().toString();
            	            	    if(id.length()>8)
									{
										Toast.makeText(this, "ID too long", Toast.LENGTH_SHORT).show();
										editTextId.setText("");
										editTextId.setFocusable(true);
										editTextId.setFocusableInTouchMode(true);
										editTextId.requestFocus();
									}

            	            	    else
									{
                	                name=editTextName.getText().toString();
                	                email=editTextEmail.getText().toString();

                	                mobile=editTextMobile.getText().toString();
                	                if(id.equals("")|name.equals("") | email.equals("") | mobile.equals("")){
                	                    Toast.makeText(this, "Please fill the Fields", Toast.LENGTH_SHORT).show();
                    	                }
										else if (!(email.trim().matches(emailPattern))) {
											Toast.makeText(getApplicationContext(),"invalid email address",Toast.LENGTH_SHORT).show();
										editTextEmail.setText("");
										editTextEmail.setFocusable(true);
										editTextEmail.setFocusableInTouchMode(true);
										editTextEmail.requestFocus();
										}
                	                else {
                    	                    if(db.insertStudent(id,name,email,mobile))
											{
												editTextId.setText("");
												editTextName.setText("");
												editTextEmail.setText("");
												editTextMobile.setText("");
												Toast.makeText(this, "saved successfully", Toast.LENGTH_SHORT).show();
											}
                    	                    else
											{
												Toast.makeText(this, "registration failed", Toast.LENGTH_SHORT).show();
											}

                    	                }}
                	                break;

            	            case R.id.button_view:
                	                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                	                startActivity(intent);
                	                break;

            	            case R.id.button_delete:
                	                id = editTextId.getText().toString();
                	                if(id.equals("")){
                    	                    Toast.makeText(this, "Plase fill the Id", Toast.LENGTH_SHORT).show();
                    	                }else {
                    	                    long l = Long.parseLong(id);
                    	                    db.deleteStudent(l);
                    	                    editTextId.setText("");
                    	                    editTextName.setText("");
                    	                    editTextEmail.setText("");
                    	                    editTextMobile.setText("");
                    	                    Toast.makeText(this, "deleted successfully", Toast.LENGTH_SHORT).show();
                    	                }
                	                break;

            	            case R.id.button_update:
                	                id=editTextId.getText().toString().trim();
                	                name=editTextName.getText().toString();
                	                email=editTextEmail.getText().toString();
                	                mobile=editTextMobile.getText().toString();
                	                if(id.equals("") | name.equals("") | email.equals("") | mobile.equals("")){
                    	                    Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                                    }else {
                    	                    long l= Long.parseLong(id);
                    	                    db.updateStudent(l,name,email,mobile);
                    	                    editTextId.setText("");
                    	                    editTextName.setText("");
                    	                    editTextEmail.setText("");
                    	                    editTextMobile.setText("");
                    	                    Toast.makeText(this, "updated successfully", Toast.LENGTH_SHORT).show();
                    	                }
                	                break;
            	            case R.id.button_search:
                	                id=editTextId.getText().toString().trim();
                	                if(id.equals("")){
                    	                    Toast.makeText(this, "Please Fill the Id", Toast.LENGTH_SHORT).show();
                    	                }else {
                    	                    try {
                        	                        long l1= Long.parseLong(id);
                        	                        name=db.getName(l1);
                        	                        email=db.getEmail(l1);
                        	                        mobile=db.getMobile(l1);

                        	                        editTextName.setText(name);
                        	                        editTextEmail.setText(email);
                        	                        editTextMobile.setText(mobile);
                        	                        Toast.makeText(this, "searched successfully", Toast.LENGTH_SHORT).show();

                        	                    }
                                        catch (Exception e)
                    	                    {
                        	                        Toast.makeText(this, "Id is not Available", Toast.LENGTH_SHORT).show();
                        	                    }
                                    }
                	                break;
            	        }
            }
	}

