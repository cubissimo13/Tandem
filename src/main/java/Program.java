import sorter.StringRowsListSorter;
import sorter.StringRowsListSorterImpl;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StringRowsListSorter sorter = new StringRowsListSorterImpl();

        List<String[]> table = new ArrayList<>();

        table.add(new String[]{"0","a","sdfaB"});
        table.add(new String[]{"2","e",""});
        table.add(new String[]{"1","b","123 sdf"});
        table.add(new String[]{"7","h","456 xyz"});
        table.add(new String[]{"3","c","321 dsdf"});
        table.add(new String[]{"5","f",null});
        table.add(new String[]{"6","g","sdfaA"});
        table.add(new String[]{"9","i",""});
        table.add(new String[]{"8","g","sdfaC"});
        table.add(new String[]{"4","d",null});

        sorter.sort(table,2);

    }
}
