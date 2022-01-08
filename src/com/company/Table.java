package com.company;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Client> clientsAffectés = new ArrayList<Client>();

    public Table affecterClient(Client client) {
        this.clientsAffectés.add(client);
        return this;
    }

    public Table désaffecterClient(Client client) {
        this.clientsAffectés.remove(client);
        return this;
    }
}
