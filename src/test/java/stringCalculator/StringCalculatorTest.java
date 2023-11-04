package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void 계산기_생성_테스트(){
        StringCalculator cal = new StringCalculator();
        assertThat(cal).isNotNull();
    }
}
