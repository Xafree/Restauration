package test;

import com.company.Commande;
import com.company.Serveur;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import test.builder.CommandeBuilder;
import test.builder.ServeurBuilder;

import java.beans.PropertyEditorSupport;
import java.util.List;

import static org.junit.Assert.*;

public class ServeurTest {

    private ServeurBuilder serveurBuilder;
    private CommandeBuilder commandeBuilder;

    @org.junit.Before
    public void setUp() throws Exception {
        this.serveurBuilder = new ServeurBuilder();
        this.commandeBuilder = new CommandeBuilder();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.serveurBuilder = null;
        this.commandeBuilder = null;
    }

    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND on récupére son chiffre d'affaires " +
            "ALORS celui-ci est à 0")
    public void récupérationDuChiffreDAffairesDunServeur() {
        double chiffreDAffairesDuServeur = this.serveurBuilder.build().getChiffreAffaire();
        Assertions.assertEquals(0, chiffreDAffairesDuServeur);
    }
    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND il prend une commande " +
            "ALORS son chiffre d'affaires est le montant de celle-ci")
    public void affecterChiffeDAffairesServeurAuMontantDeLaCommande() {
        float montantCommande = 5;
        Commande commande = new CommandeBuilder().dUnMontantDe(montantCommande).build();
        this.serveurBuilder.build().addCommande(commande);
        Assertions.assertEquals(montantCommande, commande.getPrix());
    }

}