import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RaceTest {

    @Test
    void 레이스_생성(){
        Race race = new Race(5, Arrays.asList("a", "b", "c"), new MovingStrategy() {
            @Override
            public boolean movable() {
                return false;
            }
        });
        assertThat(race.cars.size()).isEqualTo(3);
    }

    @Test
    void 레이스_결과(){
        Race race = new Race(5, Arrays.asList("a", "b", "c"), new MovingStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });
        List<Name> names = race.doRace();
        assertThat(names.size()).isEqualTo(3);
    }
}
