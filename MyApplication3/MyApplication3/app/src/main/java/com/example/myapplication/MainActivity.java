package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView txtDetalle = findViewById(R.id.txtDetalle);
        Button btnOnClick = findViewById(R.id.btnOnClick);
        Button btnOnLongClick = findViewById(R.id.btnOnLongClick);


        btnOnClick.setOnClickListener(v -> {
            btnOnClick.setBackgroundColor(Color.GREEN);
            Toast.makeText(MainActivity.this, "Botón cambiado de color", Toast.LENGTH_SHORT).show();
        });


        btnOnLongClick.setOnClickListener(v -> {
            txtDetalle.setText("¡Texto cambiado!");
            Toast.makeText(MainActivity.this, "Texto cambiado", Toast.LENGTH_SHORT).show();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}