package test.builder;

import com.company.Commande;

public class CommandeBuilder {

    private float montant = 5;
    public Commande build() {
        return new Commande(this.montant);
    }

    public CommandeBuilder dUnMontantDe(float montant) {
        this.montant = montant;
        return this;
    }
}
