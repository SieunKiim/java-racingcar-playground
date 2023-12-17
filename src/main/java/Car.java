public class Car implements Comparable<Car>{
    private final Name name;
    private final Position  position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Name getCarName(){
        return this.name;
    }

    public Position getPosition(){
        return this.position;
    }

    public Position move(MovingStrategy ms){
        if (ms.movable()) {
            position.forward();
        }
        return this.position;
    }

    public void print(){
        this.toString();
    }

    @Override
    public String toString() {
        return name.toString() + " : " + position.toString();
    }


    @Override
    public int compareTo(Car o) {
        return position.compareTo(o.position);
    }
}
