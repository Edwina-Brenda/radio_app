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

public class Colors extends AppCompatActivity {

    RelativeLayout main;
    ListView listView;
    List<String> colorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        main= findViewById(R.id.numberLayout);

        listView = findViewById(R.id.list_items);
        colorList = new ArrayList<>();
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("red");
        colorList.add("Pink");
        colorList.add("Purple");

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,colorList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You seleted"+colorList.get(position),Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.pink));
    }
}