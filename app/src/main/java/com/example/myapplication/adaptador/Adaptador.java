package com.example.myapplication.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.personajes.Personajes;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Personajes> datos;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Personajes usuario);
    }

    public Adaptador(List<Personajes> datos, OnItemClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        Personajes dato = datos.get(position);
        holder.bind(dato, listener);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_nombre, txt_estado, txt_especie;
        ImageView img_usuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre = itemView.findViewById(R.id.txt_nombre);
            txt_estado = itemView.findViewById(R.id.txt_estado);
            txt_especie = itemView.findViewById(R.id.txt_especie);
            img_usuario = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(Personajes dato, OnItemClickListener listener) {
            txt_nombre.setText(dato.getNombre());
            txt_especie.setText(dato.getEspecie());
            txt_estado.setText(dato.getEstado());
            Picasso.get().load(dato.getImg()).into(img_usuario);

            itemView.setOnClickListener(v -> listener.onItemClick(dato));
        }
    }
}

