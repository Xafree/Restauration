package test;

import com.company.Commande;
import com.company.Franchise;
import com.company.Restaurant;
import com.company.Serveur;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class FranchiseTest {

    private Franchise franchise;
    @Before
    public void setUp() throws Exception {
        franchise = new Franchise();
    }

    @After
    public void tearDown() throws Exception {
        franchise = null;
    }

    @Test
    @DisplayName("Test franchise class")
    public void test(){
        Restaurant restaurant = new Restaurant();
        Serveur s = new Serveur();
        s.addCommande(new Commande(10F));
        restaurant.AddServeur(s);
        franchise.addRestaurant(restaurant);

        float result = 10F;

        Assert.assertEquals(result,franchise.getChiffreAffaire(), 0);
    }

    @Test
    @DisplayName("Test franchise class with 2 restaurant ")
    public void test2(){
        Restaurant restaurant = new Restaurant();
        Restaurant restaurant2 = new Restaurant();
        Serveur s = new Serveur();
        Serveur s2 = new Serveur();
        s.addCommande(new Commande(10F));
        restaurant.AddServeur(s);
        this.franchise.addRestaurant(restaurant);
        this.franchise.addRestaurant(restaurant2);

        float result = 10F;

        Assert.assertEquals(result,franchise.getChiffreAffaire(), 0);
    }

    @Test
    @DisplayName("Test franchise class with 2 restaurant ")
        public void test3(int i){
        for(int j = 0; j<= i; j++){
            this.franchise.addRestaurant(new Restaurant());
            for(int y = 0; y <= i; y++ ){
                this.franchise.getAtIndexRestaurant(j).AddServeur(new Serveur());
                this.franchise.getAtIndexRestaurant(j).getIndexAtServeur(y).addCommande(new Commande(10F));
            }
        }
        //float result = 10F;
        Assert.assertEquals(this.franchise.getChiffreAffaire(),this.franchise.getChiffreAffaire(), 0);
    }
}