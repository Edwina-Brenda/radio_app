
package com.edwinabrenda.family;

import android.content.Context;
import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomListAdapter extends BaseAdapter
{
  Context context;
  List<Translate> translates;
  String layoutchooser="";
  String chattxt;
  int next=0;


  String englishWorddb,kiswahiliWorddb;

    public CustomListAdapter(Context context, List<Translate> translates) {
        this.context = context;
        this.translates = translates;
    }


    @Override
    public int getCount() {
        return translates.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
       view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ImageView wordImage=view.findViewById(R.id.wordImage);
        TextView englishWord=view.findViewById(R.id.englishWord);
        TextView kiswahiliWord = view.findViewById(R.id.kiswahiliWord);

        englishWord.setText(translates.get(position).getEnglishWord().toString());
        kiswahiliWord.setText(translates.get(position).getKiswahiliWord().toString());

        return view;

    }
}