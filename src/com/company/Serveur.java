package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Serveur {

    private float chiffreAffaire;
    private List<Commande> commandes;
    private List<Table> tables;
    private String nom;

    public Serveur() {
        this.chiffreAffaire = 0;
        this.tables = new ArrayList<Table>();
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


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affectéUneTable(Table table) {
        this.tables.add(table);
    }

    public List<Table> getTables() {
        return tables;
    }
}
