package Utilities;

import com.company.Serveur;

public class ServeurBuilder {
    private String nom = "";

    public Serveur build() {
        if (this.nom.equals("")) {
            return new Serveur();
        }
        return new Serveur(this.nom);
    }

    public ServeurBuilder nommé(String nom) {
        this.nom = nom;
        return this;
    }
}
