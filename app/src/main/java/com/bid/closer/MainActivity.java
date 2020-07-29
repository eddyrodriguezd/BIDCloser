package com.bid.closer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonRestaurant = findViewById(R.id.buttonRestaurant);

        buttonRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pulsaste restaurantes", Toast.LENGTH_SHORT).show();
                ImageView mapImg = findViewById(R.id.map);
                mapImg.setImageResource(R.drawable.mapa_restaurantes);
            }
        });
    }
}