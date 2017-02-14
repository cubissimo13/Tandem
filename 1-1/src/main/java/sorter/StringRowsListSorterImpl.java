package sorter;

import sorter.token.Tokenaiser;

import java.util.List;

public class StringRowsListSorterImpl implements StringRowsListSorter {

    private static final StringRowsListSorterImpl INSTANCE = new StringRowsListSorterImpl();

    private StringRowsListSorterImpl() {
    }

    public static StringRowsListSorterImpl getInstance(){

        return INSTANCE;
    };

    public void sort(List<String[]> rows, int columnIndex) {

        //Сортировка таблицы по укзанному столбцу
        boolean flag = true;
        String[] tmp;
        int length = rows.size();
        while (flag) {
            flag = false;
            for (int i = 0; i < length-1; i++) {
                if (compareRow(rows.get(i)[columnIndex], rows.get(i + 1)[columnIndex]) > 0 ) {
                    tmp = rows.get(i);
                    rows.set(i,rows.get(i+1));
                    rows.set(i+1,tmp);
                    flag = true;
                }
            }
        }
     }

    private int compareRow(String first, String second) {

        //Сравнение нулевых строк
        if (first == null & second != null) {
            return -1;
        } else if (first != null & second == null) {
            return 1;
        } else if (first == null & second == null) {
            return 0;
        }

        //Сравнение пустых строк
        if (first.equals("") & !second.equals("")) {
            return -1;
        } else if (!first.equals("") & second.equals("")) {
            return 1;
        } else if (first.equals("") & second.equals("")) {
            return 0;
        }

        //Сравнение строк
        return compareTokens(first, second);
    }

    private int compareTokens(String  first, String second){
        Tokenaiser firstTokens = new Tokenaiser(first);
        Tokenaiser secondTokens = new Tokenaiser(second);

        if (firstTokens.getTokens().get(0).isDigit() & !secondTokens.getTokens().get(0).isDigit()){
            return -1;
        } else if(!firstTokens.getTokens().get(0).isDigit() & secondTokens.getTokens().get(0).isDigit()){
            return 1;
        } else if (firstTokens.getTokens().get(0).isDigit() & secondTokens.getTokens().get(0).isDigit()) {
            return Integer.parseInt(firstTokens.getTokens().get(0).getValue()) - Integer.parseInt(secondTokens.getTokens().get(0).getValue());
        }

        return firstTokens.getTokens().get(0).getValue().compareTo(secondTokens.getTokens().get(0).getValue());
    }

}
