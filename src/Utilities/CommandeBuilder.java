package Utilities;

import com.company.Commande;

public class CommandeBuilder {
    private double montant = 0;
    public Commande build() {
        return montant != 0 ? new Commande(montant) : new Commande();
    }

    public CommandeBuilder dUnMontantDe(double montant) {
        this.montant = montant;
        return this;
    }
}
