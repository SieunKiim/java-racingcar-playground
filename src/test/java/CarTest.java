import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_생성(){
        Car car = new Car("name");
        assertThat(car).isNotNull();
    }

    @Test
    void 자동차_생성_실패(){
        IllegalArgumentException asdfbd = assertThrows(IllegalArgumentException.class,
                () -> new Car("asdfbd"));
        assertThat(asdfbd.getMessage()).isEqualTo("이름은 다섯글자 이하로 설정 가능합니다");
    }

    @Test
    void 자동차_이동(){
        Car car = new Car("sieun");
        car.move(4);
        Position position = new Position(1);
        assertThat(car.getPosition()).isEqualTo(position);
    }

    @Test
    void 자동차_이동_실패(){
        Car car = new Car("sieun");
        car.move(3);
        Position position = new Position(0);
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
