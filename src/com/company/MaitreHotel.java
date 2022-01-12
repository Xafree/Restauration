package com.company;

import java.util.ArrayList;
import java.util.List;

public class MaitreHotel {

    private List<Table> tables = new ArrayList<Table>();

    public void affectéUneTable(List<Table> table){
        this.tables = table;
    }

    public List<Table> getTables() {
        return tables;
    }

}
