package test.generator;

import com.company.Table;
import test.builder.TableBuilder;

import java.util.ArrayList;
import java.util.List;

public class TableGenerator {

    private TableBuilder tableBuilder = new TableBuilder();
    private List<Table> tables = new ArrayList<Table>();

    public List<Table> generate(int numberTable) {
        for(int i = 0; i < numberTable; i++ ){
            this.tables.add(tableBuilder.build());
        }
        return this.tables;
    }
}
