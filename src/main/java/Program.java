import sorter.StringRowsListSorter;
import sorter.StringRowsListSorterImpl;
import tokenaiser.TokenDigit;
import tokenaiser.Tokenaiser;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StringRowsListSorter sorter = new StringRowsListSorterImpl();

        List<String[]> table = new ArrayList<String[]>();

        table.add(new String[]{"0","a","sdfas"});
        table.add(new String[]{"2","e",""});
        table.add(new String[]{"1","b","123 sdf"});
        table.add(new String[]{"3","c","321 dsdf"});
        table.add(new String[]{"5","f",null});
        table.add(new String[]{"6","g","sdfaa"});
        table.add(new String[]{"8","g","sdfas"});
        table.add(new String[]{"4","d",null});

        //sorter.sort(table,2);

        Tokenaiser tokensOfFirstString = new Tokenaiser("123 sdf");
        Tokenaiser tokensOfSecondString = new Tokenaiser("321 dsdfd");
        if (tokensOfFirstString.getTokens().get(0).getClass().getName().equals(TokenDigit.class.getName()) &
                tokensOfSecondString.getTokens().get(0).getClass().getName().equals(TokenDigit.class.getName())){

        }


    }
}
