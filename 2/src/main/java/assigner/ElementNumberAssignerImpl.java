package assigner;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ElementNumberAssignerImpl implements ElementNumberAssigner {
    private static final ElementNumberAssignerImpl INSTANCE = new ElementNumberAssignerImpl();

    private ElementNumberAssignerImpl() {
    }

    public static ElementNumberAssignerImpl getInstance(){
        return INSTANCE;
    }

    private Map<Integer, Integer> numbers = new TreeMap<>();
    private Integer counter=1;

    public void assignNumbers(List<Element> elements) {

        for(Element e:elements){
            numbers.put(e.getValue(),counter++);
        }
    }

    public void printElement(){
        System.out.println("Вывод элементов по возрастанию и изначального порядкового номера");
        for (Map.Entry entry : numbers.entrySet()) {
            System.out.println("Значение " + entry.getKey() + " номер " + entry.getValue());
        }
    }
}
