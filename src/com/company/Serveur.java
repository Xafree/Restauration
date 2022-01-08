package com.company;

public class Serveur {
    private String nom = null;
    private double chiffreDaffaires = 0d;

    public Serveur() {
        this.nom = nom;
    }
    public Serveur(String nom) {
        this.nom = nom;
    }

    public double récupérerChiffreDAffaires() {
        return this.chiffreDaffaires;
    }

    public double getChiffreAffaire() {
        return chiffreDaffaires;
    }

    public void prendreUneCommande(Commande commande) {
        this.chiffreDaffaires = commande.getMontant();
    }
}
