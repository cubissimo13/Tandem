package tokenaiser;

public class TokenDigit extends Token{
    private int value;

    public int getValue() {
        return value;
    }

    public TokenDigit(int value) {

        this.value = value;
    }

    @Override
    public String toString() {
        return "TokenDigit{" +
                "value=" + value +
                '}';
    }
}
