package tokenaiser;

import java.util.ArrayList;
import java.util.List;

public class Tokenaiser{
    private List<Token> tokens = new ArrayList<>();

    public Tokenaiser(String str) {

        char[] chars = str.toCharArray();
        int loops = chars.length;
        String textToken = "";
        boolean onDigit = false;
        boolean onChar = false;


        for (int i = 0; i < loops; i++) {

            //Цифровой токен
            if (Character.isDigit(chars[i])) {
                onDigit = true;
                textToken += chars[i];
            } else {
                if (onDigit) {
                    tokens.add(new TokenDigit(Integer.valueOf(textToken)));
                    onDigit = false;
                    textToken = "";
                }
            }
            //Текстовый токен
            if (Character.isLetter(chars[i])) {
                    onChar = true;
                    textToken += chars[i];
            } else {
                if (onChar) {
                    tokens.add(new TokenString(textToken));
                    onChar = false;
                    textToken = "";
                }
            }

            //Создаем последний токен
            if (i == loops-1 & onDigit){
                tokens.add(new TokenDigit(Integer.valueOf(textToken)));
            }
            if (i == loops-1 & onChar){
                tokens.add(new TokenString(textToken));
            }
        }
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void printTokens(){
        System.out.println(this.getTokens());
    }
}
