package com.example.a2monthhw3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView carRecyclerView;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        CarAdapter adapter = new CarAdapter(carList);
        carRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("Audi");
        carList.add("Ford");
        carList.add("Hyundai");
        carList.add("Lada");
        carList.add("Mercedes-Benz");
        carList.add("Nissan");
        carList.add("Volkswagen");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Kia");
        carList.add("Mazda");
        carList.add("Mitsubishi");
        carList.add("Renault");
        carList.add("Toyota");
        carList.add("Tesla");
    }
}