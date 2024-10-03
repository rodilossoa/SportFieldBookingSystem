package com.sportbooking.models;

public class Utente {
    private String nome;
    private String email;

    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Getter per email
    public String getEmail() {
        return email;
    }

    // Setter per nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter per email
    public void setEmail(String email) {
        this.email = email;
    }
}
