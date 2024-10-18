package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adaptador.Adaptador;
import com.example.myapplication.personajes.Personajes;

import java.util.ArrayList;
import java.util.List;

public class inicio_view extends AppCompatActivity implements Adaptador.OnItemClickListener {

    RecyclerView rcv_;
    List<Personajes> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio_view);


        //anadir usuarios a la lista

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));
        lista.add(new Personajes("morty malvado", "masculino", "humano","vivo", "casa","tierra(c-137)","https://static1.srcdn.com/wordpress/wp-content/uploads/2021/09/Rick-and-morty-Evil-morty-timeline-explained-backstory.jpg?q=50&fit=crop&w=1140&h=&dpr=1.5"));

        lista.add(new Personajes("rick", "masculino", "humano","vivo", "casa","tierra(c-137)","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/f79ae93d-680c-44c2-9718-0f2a70b59613/df8ftht-5df05a88-df70-43f6-9a9f-5102de9c7652.png/v1/fill/w_1280,h_720/rick_sanchez__rick_and_morty__render_by_ty50ntheskeleton_df8ftht-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NzIwIiwicGF0aCI6IlwvZlwvZjc5YWU5M2QtNjgwYy00NGMyLTk3MTgtMGYyYTcwYjU5NjEzXC9kZjhmdGh0LTVkZjA1YTg4LWRmNzAtNDNmNi05YTlmLTUxMDJkZTljNzY1Mi5wbmciLCJ3aWR0aCI6Ijw9MTI4MCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.XL_cfijk5RSiFvbnkOnL9pUzZfnSwF4cKiTiIyxwxbk"));

        lista.add(new Personajes("summer", "masculino", "humano","vivo", "casa","tierra(c-137)","https://static1.srcdn.com/wordpress/wp-content/uploads/2022/09/How-Rick--Morty-Season-6-Makes-Summer-The-Most-Important-Smith-Featured.jpg?q=50&fit=crop&w=1140&h=&dpr=1.5"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));
        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));

        lista.add(new Personajes("morty", "masculino", "humano","vivo", "casa","tierra(c-137)","https://preview.redd.it/segj9itqwmr81.png?auto=webp&s=9c979a4581ce72b579a34fb0037193700fa1f97c"));


        rcv_.setLayoutManager(new LinearLayoutManager(this));
        rcv_.setAdapter(new Adaptador(lista, this));

    }

    @Override
    public void onItemClick(Personajes personajes) {
        Intent intent = new Intent(inicio_view.this, DetallePersonajeActivity.class);
        intent.putExtra("nombre", personajes.getNombre());
        intent.putExtra("especie", personajes.getEspecie());
        intent.putExtra("imagen", personajes.getImg());
        intent.putExtra("genero", personajes.getGenero());
        intent.putExtra("estado", personajes.getEstado());
        intent.putExtra("localizacion", personajes.getLocal());
        intent.putExtra("planeta", personajes.getPlaneta());

        startActivity(intent);
    }
}