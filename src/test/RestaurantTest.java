package test;

import com.company.Command;
import com.company.Restaurant;
import com.company.Server;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void Add_Server_ButCaEqualZero() {
        this.r.AddServeur(new Server());
        float result = 0F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(), 0);
    }

    @Test
    public void Add_Server_ButCaEqual2() {
        this.r.AddServeur(new Server());
        Server s = new Server();
        s.addCommande(new Command(10F));
        this.r.AddServeur(s);
        float result = 10F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(),0);
    }
    @Test
    public void Add_Server_ButCaEqual100() {
        for(int i = 0 ; i <= 100; i++){
            Server s = new Server();
            s.addCommande(new Command(10F));
            this.r.AddServeur(s);
        }
        float result = 1010F;
        Assert.assertEquals( result, this.r.getChiffreAffaire(),0);
    }

}