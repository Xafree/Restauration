package Utilities;

import com.company.Client;
import com.company.Table;

public class TableBuilder {
    private Client client = null;

    public Table build() {
        return client != null ? new Table().affecterClient(client) : new Table();
    }
    public TableBuilder avecLeClient(Client client) {
        this.client = client;
        return this;
    }
}
