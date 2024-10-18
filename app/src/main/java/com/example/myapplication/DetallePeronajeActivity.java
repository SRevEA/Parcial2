package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class DetallePeronajeActivity extends AppCompatActivity {
    ImageView imgPerfil;
    TextView txtNombre, txtEspecie, txtEstado, txtGenero, txtLocal, txtPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_peronaje);


        imgPerfil = findViewById(R.id.img_detalle);
        txtNombre = findViewById(R.id.tv_name);
        txtEspecie = findViewById(R.id.tv_species);
        txtEstado = findViewById(R.id.tv_status);
        txtGenero = findViewById(R.id.tv_gender);
        txtLocal = findViewById(R.id.tv_last_location);
        txtPlaneta = findViewById(R.id.tv_location);


        String nombre = getIntent().getStringExtra("nombre");
        String genero = getIntent().getStringExtra("genero");
        String especie = getIntent().getStringExtra("especie");
        String estado = getIntent().getStringExtra("estado");
        String local = getIntent().getStringExtra("local");
        String planeta = getIntent().getStringExtra("planeta");
        String imgUrl = getIntent().getStringExtra("img");


        txtNombre.setText(nombre);
        txtEspecie.setText(especie);
        txtEstado.setText(estado);
        txtGenero.setText(genero);
        txtLocal.setText(local);
        txtPlaneta.setText(planeta);


        Picasso.get().load(imgUrl).into(imgPerfil);

    }
}
