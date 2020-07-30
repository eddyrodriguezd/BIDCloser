package com.bid.closer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bid.closer.dialogs.PreventionDialog;

public class MainActivity extends AppCompatActivity {

    private int imgMostrada = 0;
    private ImageView mapImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreventionDialog preventionDialog = new PreventionDialog(this);
        preventionDialog.startDialog();

        mapImg = findViewById(R.id.map);

        findViewById(R.id.buttonRestaurant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapImg.setImageResource(R.drawable.mapa_restaurantes);
                imgMostrada = 1;
            }
        });

        findViewById(R.id.buttonPark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapImg.setImageResource(R.drawable.mapa_parques);
                imgMostrada = 2;
            }
        });

        mapImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imgMostrada == 1) {
                    mapImg.setImageResource(R.drawable.mapa_restaurantes_llamada);
                }
                else if (imgMostrada == 2) {
                    mapImg.setImageResource(R.drawable.mapa_parques_llamada);
                }
            }
        });

    }
}