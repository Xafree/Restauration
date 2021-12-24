package com.company;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Server> servers = new ArrayList<Server>();
    private float ChiffreAffaire;

    public Restaurant() {
        this.ChiffreAffaire = 0;
    }

    public void AddServeur (Server server){
        this.servers.add(server);
        this.setChiffreAffaire(this.getChiffreAffaire()+ server.getChiffreAffaire());
    }
    public Server getIndexAtServeur(int j){
        return this.servers.get(j);
    }

    public float getChiffreAffaire() {
        return ChiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        ChiffreAffaire = chiffreAffaire;
    }

}
