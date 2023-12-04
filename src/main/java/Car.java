public class Car {
    private final Name name;
    private final Position  position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Position getPosition(){
        return this.position;
    }

    public Position move(int num){
        if (num >= 4) {
            position.forward();
        }
        return this.position;
    }
}
