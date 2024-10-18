package com.example.myapplication.personajes;

public class Personajes {

    private String nombre;
    private String genero;
    private String especie;
    private String estado;
    private String local;
    private String planeta;
    private String img;

    public Personajes(String nombre, String genero, String especie, String estado, String local, String planeta, String img) {
        this.nombre = nombre;
        this.genero = genero;
        this.especie = especie;
        this.estado = estado;
        this.local = local;
        this.planeta = planeta;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
