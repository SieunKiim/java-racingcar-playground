import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    public final int round;
    public final List<Car> cars;

    public final MovingStrategy ms;

    public Race(int round, List<String> carNames, MovingStrategy ms) {
        this.round = round;
        this.cars = carNames.stream().map(Car::new).collect(Collectors.toList());
        this.ms = ms;
    }

    public List<Name> doRace() {
        for (int i = 0; i < round; i++) {
            cars.forEach(c-> {
                c.move(ms);
                c.print();
            });
        }
        cars.sort(Car::compareTo);
        List<Car> winners = new ArrayList<>();
        winners.add(cars.get(cars.size()-1));
        for (int i = cars.size() - 2; i >= 0; i--) {
            if (winners.get(0).getPosition().equals(cars.get(i).getPosition())) {
                winners.add(cars.get(i));
            }
        }
        return winners.stream().map(Car::getCarName).collect(Collectors.toList());
    }
}
