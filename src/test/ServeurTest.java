package test;

import com.company.Commande;
import com.company.Serveur;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.beans.PropertyEditorSupport;
import java.util.List;

import static org.junit.Assert.*;

public class ServeurTest {

    private Serveur serveur;
    private Commande commande;

    @org.junit.Before
    public void setUp() throws Exception {
        this.serveur = new Serveur();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.serveur = null;
    }

    @Test
    @DisplayName("Serveur avec un chiffre d'affaire a 0")
    public void Test_Affair_Zero(){
        float chiffreAffaire = this.serveur.getChiffreAffaire();
        Assert.assertEquals(0,0.0F,chiffreAffaire);
    }

    @Test
    @DisplayName("Serveur serveur qui prend une commande et met a jour sont chiffre d'affaire")
    public void Test_Add_Command(){
        //Etant donnée un serveur qui ajoute une commande
        this.serveur.addCommande(new Commande(10F));
        //Resultat
        float resultat = 10F;
        //test de l'égalité
        Assert.assertEquals(0,resultat,this.serveur.getChiffreAffaire());
    }

    @Test
    @DisplayName("Serveur serveur qui prend 2 commandes et met a jour sont chiffre d'affaire")
    public void Test_Add_Two_Command(){
        //Etant donnée un serveur qui ajoute une commande
        this.serveur.addCommande(new Commande(10.2F));
        this.serveur.addCommande(new Commande(10.1F));
        //Resultat
        float resultat = 20.3F;
        //test de l'égalité
        Assert.assertEquals(0,resultat,this.serveur.getChiffreAffaire());
    }

}