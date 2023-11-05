package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    StringCalculator cal;

    @BeforeEach
    void beforeEach() {
        cal = new StringCalculator(new StringParser());
    }


    @Test
    void 계산기_생성_테스트(){
        assertThat(cal).isNotNull();
    }

    @Test
    void Ingredients_합연산(){
        String s = "3,25:3:4,1";
        Integer result = cal.calculate(s);
        assertThat(result).isEqualTo(36);
    }
}
