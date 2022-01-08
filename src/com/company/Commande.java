package com.company;

public class Commande {

    private double montant = 0;

    public Commande() {
    }
    public Commande(double montant) {
        this.montant = montant;
    }


    public double getMontant() {
        return montant;
    }
}
