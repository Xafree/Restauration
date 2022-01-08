package Utilities;

import com.company.Restaurant;
import com.company.Table;

public class RestaurantBuilder {

    private Table table = null;

    public Restaurant build() {
        return table != null ? new Restaurant(table) : new Restaurant();
    }

    public RestaurantBuilder avecLaTable(Table table) {
        this.table = table;
        return this;
    }
}
