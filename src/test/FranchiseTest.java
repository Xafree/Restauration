package test;

import Builder.BuilderCommand;
import Builder.BuilderFranchise;
import Builder.BuilderRestaurant;
import Builder.BuilderServer;
import com.company.Franchise;
import com.company.Restaurant;
import com.company.Server;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class FranchiseTest {

    private Franchise franchise;
    @Before
    public void setUp() throws Exception {
        franchise = new BuilderFranchise().Build();
    }

    @After
    public void tearDown() throws Exception {
        franchise = null;
    }

    @Test
    @DisplayName("Test franchise class")
    public void Test_franchise_class(){
        Restaurant restaurant = new Restaurant();
        Server s = new BuilderServer().Build();
        s.addCommande(new BuilderCommand().Build(10F));
        restaurant.AddServeur(s);
        franchise.addRestaurant(restaurant);

        float result = 10F;

        Assert.assertEquals(result,franchise.getChiffreAffaire(), 0);
    }

    @Test
    @DisplayName("Test franchise class with 2 restaurant ")
    public void Test_franchise_class_with_2_restaurant(){
        var restaurant = new BuilderRestaurant().Build();
        Restaurant restaurant2 = new BuilderRestaurant().Build();

        Server s = new BuilderServer().Build();
        Server s2 = new BuilderServer().Build();

        s.addCommande(new BuilderCommand().Build(10F));
        restaurant.AddServeur(s);

        this.franchise.addRestaurant(restaurant);
        this.franchise.addRestaurant(restaurant2);

        float result = 10F;

        Assert.assertEquals(result,franchise.getChiffreAffaire(), 0);
    }

//    @Test
//    @DisplayName("Test franchise class with 2 restaurant ")
//    @ParameterizedTest
//    @ValueSource(ints = { 1, 2, 1000})
//    public void test3(int i){
//        for(int j = 0; j<= i; j++){
//            this.franchise.addRestaurant(new Restaurant());
//            for(int y = 0; y <= i; y++ ){
//                this.franchise.getAtIndexRestaurant(j).AddServeur(new Serveur());
//                this.franchise.getAtIndexRestaurant(j).getIndexAtServeur(y).addCommande(new Commande(10F));
//            }
//        }
//        //float result = 10F;
//        Assert.assertEquals(this.franchise.getChiffreAffaire(),this.franchise.getChiffreAffaire(), 0);
    //}
}