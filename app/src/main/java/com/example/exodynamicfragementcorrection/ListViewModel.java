package com.example.exodynamicfragementcorrection;

import androidx.lifecycle.ViewModel;

import com.example.exodynamicfragementcorrection.model.Personne;

import java.util.List;

public class ListViewModel extends ViewModel {
    List<Personne> listePersonne;
    Personne selectedPersonne;

    public void pushChange() {
        this.listePersonne.set(selectedPersonne.getId(),selectedPersonne);
    }

    public List<Personne> getListePersonne() {
        return listePersonne;
    }

    public void setListePersonne(List<Personne> listePersonne) {
        this.listePersonne = listePersonne;
    }

    public Personne getSelectedPersonne() {
        return selectedPersonne;
    }

    public void setSelectedPersonne(Personne selectedPersonne) {
        this.selectedPersonne = selectedPersonne;
    }
}
