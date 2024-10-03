package com.sportbooking.models;

public class Campo {
    private String nome;
    private String tipo; // e.g., calcio, tennis
    private boolean disponibile;

    public Campo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.disponibile = true; // Impostato come disponibile di default
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
