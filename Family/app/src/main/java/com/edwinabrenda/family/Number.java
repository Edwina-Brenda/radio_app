
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

public class Number extends AppCompatActivity
{
    RelativeLayout main;
    ListView listView;
    List<Translate>nList;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        main= findViewById(R.id.numberLayout);

        listView = findViewById(R.id.list_items);


        nList = new ArrayList<>();
        nList.add(new Translate("ONE","MOJA",R.drawable.edwinaback));
        nList.add(new Translate("TWO","MBILI",R.drawable.edwinaback));
        nList.add(new Translate("THREE","THREE",R.drawable.edwinaback));
        nList.add(new Translate("FOUR","NNE",R.drawable.edwinaback));
        nList.add(new Translate("FIVE","TANO",R.drawable.edwinaback));
        nList.add(new Translate("SIX","SITA",R.drawable.edwinaback));
        nList.add(new Translate("SEVEN","SABA",R.drawable.edwinaback));
        nList.add(new Translate("EIGHT","NANE",R.drawable.edwinaback));
        nList.add(new Translate("TEN","TISA",R.drawable.edwinaback));
        nList.add(new Translate("TEN","KUMI",R.drawable.edwinaback));


        ArrayAdapter<Translate> adapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,nList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "You seleted"+nList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        main.setBackgroundColor(getResources().getColor(R.color.orange));
        super.onResume();
    }
}