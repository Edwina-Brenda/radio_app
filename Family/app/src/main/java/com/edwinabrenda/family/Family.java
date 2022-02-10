package com.edwinabrenda.family;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Family extends AppCompatActivity {
    RelativeLayout main;
    ListView listView;
    List<String> fList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        main=findViewById(R.id.numberLayout);

        listView = findViewById(R.id.list_items);

        fList = new ArrayList<>();
        fList.add("Father");
        fList.add("Mother");
        fList.add("Sister");
        fList.add("Brother");
        fList.add("GrandMother");

       ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,fList);
       listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Toast.makeText(getApplicationContext(), "You seleted"+fList.get(position),Toast.LENGTH_SHORT).show();
           }
       });
    }

    @Override
    protected void onStart() {
        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.royalblue));
    }
}