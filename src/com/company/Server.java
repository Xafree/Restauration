package com.company;

import java.util.ArrayList;
import java.util.List;

public class Server {

    private float chiffreAffaire;
    private List<Command> commandes;

    public Server() {
        this.chiffreAffaire = 0;
        this.commandes = new ArrayList<Command>();
    }

    public float getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public List<Command> getCurrentCommande() {
        return this.commandes;
    }

    public void addCommande(Command commande){
        this.commandes.add(commande);
        this.chiffreAffaire += commande.getPrix();
    }



}
