package test;

import com.company.Commande;
import com.company.Restaurant;
import com.company.Serveur;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    private Restaurant r;

    @Before
    public void setUp() throws Exception {
        this.r = new Restaurant();
    }

    @After
    public void tearDown() throws Exception {
        this.r = null;
    }

    @Test
    public void addServeurButCaEqualZero() {
        this.r.AddServeur(new Serveur());
        float result = 0F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(), 0);
    }

    @Test
    public void addServeurButCaEqual2() {
        this.r.AddServeur(new Serveur());
        Serveur s = new Serveur();
        s.addCommande(new Commande(10F));
        this.r.AddServeur(s);
        float result = 10F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(),0);
    }
    @Test
    public void addServeurButCaEqual100() {
        for(int i = 0 ; i <= 100; i++){
            Serveur s = new Serveur();
            s.addCommande(new Commande(10F));
            this.r.AddServeur(s);
        }
        float result = 1010F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(),0);
    }

}