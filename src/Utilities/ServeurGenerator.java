package Utilities;

import com.company.Serveur;

import java.util.ArrayList;
import java.util.List;

public class ServeurGenerator {
    private ServeurBuilder builder = new ServeurBuilder();
    public List<Serveur> Serveurs = new ArrayList<>();

    public List<Serveur> Generate(int nombre) {
        for (int i = 0 ; i < nombre ; i++) {
            this.Serveurs.add(this.builder.build());
        }
        return this.Serveurs;
    }

    public ServeurGenerator Nommés(String nom) {
        this.builder.nommé(nom);
        return this;
    }
}
