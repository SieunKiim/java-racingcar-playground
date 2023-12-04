public class Dice implements Fuel {

    @Override
    public Integer consume() {
        return (int) (Math.random() * 10) + 1;
    }
}
