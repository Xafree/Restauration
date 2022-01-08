package test.scopes;
import Utilities.ClientBuilder;
import Utilities.RestaurantBuilder;
import Utilities.TableBuilder;
import com.company.Client;
import com.company.Restaurant;
import com.company.Table;
//import org.junit.Test;
import org.junit.jupiter.api.*;

public class InstallationClientTest {

    @Test
    @DisplayName("ÉTANT DONNE une table dans un restaurant ayant débuté son service " +
            "QUAND un client est affecté à une table " +
            "ALORS cette table n'est plus sur la liste des tables libres du restaurant")
    public void AffectationClient(){

        // ÉTANT DONNE une table dans un restaurant ayant débuté son service
        Table table = new TableBuilder().build();
        Restaurant restaurant = new RestaurantBuilder().avecLaTable(table).build();

        restaurant.débuterService();

        Client client = new ClientBuilder().build();

        // QUAND un client est affecté à une table
        table.affecterClient(client);
        restaurant.retirerDeLaListeDesTablesDisponibles(table);

        // ALORS cette table n'est plus sur la liste des tables libres du restaurant

        Assertions.assertFalse(restaurant.getTablesDisponibles().contains(table));
    }

    @Test
    @DisplayName("ÉTANT DONNE une table occupée par un client " +
            "QUAND la table est libérée " +
            "ALORS cette table appraît sur la liste des tables libres du restaurant")
    public void désaffectationClient() {

        // ÉTANT DONNE une table occupée par un client
        Client client = new ClientBuilder().build();
        Table table = new TableBuilder().avecLeClient(client).build();
        Restaurant restaurant = new RestaurantBuilder().build();

        // QUAND la table est libérée
        table.désaffecterClient(client);

        // ALORS cette table appraît sur la liste des tables libres du restaurant
        restaurant.ajouterALaListeDesTablesDisponibles(table);

        Assertions.assertTrue(restaurant.getTablesDisponibles().contains(table));
    }
}
