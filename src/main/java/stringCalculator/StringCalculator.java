package stringCalculator;

import java.util.List;

public class StringCalculator {
    private final StringParser stringParser;

    public StringCalculator(StringParser stringParser) {
        this.stringParser = stringParser;
    }


    public Integer calculate(String s) {
        List<Ingredient> ingredients = stringParser.doParse(s);
        Integer result = 0;
        for (Ingredient num : ingredients) {
            result += num.getNum();
        }
        return result;
    }
}
