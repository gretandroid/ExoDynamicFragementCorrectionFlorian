package com.example.exodynamicfragementcorrection.controller;

import com.example.exodynamicfragementcorrection.model.Personne;

import java.util.ArrayList;
import java.util.List;

public class Dao {
    static List<Personne> listePersonnes;
    static {
        listePersonnes = new ArrayList<>();
        listePersonnes.add(new Personne(0,"toto","tata","1994/12/20"));
        listePersonnes.add(new Personne(1,"toto","jean","1994/10/16"));
        listePersonnes.add(new Personne(2,"toto","paul","1994/05/14"));
        listePersonnes.add(new Personne(3,"toto","pierre","1994/01/25"));
    }
    public static List<Personne> getAll() {
        return listePersonnes;
    }
}
