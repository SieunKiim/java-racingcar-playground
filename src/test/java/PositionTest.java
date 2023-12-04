import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test void Position_생성_Test(){
        Position position = new Position();
        assertThat(position).isNotNull();
    }

    @Test void 일치(){
        Position position = new Position();
        position.forward();
        Position moved = new Position(1);
        assertThat(moved).isEqualTo(position);
    }
}