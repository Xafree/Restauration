package test.scopes.chiffreDAffaires;

import Utilities.CommandeBuilder;
import Utilities.ServeurBuilder;
import com.company.Commande;
import com.company.Serveur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ServeurTest {
    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND on récupére son chiffre d'affaires " +
            "ALORS celui-ci est à 0")
    public void récupérationDuChiffreDAffairesDunServeur() {
        Serveur serveur = new ServeurBuilder().build();
        double chiffreDAffairesDuServeur = serveur.récupérerChiffreDAffaires();
        Assertions.assertEquals(0, chiffreDAffairesDuServeur);
    }
    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND il prend une commande " +
            "ALORS son chiffre d'affaires est le montant de celle-ci")
    public void affecterChiffeDAffairesServeurAuMontantDeLaCommande() {
        Serveur serveur = new ServeurBuilder().build();
        double montantCommande = 25;
        Commande commande = new CommandeBuilder().dUnMontantDe(montantCommande).build();
        serveur.prendreUneCommande(commande);

        Assertions.assertEquals(montantCommande, commande.getMontant());
    }
}
