package com.example.exodynamicfragementcorrection.model;

import androidx.annotation.NonNull;

public class Personne {
    int id;
    String nom, prenom, date;

    public Personne(String nom, String prenom, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public Personne(int id, String nom, String prenom, String date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @NonNull
    @Override
    public String toString() {
        return
                        "nom : " + nom +
                        "\nprenom : " + prenom +
                        "\ndate : " + date;
    }
}
