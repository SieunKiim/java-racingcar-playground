package car_race;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RaceTest {
    Race race;

    @BeforeEach
    void raceInit(){
        race = new Race("a,b,c", 5);
    }

    @Test
    void Race_객체_생성(){
        assertThat(race).isNotNull();
    }

    @Test
    void 레이스_시작(){
        race.doRace();
        Set<String> winners = race.getWinners();
        List<Car> cars = race.getCars();
        Integer highScore = race.getRecord().getHighScore();
        for (Car car : cars) {
            if (car.getPosition().equals(highScore)) {
                assertThat(winners.contains(car.getName())).isTrue();
            }
        }
    }

}
