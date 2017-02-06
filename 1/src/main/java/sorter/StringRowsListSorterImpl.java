package sorter;

import java.util.Arrays;
import java.util.List;

public class StringRowsListSorterImpl implements StringRowsListSorter {

    private static final StringRowsListSorterImpl INSTANCE = new StringRowsListSorterImpl();

    private StringRowsListSorterImpl() {
    }

    public static StringRowsListSorterImpl getInstance(){

        return INSTANCE;
    };

    public void sort(List<String[]> rows, int columnIndex) {
        //Вывод исходной таблицы
        printTable(rows);

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

        //Вывод отсортированной таблицы
        System.out.println("============ Cортировка по " + (columnIndex+1) + " столбцу ==============");
        printTable(rows);
    }

    private int compareRow(String first, String second){

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
        return first.compareTo(second);
    }

    private void printTable(List<String[]> rows){
        for(String[] row: rows){
            System.out.println(Arrays.asList(row));
        }
    }
}
