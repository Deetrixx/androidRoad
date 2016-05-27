package com.example.dennis.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] myFavourites = {"Starwars", "BigBang", "Startreck", "BrooklynNineNine", "Smallville", "Archer", "Boondocks", "FamilyGuy"
        };
        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                myFavourites);
        ListView myListview = (ListView) findViewById(R.id.mylistview);
        myListview.setAdapter(theAdapter);
         

    }
}
