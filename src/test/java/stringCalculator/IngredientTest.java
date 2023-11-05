package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngredientTest {

    @Test
    void Ingredient_클래스_생성_O(){
        Ingredient ingredient = new Ingredient("3");
        assertThat(ingredient).isNotNull();
    }

    @Test
    void Ingredient_클래스_생성_X_문자열(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> new Ingredient("a"));
        assertEquals("Ingredient validation fail", exception.getMessage());
    }

    @Test
    void Ingredient_클래스_생성_X_음수(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> new Ingredient("-4"));
        assertEquals("Ingredient validation fail", exception.getMessage());
    }
}