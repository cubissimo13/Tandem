import assigner.Element;
import assigner.ElementNumberAssigner;
import assigner.ElementNumberAssignerImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ElementNumberAssigner assigner = ElementNumberAssignerImpl.getInstance();
        List<Element> source = new LinkedList<>();
        source.add(new Element(15));
        source.add(new Element(6));
        source.add(new Element(7));
        source.add(new Element(0));
        source.add(new Element(10));
        source.add(new Element(4));
        source.add(new Element(9));
        source.add(new Element(2));
        source.add(new Element(1));

       for (Element e : source){
           System.out.println(e);
       }
        assigner.assignNumbers(source);
        assigner.printElement();
    }
}
