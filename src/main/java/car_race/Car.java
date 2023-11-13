package car_race;

public class Car {
    private final String name;

    public Car(String name) {
        if (!nameValidation(name)) {
            throw new RuntimeException("5글자 초과 이름");
        }
        this.name = name;
    }

    private boolean nameValidation(String name){
        return name.length() <= 5;
    }
}
