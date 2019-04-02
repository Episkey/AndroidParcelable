package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button go = findViewById(R.id.bGo);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etBrand = findViewById(R.id.etBrand);
                EditText etKm = findViewById(R.id.etKm);

                String printBrand = etBrand.getText().toString();
                String printKm = etKm.getText().toString();
                int kilometre = Integer.parseInt(printKm);
                Vehicle vehicle = new Vehicle( printBrand, kilometre );

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("SUPER_BRAND", vehicle);
                startActivity(intent);
            }
        });
    }
}
