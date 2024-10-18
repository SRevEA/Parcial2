package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Nombre de archivo para SharedPreferences
    private static final String PREFS_NAME = "MyPrefs";
    private static final String USER_LOGGED_IN = "user_logged_in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Verificar si el usuario ya ha iniciado sesión
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean(USER_LOGGED_IN, false);

        // Si el usuario ya está logueado, redirigir a la pantalla de inicio
        if (isLoggedIn) {
            Intent intent = new Intent(this, inicio_view.class);
            startActivity(intent);
            finish(); // Finaliza la actividad actual para que no pueda regresar a la pantalla de login
        }
    }

    public void iniciarSesion(View view) {
        EditText a = findViewById(R.id.edtUsuario);
        EditText b = findViewById(R.id.edtContrasena);

        if (a.getText().toString().isEmpty() || b.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor llenar los campos.", Toast.LENGTH_LONG).show();
        } else if (a.getText().toString().equals("uac123") && b.getText().toString().equals("12345678")) {
            // Guardar que el usuario ha iniciado sesión en SharedPreferences
            SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(USER_LOGGED_IN, true);
            editor.apply(); // Guarda los cambios

            // Redirigir a la pantalla de inicio
            Intent validado = new Intent(this, inicio_view.class);
            startActivity(validado);
            finish(); // Finaliza la actividad actual para evitar que regrese con el botón atrás
        } else {
            Toast.makeText(this, "Usuario o contrasena incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}
