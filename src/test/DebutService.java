package test;

import com.company.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import test.builder.MaitreHotelBuilder;
import test.builder.ServeurBuilder;
import test.builder.TableBuilder;
import test.generator.TableGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DebutService {

    private TableBuilder tableBuilder;
    private MaitreHotelBuilder maitreHotelBuilder;
    private ServeurBuilder serveurBuilder;


    private TableGenerator tableGenerator;


    private List<Table> tables;

    @Before
    public void setUp() throws Exception {
        this.tableBuilder = new TableBuilder();
        this.maitreHotelBuilder = new MaitreHotelBuilder();
        this.tableGenerator = new TableGenerator();
        this.serveurBuilder = new ServeurBuilder();
        this.tables = new ArrayList<Table>();
    }

    @After
    public void tearDown() throws Exception {
        this.maitreHotelBuilder = null;
        this.tableBuilder = null;
        this.serveurBuilder = null;
        this.tableGenerator = null;
        this.tables = null;
    }

    @Test
    @DisplayName("\tÉTANT DONNE un restaurant ayant 3 tables\n" +
                 "\tQUAND le service commence\n" +
                 "\tALORS elles sont toutes affectées au Maître d'Hôtel")
    public void ÉTANT_DONNE_un_restaurant_ayant_3_tables(){
        this.tables = this.tableGenerator.generate(3);
        MaitreHotel maitreHotel = this.maitreHotelBuilder.build();
        maitreHotel.affectéUneTable(this.tables);
        int result = 3;
        Assert.assertEquals(result,maitreHotel.getTables().size(), 0);
    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur\n" +
                 "\tQUAND le service débute\n" +
                 "\tALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel")
    public void la_table_éditée_est_affectée_au_serveur_et_les_deux_autres_au_maître_dhôtel(){
        //Initialisation
        this.tables = this.tableGenerator.generate(2);
        Serveur serveur = this.serveurBuilder.build();
        MaitreHotel maitreHotel = this.maitreHotelBuilder.build();

        //condition
        maitreHotel.affectéUneTable(this.tables);
        serveur.affectéUneTable(this.tableBuilder.build());
        int resultServeur = 1;
        int resultMaitreHotel= 2;
        //TestEgalité
        Assert.assertEquals(resultServeur,serveur.getTables().size(), 0);
        Assert.assertEquals(resultMaitreHotel,maitreHotel.getTables().size(), 0);
    }

    @Test
    @DisplayName("\tÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur\n" +
                 "\tQUAND le service débute\n" +
                 "\tALORS il n'est pas possible de modifier le serveur affecté à la table")
    public void il_n_est_pas_possible_de_modifier_le_serveur_affecté_à_la_table(){
        //Initialisation
        this.tables = this.tableGenerator.generate(2);
        Serveur serveur = this.serveurBuilder.build();
        MaitreHotel maitreHotel = this.maitreHotelBuilder.build();

        //condition
        maitreHotel.affectéUneTable(this.tables);
        serveur.affectéUneTable(this.tableBuilder.build());
        int resultServeur = 1;
        int resultMaitreHotel= 2;
        //TestEgalité
        Assert.assertEquals(resultServeur,serveur.getTables().size(), 0);
        Assert.assertEquals(resultMaitreHotel,maitreHotel.getTables().size(), 0);
    }

}