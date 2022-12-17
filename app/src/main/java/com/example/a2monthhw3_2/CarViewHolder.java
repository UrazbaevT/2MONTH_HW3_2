package com.example.a2monthhw3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCars;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCars = itemView.findViewById(R.id.item_car);
    }

    public void bind(String car){
        tvCars.setText(car);
    }
}
