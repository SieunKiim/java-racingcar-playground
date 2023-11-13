package car_race;

public class Car {
    private final String name;
    private Integer position;

    public Car(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("이름이 없음");
        }
        if (!nameValidation(name)) {
            throw new RuntimeException("5글자 초과 이름");
        }
        this.name = name;
        this.position = 0;
    }

    private boolean nameValidation(String name){
        return name.length() <= 5;
    }

    public void move() {
        int i = getRandomNum();
        if (i >= 4) {
            position += 1;
        }
    }

    public Integer getPosition(){
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    private int getRandomNum() {
        return (int) ((Math.random() * 10000) % 10);
    }
}
