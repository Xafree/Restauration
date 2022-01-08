package com.company;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Serveur> serveurs = new ArrayList<Serveur>();
    private double ChiffreAffaire;
    private Boolean débutService = false;
    private List<Table> tablesDisponibles = new ArrayList<Table>();

    public Restaurant() {
        this.ChiffreAffaire = 0;
    }

    public Restaurant(Table table) {
        this.tablesDisponibles.add(table);
    }


    public List<Table> getTablesDisponibles() {
        return tablesDisponibles;
    }

    public Serveur getIndexAtServeur(int j) {
        return this.serveurs.get(j);
    }

    public double getChiffreAffaire() {
        return ChiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        ChiffreAffaire = chiffreAffaire;
    }

    public void débuterService() {
        this.débutService = true;
    }

    public void retirerDeLaListeDesTablesDisponibles(Table table) {
        this.tablesDisponibles.remove(table);
    }

    public void ajouterALaListeDesTablesDisponibles(Table table) {
        this.tablesDisponibles.add(table);
    }

}
