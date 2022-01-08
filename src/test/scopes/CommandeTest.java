package test.scopes;


import Utilities.CommandeBuilder;
import Utilities.ServeurBuilder;
import com.company.Commande;
import com.company.Serveur;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandeTest {
    @Test
    @DisplayName("ÉTANT DONNE un serveur dans un restaurant " +
            "QUAND il prend une commande de nourriture " +
            "ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant")
    public void ajouterUneCommandeALaListeDesTaches() {
        Serveur serveur = new ServeurBuilder().build();
        Commande commande = new CommandeBuilder().build();
        //serveur.prendreUneCommande();
    }
}
