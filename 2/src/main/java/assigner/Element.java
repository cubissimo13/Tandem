package assigner;

public class Element {
    private Integer value;

    public Element(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Значение "+value+"";
    }
}
