package test.generator;

import com.company.Commande;
import test.builder.CommandeBuilder;

import java.util.ArrayList;
import java.util.List;

public class CommandeGenerator {
    private CommandeBuilder builder = new CommandeBuilder();
    public List<Commande> commades = new ArrayList<Commande>();

    public List<Commande> Generate(int nombre) {
        for (int i = 0 ; i < nombre ; i++) {
            this.commades.add(this.builder.build());
        }
        return this.commades;
    }
}
