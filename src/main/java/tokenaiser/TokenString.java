package tokenaiser;

public class TokenString extends Token {
    private String value;

    public String getValue() {
        return value;
    }

    public TokenString(String value) {

        this.value = value;
    }

    @Override
    public String toString() {
        return "TokenString{" +
                "value='" + value + '\'' +
                '}';
    }
}
