package tech.codingclub.database;
 import java.util.Scanner;
import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main( String[] args) {

        Coders coder=new Coders("shahnwaz",20L);
        //insert this!
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS,coder);
        Coders spammer=new Coders("SPAMMER",90L);
        //insert this!
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS,coder);
    }
}
