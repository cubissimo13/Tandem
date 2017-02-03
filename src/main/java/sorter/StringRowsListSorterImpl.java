package sorter;

import tokenaiser.Token;
import tokenaiser.Tokenaiser;

import java.util.Arrays;
import java.util.List;

public class StringRowsListSorterImpl implements StringRowsListSorter {

    public void sort(List<String[]> rows, int columnIndex) {
        //Вывод исходной таблицы
        printTable(rows);

        //Сортировка таблицы по укзанному столбцу
        boolean flag = true;
        String[] swap;
        int length = rows.size();
        while (flag) {
            flag = false;
            for (int i = 0; i < length-1; i++) {
                if (compareRow(rows.get(i)[columnIndex], rows.get(i + 1)[columnIndex]) < 0 ) {
                    swap = rows.get(i);
                    rows.set(i,rows.get(i+1));
                    rows.set(i+1,swap);
                    flag = true;
                }
            }
        }

        //Вывод отсортированной таблицы
        //printTable(rows);
    }

    private int compareRow(String first, String second){

        int result = 0;

        //Сравнение нулевых строк
        if (first == null & second!=null) {
            return -1;
        } else if (first != null & second == null){
            return 1;
        } else if (first == null & second == null) {
            return 0;
        }

        //Сравнение пустых строк
        if (first.equals("") & !second.equals("")) {
            return -1;
        } else if (!first.equals("") & second.equals("")){
            return 1;
        } else if (first.equals("") & second.equals("")){
            return 0;
        }

        //Сравнение строк
        Tokenaiser tokensOfFirstString = new Tokenaiser(first);
        Tokenaiser tokensOfSecondString = new Tokenaiser(second);

        int loops = Math.max(tokensOfFirstString.getTokens().size(), tokensOfSecondString.getTokens().size());
        System.out.println(loops);




        return result;
    }

    private void printTable(List<String[]> rows){
        for(String[] row: rows){
            System.out.println(Arrays.asList(row));
        }
    }
}
