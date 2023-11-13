package car_race;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car;

    @BeforeEach
    void init(){
        car = new Car("init");
    }
    @Test
    void 자동차_생성(){
        Car carInTest = new Car("name");
        assertThat(carInTest).isNotNull();
    }

    @Test
    void 자동차_생성_오류(){
        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> new Car("moreThanFive"));
        assertThat(exception.getMessage()).isEqualTo("5글자 초과 이름");
    }
}
