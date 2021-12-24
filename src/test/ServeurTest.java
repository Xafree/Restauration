package test;

import com.company.Command;
import com.company.Server;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ServeurTest {

    private Server server;
    private Command commande;

    @org.junit.Before
    public void setUp() throws Exception {
        this.server = new Server();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.server = null;
    }

    @Test
    @DisplayName("Serveur avec un chiffre d'affaire a 0")
    public void Test_Affair_Zero(){
        float chiffreAffaire = this.server.getChiffreAffaire();
        Assert.assertEquals(0,0.0F,chiffreAffaire);
    }

    @Test
    @DisplayName("Serveur serveur qui prend une commande et met a jour sont chiffre d'affaire")
    public void Test_Add_Command(){
        //Etant donnée un serveur qui ajoute une commande
        this.server.addCommande(new Command(10F));
        //Resultat
        float resultat = 10F;
        //test de l'égalité
        Assert.assertEquals(0,resultat,this.server.getChiffreAffaire());
    }

    @Test
    @DisplayName("Serveur serveur qui prend 2 commandes et met a jour sont chiffre d'affaire")
    public void Test_Add_Two_Command(){
        //Etant donnée un serveur qui ajoute une commande
        this.server.addCommande(new Command(10.2F));
        this.server.addCommande(new Command(10.1F));
        //Resultat
        float resultat = 20.3F;
        //test de l'égalité
        Assert.assertEquals(0,resultat,this.server.getChiffreAffaire());
    }

}