package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serveur {

    private float chiffreAffaire;
    private List<Commande> commandes;

    public Serveur() {
        this.chiffreAffaire = 0;
        this.commandes = new ArrayList<Commande>();
    }

    public float getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public List<Commande> getCurrentCommande() {
        return this.commandes;
    }

    public void addCommande(Commande commande){
        this.commandes.add(commande);
        this.chiffreAffaire += commande.getPrix();
    }



}
