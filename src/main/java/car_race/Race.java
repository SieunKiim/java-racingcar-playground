package car_race;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Race {
    private final List<Car> cars;
    private Record record;


    public Race(String names, Integer round) {
        cars = new ArrayList<>();
        record = new Record();
        record.setRound(round);
        String[] split = names.split(",");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            Car car = new Car(s);
            cars.add(car);
        }
    }

    public void doRace() {
        int now = 0;
        while (now++ < record.getRound()) {
            doRound();
        }
    }

    private void doRound() {
        for (Car car : cars) {
            car.move();
        }
    }

    public Set<String> getWinners(){
        cars.sort(((o1, o2) -> o2.getPosition() - o1.getPosition()));
        int firstPrize = cars.get(0).getPosition();
        Set<String> output = new HashSet<>();
        for (Car car : cars) {
            winnerQualified(output, firstPrize, car);
        }
        record.setHighScore(firstPrize);
        return output;
    }

    private void winnerQualified(Set<String> set, Integer firstPrize, Car car) {
        if (Objects.equals(car.getPosition(), firstPrize)) {
            set.add(car.getName());
        }
    }

    public List<Car> getCars(){
        return this.cars;
    }

    public Record getRecord(){
        return this.record;
    }
}
