package com.codingpee.martyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = findViewById(R.id.searchView);
        ListView listView = findViewById(R.id.listview);
        List<String> list = new ArrayList<>();
        list.add("Andhra Pradesh");
        list.add("Arunachal Pradesh");
        list.add("Assam");
        list.add("Bihar");
        list.add("Chhattisgarh");
        list.add("Goa");
        list.add("Gujarat");
        list.add("Haryana");
        list.add("Himachal Pradesh");
        list.add("Jharkhand");
        list.add("Karnataka");
        list.add("Kerala");
        list.add("Maharashtra");
        list.add("Madhya Pradesh");
        list.add("Manipur");
        list.add("Meghalaya");
        list.add("Mizoram");
        list.add("Nagaland");
        list.add("Odisha");
        list.add("Punjab");
        list.add("Rajasthan");
        list.add("Sikkim");
        list.add("Tamil Nadu");
        list.add("Tripura");
        list.add("Telangana");
        list.add("Uttar Pradesh");
        list.add("Uttarakhand");
        list.add("West Bengal");
        list.add("Andaman & Nicobar (UT)");
        list.add("Chandigarh (UT)");
        list.add("Dadra & Nagar Haveli and Daman & Diu (UT)");
        list.add("Delhi [National Capital Territory (NCT)]");
        list.add("Jammu & Kashmir (UT)");
        list.add("Ladakh (UT)");
        list.add("Lakshadweep (UT)");
        list.add("Puducherry (UT)");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,list);
        listView.setAdapter(arrayAdapter);



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}