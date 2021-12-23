package com.company;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Serveur> serveurs = new ArrayList<Serveur>();
    private float ChiffreAffaire;

    public Restaurant() {
        this.ChiffreAffaire = 0;
    }

    public void AddServeur (Serveur serveur){
        this.serveurs.add(serveur);
        this.setChiffreAffaire(this.getChiffreAffaire()+serveur.getChiffreAffaire());
    }

    public float getChiffreAffaire() {
        return ChiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        ChiffreAffaire = chiffreAffaire;
    }
}
