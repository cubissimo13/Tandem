package sorter.token;

public class Token {
    private boolean isDigit;
    private String value;

    public Token(boolean isDigit, String value) {
        this.isDigit = isDigit;
        this.value = value;
    }

    public boolean isDigit() {
        return isDigit;
    }

    public String getValue() {
        return value;
    }
}
