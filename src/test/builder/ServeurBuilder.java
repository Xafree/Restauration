package test.builder;

import com.company.Serveur;

public class ServeurBuilder {

    public Serveur build() {
        return new Serveur();
    }

    public ServeurBuilder nommé(String nom) {
        this.build().setNom(nom);
        return this;
    }
}
