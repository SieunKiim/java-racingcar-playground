package stringCalculator;



public class Ingredient {

    private final Integer num;

    public Ingredient(String s){
        validation(s);
        this.num = Integer.parseInt(s);
    }

    private void validation(String s) {
        if (!(isNumeric(s) && isPositive(s))) {
            throw new RuntimeException("Ingredient validation fail");
        }
    }

    private boolean isNumeric(String s){
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isPositive(String s) {
        int parseInt = Integer.parseInt(s);
        return parseInt >= 0;
    }

    public Integer getNum() {
        return this.num;
    }
}
