package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        TextView vBrand = findViewById(R.id.tvBrand);
        TextView vKm = findViewById(R.id.tvKm);
        Intent intent = getIntent();
        Vehicle intentBrand = intent.getParcelableExtra("SUPER_BRAND");

        vBrand.setText(intentBrand.getBrand());
        String kilometreString = String.valueOf(intentBrand.getKilometers());
        vKm.setText(kilometreString);


    }
}
