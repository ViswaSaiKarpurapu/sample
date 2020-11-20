package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Srinagar – Venice of the East");
        animalNames.add("Jaipur – The Paris of India");
        animalNames.add("Chandigarh- The City Beautiful");
        animalNames.add("Hyderabad- City of Pearls");
        animalNames.add("Mysore- The Heritage City");
        animalNames.add("Chennai- The Detroit Of India");
        animalNames.add("Visakhapatnam- The Coastal City Of The South");
        animalNames.add("Agra- The Land Blessed By Medieval Mughal Kings");
        animalNames.add("Kochi- The Queen of the Arabian Sea");
        animalNames.add("Delhi- The Dilwali city");
        animalNames.add("Varanasi- The City Of Temples");
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}